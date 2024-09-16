package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.Funcionario;
import database.DBConnect;
import database.DBConnectionException;

public class FuncionarioDAO implements DAO<Funcionario> {
	
	
	private Connection conexao = null;
	private PreparedStatement ptmt = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public FuncionarioDAO() throws DBConnectionException, SQLException {
		conexao = (Connection) DBConnect.getInstance().getConnection();		
	}
	
	

	@Override
	public Funcionario get(long id) {
                			
        try {
        	String query = "SELECT idFunc,nome FROM funcionario WHERE idFunc = ?";
        	ptmt = conexao.prepareStatement(query); 
            ptmt.setInt(1, (int) id);
            rs = ptmt.executeQuery();

            Funcionario funcionario = new Funcionario(0,null);
			if( rs.next()) {
				funcionario.setId(rs.getInt(1));
				funcionario.setNome(rs.getString(2));
				return funcionario;
			} else            
				return null;
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Funcionario> getAll() {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        			
        try {
        	stmt = conexao.createStatement();  
			rs = stmt.executeQuery("SELECT idFunc,nome FROM funcionario");
			
			while( rs.next()) {
				funcionarios.add(new Funcionario(rs.getInt("idFunc"),rs.getString("nome")));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return funcionarios;
	}

	@Override
	public void save(Funcionario f) throws SQLException {
        String query = "INSERT INTO funcionario (idfunc, nome) VALUES (?,?)";
        ptmt = conexao.prepareStatement(query);
        ptmt.setInt(1, f.getId());
        ptmt.setString(2, f.getNome());
        ptmt.executeUpdate();
		
	}

	@Override
	public void update(Funcionario f) {
		/* TODO */
		try {
			String queryString = "UPDATE funcionario SET Nome=? WHERE idFunc=?";
			ptmt = conexao.prepareStatement(queryString);
			ptmt.setInt(2, f.getId());
			ptmt.setString(1, f.getNome());
			int updated = ptmt.executeUpdate();
			if (updated > 0)
				System.out.println("Registro alterado com sucesso");      
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}		
	}

	@Override
	public void delete(Funcionario f) {

		try {
			String queryString = "DELETE FROM funcionario WHERE idFunc=?";
			ptmt = conexao.prepareStatement(queryString);
			ptmt.setInt(1, f.getId());
			int deleted = ptmt.executeUpdate();
			if (deleted == 0)
				System.out.println("Registro removido com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}








}
