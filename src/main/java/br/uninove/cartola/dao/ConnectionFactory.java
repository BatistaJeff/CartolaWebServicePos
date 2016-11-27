package br.uninove.cartola.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.uninove.cartola.app.Resource;

public class ConnectionFactory {

	public Connection getConnection() throws SQLException {

		System.out.println("Conectando ao banco");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection result = DriverManager.getConnection(

				Resource.getDbUrl(), Resource.getDbUser(), Resource.getDbPwd()

		);

		return result;

	}

}
