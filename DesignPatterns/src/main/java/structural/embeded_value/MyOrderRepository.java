package structural.embeded_value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyOrderRepository {
	private final String INSERT_ORDER = "INSERT INTO Orders (item, orderBy, city, state, pincode) VALUES (?, ?, ?, ?," +
			" ?)";

	public boolean insertOrder(MyOrder myOrder) throws Exception {
		boolean inserted = false;
		try (Connection connection = DriverManager.getConnection(MyDBConfig.CONNECTION_URL);) {
			PreparedStatement insertOrder = connection.prepareStatement(INSERT_ORDER);
			ShippingAddress shippingAddress = myOrder.getShippingAddress();
			connection.setAutoCommit(false);
			insertOrder.setString(1, myOrder.getItem());
			insertOrder.setString(2, myOrder.getOrderedBy());
			insertOrder.setString(3, shippingAddress.getCity());
			insertOrder.setString(4, shippingAddress.getState());
			insertOrder.setString(5, shippingAddress.getPinCode());

			var affectedRows = insertOrder.executeUpdate();
			if (affectedRows == 1) {
				System.out.println("Inserted successfully");
				inserted = true;
			} else {
				System.err.println("Could not insert " + myOrder);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inserted;
	}

	public static class MyDBConfig {
		static final String JDBC_DRIVER = "jdbc:sqlserver:";
		static final String CONNECTION_PORT = "1433";
		static final String HOST = "localhost";
		static final String DATABASE_FIELD = "database";
		static final String DATABASE_VALUE = "MySqlServerDatabase";
		static String USER_FIELD = "user";
		static String USER_VALUE = "deqart";
		static String PASSWORD_FIELD = "password";
		static String PASSWORD_VALUE = "J3_m3_conn3ct3";
		static String ENCRYPT_FIELD = "encrypt";
		static String ENCRYPT_VALUE = "false";
		static String TRUST_SERVER_CERTIFICATE_FIELD = "trustServerCertificate";
		static String TRUST_SERVER_CERTIFICATE_VALUE = "false";
		static String LOGIN_TIMEOUT_FIELD = "loginTimeout";
		static String LOGIN_TIMEOUT_VALUE = "30";
		static String DRIVER_AND_HOST = JDBC_DRIVER + "//" + HOST + ":" + CONNECTION_PORT + ";";
		static String DATABASE = DATABASE_FIELD + "=" + DATABASE_VALUE + ";";
		static String USER = USER_FIELD + "=" + USER_VALUE + "@" + HOST + ";";
		static String PASSWORD = PASSWORD_FIELD + "=" + PASSWORD_VALUE + ";";
		static String ENCRYPT = ENCRYPT_FIELD + "=" + ENCRYPT_VALUE + ";";
		static String SERVER_CERTIFICATE = TRUST_SERVER_CERTIFICATE_FIELD + "=" + TRUST_SERVER_CERTIFICATE_VALUE + ";";
		static String TIMEOUT = LOGIN_TIMEOUT_FIELD + "=" + LOGIN_TIMEOUT_VALUE + ";";
		public static String CONNECTION_URL =
				DRIVER_AND_HOST + DATABASE + USER + PASSWORD + ENCRYPT + SERVER_CERTIFICATE + TIMEOUT;
	}
}
