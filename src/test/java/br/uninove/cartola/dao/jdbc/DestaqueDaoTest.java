package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.uninove.cartola.dao.ConnectionFactory;
import br.uninove.cartola.dao.IDestaqueDao;
import br.uninove.cartola.model.Atleta;
import br.uninove.cartola.model.Destaque;

public class DestaqueDaoTest {

	// @Test
	// public void testInsert() throws SQLException {
	// Destaque destaque = new Destaque();
	// Atleta atleta = new Atleta();
	// atleta.setAtleta_id(9);
	// destaque.setAtleta(atleta);
	// destaque.setClube("Cruz");
	// destaque.setEscalacoes(54);
	// destaque.setEscudo_clube("jdjdj");
	// destaque.setPosicao("fsdfsdf");
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IDestaqueDao<Destaque> dao = new DestaqueDao(conn);
	// try {
	// dao.insert(destaque);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// conn.close();
	//
	// }

	// @Test
	// public void testList() throws SQLException {
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IDestaqueDao<Destaque> dao = new DestaqueDao(conn);
	// try {
	// System.out.println(dao.list());
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

	// @Test
	// public void testdelete() throws SQLException {
	//
	// Object id = new Object();
	// id = 54;
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IDestaqueDao<Destaque> dao = new DestaqueDao(conn);
	// try {
	// dao.delete(id);
	// System.out.println(id);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

	@Test
	public void update() throws SQLException {

		Destaque destaque = new Destaque();
		Atleta atleta = new Atleta();
		atleta.setId(9);
		destaque.setClube("Car");
		destaque.setEscalacoes(54);
		destaque.setEscudo_clube("");
		destaque.setPosicao("Goleiro");
		destaque.setAtleta(atleta);
	
		Connection conn = new ConnectionFactory().getConnection();

		IDestaqueDao<Destaque> dao = new DestaqueDao(conn);
		try {
			dao.update(destaque);
			System.out.println(destaque);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
