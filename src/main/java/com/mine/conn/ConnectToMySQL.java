package com.mine.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToMySQL {

	private static Connection conn = null;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/movie", "root", "linjie");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}

}
