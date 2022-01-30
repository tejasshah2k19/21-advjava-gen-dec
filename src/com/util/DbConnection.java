package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void getConnection() {

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5434/projectdefination";
		String userName = "postgres";
		String password = "root";

		try {
			// load driver
			Class.forName(driver);

			// jdbc api open connection
			Connection con = DriverManager.getConnection(url, userName, password);

			if (con == null) {
				System.out.println("db not connected");
			} else {
				System.out.println("db connected");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		getConnection();

	}
}
