package com.payroll.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.Statement;

public class ConnectionUtil {

	/**
	 * this method is going to get connection
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		String url = "jdbc:mysql://murugantraining-kvcet.cutteijb503y.ap-south-1.rds.amazonaws.com/madhu_db";
		String username = "admin";
		String password = "vicky2207";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException("Unable to connect db");
		}
		return connection;
	}

	/**
	 * This method will close connection resources
	 */
	public static void close(Statement statement, Connection connection) {
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
