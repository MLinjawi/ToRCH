package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * connect to database class
 */
public class DataBaseConn { // private final String Driver = "com.mysql.jdbc.Driver";
							// private final String Driver = "com.mysql.jdbc.Driver";
	private final String Driver = "com.mysql.cj.jdbc.Driver";

	private final String ConnectionString = "jdbc:mysql://localhost/";
	// private final String ConnectionString =
	// "jdbc:mysql://localhost:3306/demo?useSSL=FALSE";
	private final String Database = "sample"; // "RobotCapabi";//
	private final String Username = "root";

	// private final String Password = "root";
	private final String Password = "12345678";

	// SELECT * FROM RobotCapabi.RobCab;

	/**
	 * Method connect To Database DB sample
	 * 
	 * @param no
	 * @return connection
	 * @author MLinjawi
	 */
	public Connection connectToDatabase() {
		Connection conn = null;
		try {
			Class.forName(Driver);

			conn = DriverManager.getConnection(ConnectionString + Database, Username, Password);

			conn.setAutoCommit(true);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * Method disconnect To Database DB sample
	 * 
	 * @param connection
	 * @return nothing
	 * @author MLinjawi
	 */
	public void disconnectFromDatabase(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
