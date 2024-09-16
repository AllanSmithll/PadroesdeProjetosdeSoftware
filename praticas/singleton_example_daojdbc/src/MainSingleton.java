import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dao.FuncionarioDAO;
import database.DBConnect;
import database.DBConnectionException;
import model.Funcionario;

public class MainSingleton {
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static String readData() throws IOException {
		return reader.readLine();
	}
	
	public static void printData(ResultSet rs) throws SQLException {
		// Obtendo os nomes das colunas retornadas e exibindo na tela
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for( int i=1; i <= columnCount; i++ ) {
			  String column = rsmd.getColumnName(i);
			  System.out.print(column + "\t");				
		}
		System.out.println();
		
		// iterando pelos dados retornados
		while( rs.next()){
			System.out.print(rs.getInt(1));
			System.out.println("\t"+rs.getString(2));
		}


	}

	public static void main(String[] args) {
		
		Connection con;
		Statement st;
		ResultSet rs;
		
		DBConnect sgbd = null, sgbd1 = null, sgbd2 = null;
				
		try {
			sgbd  = DBConnect.getInstance();
			sgbd1 = DBConnect.getInstance();
			sgbd2 = DBConnect.getInstance();
			
			System.out.println("Realizando o teste de instância única: ");
			System.out.println("Referências sgbd1, sgbd2 e sgbd3 :::::::::::::::::::::");
	        // Teste de identidade de objetos
	        if (sgbd == sgbd1 && sgbd1 == sgbd2) {
	            // Print statement
	            System.out.println(
	                "Os 3 objetos apontam para a mesma localizacao na memoria");
	        }
	  
	        else {
	            // Print statement
	            System.out.println(
	                "Os 3 objetos NÃO apontam para a mesma localizacao na memoria\"");
	        }
	        System.out.println();
			
	        // Obtendo uma conexão com o SGBD e preparando para enviar um SELECT
			String query = "SELECT * FROM funcionario LIMIT 10";
			
			rs = sgbd.select(query);
									
			System.out.println("Recuperando dados da tabela FUNCIONARIO:");
			// Obtendo os nomes das colunas retornadas e exibindo na tela
			printData(rs);
			
			System.out.println();
			System.out.println("Realizando CRUD com o DAO");
			System.out.println("==============================================");
			
			// Criando o DAO para persistir o objeto funcionário
			FuncionarioDAO funcDao = new FuncionarioDAO();
			System.out.println("metodo getAll()");
			List<Funcionario> funcionario = funcDao.getAll();
			for (Funcionario f : funcionario) {
				System.out.println(f);
			}

			System.out.println("metodo update()");
			Funcionario func = new Funcionario(1,"Alex Cunha");
			funcDao.update(func);
			
			System.out.println("metodo get()");
			func = funcDao.get(1);
			System.out.println(func);
			
			

			while(true) {
				System.out.println("Digite os dados do funcionário para inclusao no Banco de Dados (0 para sair)");
				
				System.out.print("Id: ");
				int id = Integer.parseInt(readData());
				if (id == 0)
					break;
				
				System.out.print("Nome: ");
				String nome = readData();
								
				// Criando um objeto funcionário
				func = new Funcionario( id, nome);

				//add
				funcDao.save(func);
			}
			
			
			
			
			// Obtendo os nomes das colunas retornadas e exibindo na tela
			rs = sgbd.select(query);
			printData(rs);
			
			rs.close();	
		} catch (DBConnectionException dbe) {
			System.out.println(dbe.getMessage());
		} catch (SQLException sqle) {
			System.err.println("Erro na obtencao da conexao: " + sqle.getMessage());
	
		} catch (IOException e) {
			// Erro na leitura de dados
			e.printStackTrace();
		} finally {
			if (sgbd != null)
				try {
					sgbd.releaseResources();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}


	}

}
