package br.uninove.cartola.app;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.uninove.cartola.dao.ConnectionFactory;
import br.uninove.cartola.dao.IAtletaDao;
import br.uninove.cartola.dao.jdbc.AtletaDao;
import br.uninove.cartola.model.Atleta;

public class AtletaMockupAppTest {

	@Test
	public  void testMain() throws SQLException {
		
		Object id = new Object();

		id = 2;

		Connection conn = new ConnectionFactory().getConnection();

		IAtletaDao<Atleta> dao = new AtletaDao(conn);
		try {
			dao.get(id);
			System.out.println(dao.get(id));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
