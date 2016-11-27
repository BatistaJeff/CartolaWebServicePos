package br.uninove.cartolafc.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.uninove.cartola.dao.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
	public void testGetConnection() {
		try {
			Connection conn = new ConnectionFactory().getConnection();

			conn.close();

		} catch (SQLException e) {
			fail(e.getMessage());
		}
	}

}
