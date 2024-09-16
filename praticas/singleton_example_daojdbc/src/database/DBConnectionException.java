package database;

public class DBConnectionException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DBConnectionException(String errorMessage) {
		super(errorMessage);
	}

}

