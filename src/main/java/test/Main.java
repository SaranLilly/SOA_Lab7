package test;

import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Main {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/soa";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";
	static Connection dbConnection = null;
	static Statement statement = null;
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			try {
//				System.out.println("Customer.dat is created at: " + new File("Customer.dat").getAbsolutePath());
				
				Client client = Client.create();
				WebResource webResource = client.resource("http://localhost:8092/hellohibernate/rest/services/customers/A");
				ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
				if (response.getStatus() != 200) {
					throw new RuntimeException("Failed : HTTP errorcode : " + response.getStatus());
				}
				String output = response.getEntity(String.class);
				System.out.println("Output from Server .... \n");
				System.out.println(output);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//	public static void main(String[] args) throws SQLException {
//// TODO Auto-generated method stub
//		String insertTableSQL = "INSERT INTO CUSTOMER" + "(Name) " + "VALUES" + "('HelloHibernate')";
//		dbConnection = getDBConnection();
//		statement = (Statement) dbConnection.createStatement();
//		statement.executeUpdate(insertTableSQL);
//	}
//
//	private static Connection getDBConnection() {
//		Connection dbConnection = null;
//		try {
//			Class.forName(DB_DRIVER);
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			dbConnection = (Connection) DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
//			return dbConnection;
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}
//		return dbConnection;
//	}
}
