package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.uninove.cartola.dao.ConnectionFactory;
import br.uninove.cartola.dao.IAtletaDao;
import br.uninove.cartola.model.Atleta;

public class AtletaDaoTest {

	// @Test
	// public void testInsert() throws SQLException {
	// Atleta atleta = new Atleta();
	// atleta.setNome("Drac");
	// atleta.setApelido("Dr");
	// atleta.setFoto("dfsdfsdf;./f/sdf/sdfsdfsdfsd/fsdfsd/f");
	// atleta.setPreco_editorial(100);
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IAtletaDao<Atleta> dao = new AtletaDao(conn);
	//
	// try {
	// dao.insert(atleta);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }
	//
	// @Test
	// public void testUpdate() throws SQLException {
	//
	// Atleta atleta = new Atleta();
	//
	// atleta.setNome("Diego");
	// atleta.setApelido("Canuto");
	// atleta.setFoto("fdsfdfsdfs21");
	// atleta.setPreco_editorial(50);
	// atleta.setAtleta_id(2);
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IAtletaDao<Atleta> dao = new AtletaDao(conn);
	//
	// try {
	// dao.update(atleta);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	// @Test
	// public void testDelete() throws SQLException {
	//
	// Object id = new Object();
	//
	// id = 3;
	// // atleta.setAtleta_id(3);
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IAtletaDao<Atleta> dao = new AtletaDao(conn);
	//
	// try {
	// dao.delete(id);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }
	//
	// @Test
	// public void testGet() throws SQLException {
	//
	// Object id = new Object();
	//
	// id = 1;
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IAtletaDao<Atleta> dao = new AtletaDao(conn);
	//
	// try {
	// // dao.get(id);
	// System.out.println(dao.get(id));
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }
	//
	@Test
	public void testList() throws SQLException {

		Connection conn = new ConnectionFactory().getConnection();

		IAtletaDao<Atleta> dao = new AtletaDao(conn);
		try {
			// dao.list();
			System.out.println(dao.list());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
