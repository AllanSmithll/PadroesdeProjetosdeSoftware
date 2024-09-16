package database;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Classe implementada usando o padrao de projeto <i>Singleton<i>, com o objetivo
 * de criar/compartilhar uma conexão com o banco de dados PostgreeSQL. 
 * Busca no diretorio local pelo arquivo
 * dbconfig.properties. Outro arquivo de configuracao pode ser fornecido, entretanto, deve
 * ser executado o metodo setFileConfig() antes de chamar o getInstance().
 * @author Alex Sandro
 * @since 12/03/2003
 * Versao 2.0 em 27/01/2015.
 * Adicionada a opcao de conexao atraves de arquivo de propriedade.
 */
public class DBConnect {
	/* Arquivo de Propriedades */
	private Properties table = null;
	
   /* Atributos utilizados para efetuar a conexao com o SGBD*/
	private String driver   = null;
	private String url      = null;
	private String database = null;
	private String user     = null;
	private String password = null;
	private static String fileConfig = "dbconfig.properties";

    /* Interface JDBC que manipula uma conexao com o banco */
    private Connection connection = null;
	/* Objeto para definição de um statement ao banco de dados */
	private Statement statement = null;
    /* instância de controle do singleton*/
	private static DBConnect singleton = null;
	
	/**
	 * Construtor privado da classe que realiza a conexao com o banco
	 * @param fileConfig O arquivo de configuração com os parâmetros de conexão ao SGBD
	 * @throws FileNotFoundException 
	 */
	private DBConnect( ) throws DBConnectionException {
		
		
		try {
			this.table = new Properties();
			FileInputStream inputFile = new FileInputStream( fileConfig );
            table.load( inputFile ); // load properties
            inputFile.close();
            
            this.driver = table.getProperty("driver");
            this.url = table.getProperty("url");
            this.database = table.getProperty("database");
            this.user = table.getProperty("user");
            this.password = table.getProperty("password");
			
			// A instrução a seguir pode mudar de acordo com o driver do SGBD utilizado
            Class.forName(this.driver);
			
		} catch (ClassNotFoundException e) {
			throw new DBConnectionException(e.getClass().getName()  + ": Erro na tentativa de carga do driver do SGBD " + e.getMessage());
			
		} catch (FileNotFoundException fnf ){
			throw new DBConnectionException(fnf.getClass().getName() + ": Arquivo de configuração das propriedades \" + fileConfig + \" não encontrado" );

		} catch (IOException ioe ){
			ioe.printStackTrace();
		}
	}
	
   /**
    * Metodo que obtem uma instancia unica que representa a conexao com o banco, com thread-safe
    * @return - uma instancia desta classe
 * @throws DBConnectionException 
    */
	public static synchronized DBConnect getInstance() throws DBConnectionException {
	    if (singleton == null) {
	        singleton = new DBConnect();
	    }
	    return singleton;
	}

   /**
    * M�todo que requisita acesso à conexao com o banco. O default é o autoCommit = True
    * @return - A conexao com o banco
    * @throws SQLException - Excecao que pode ser gerada em caso de falha na operacao
    */
	public Connection getConnection() throws SQLException {
		if (this.connection == null || this.connection.isClosed()) {
			this.connection = DriverManager.getConnection(this.url+this.database, this.user, this.password);
			this.connection.setAutoCommit(true);
		}
		return this.connection;
	}
	
	
   /**
    * Libera os recursos de banco de dados previamente alocados
    */
	public void disconnect() {
		if (connection != null) 
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				System.err.println(e);
			}
	}
	
	/**
	 * Retorna o result set referente à instrução SQL fornecida como argumento.
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	public ResultSet select(String query) throws SQLException{
		connection = this.getConnection();
        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery(query);
        
        return resultSet;      		
	}
	
	/**
	 * Retorna o status da execução de uma SQL query para INSERT, UPDATE ou DELETE
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	public int executeDMLStatment(String query) throws SQLException{
        statement = connection.createStatement();
        
        int result = statement.executeUpdate(query);
        
        return result;    		
	}
	
	
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		if (connection != null)
			connection.setAutoCommit(autoCommit);
	}
	
	/**
	 * Libera todos os recursos alocados para o Statement e connection
	 * @throws SQLException
	 */
	public void releaseResources() throws SQLException{
		if (statement != null) {
			statement.close();
			statement = null;			
		}
		if (connection != null) {
			disconnect();
			connection = null;
		}
		
	}
	
	/**
	 * Altera caminho/nome do arquivo de configura��o padr�o
	 * Tem que ser chamado antes de pedir a primeira instância do singleton
	 * @param fileConfig O arquivo de configura��o
	 */
	public static void setFileConfig(String fileConfig){
		DBConnect.fileConfig = fileConfig;
	}
	

}
