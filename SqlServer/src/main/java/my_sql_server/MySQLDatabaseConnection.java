package my_sql_server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDatabaseConnection {
	public static void main(String[] args) {
		String connectionUrl = "jdbc:sqlserver://localhost:1433" + ";" +
				"database=" + "MySqlServerDatabase" + ";" +
				"user=" + "deqart@localhost" + ";" +
				"password=" + "J3_m3_conn3ct3" + ";" +
				"encrypt=" + "false" + ";" +
				"trustServerCertificate=" + "false" + ";" +
				"loginTimeout=" + "30" + ";";
		try(Connection connection = DriverManager.getConnection(connectionUrl);){
			// lalala
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
