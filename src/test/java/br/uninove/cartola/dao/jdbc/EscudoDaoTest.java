package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.uninove.cartola.dao.ConnectionFactory;
import br.uninove.cartola.dao.IEscudoDao;
import br.uninove.cartola.model.Escudo;

public class EscudoDaoTest {

	// @Test
	// public void testInsert() throws SQLException {
	// Escudo escudo = new Escudo();
	//
	// escudo.setTamanho_60x60("grandes");
	// escudo.setTamanho_45x45("medio");
	// escudo.setTamanho_30x30("pequeno");
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IEscudoDao<Escudo> dao = new EscudoDao(conn);
	// try {
	// dao.insert(escudo);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// @Test
	// public void testUpdate() throws SQLException {
	// Escudo escudo = new Escudo();
	//
	// escudo.setTamanho_60x60("Maiores");
	// escudo.setTamanho_45x45("Medianos");
	// escudo.setTamanho_30x30("Pequenos");
	// escudo.setId(16);
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IEscudoDao<Escudo> dao = new EscudoDao(conn);
	// try {
	// dao.update(escudo);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// @Test
	// public void testDelete() throws SQLException {
	// Object obj = new Object();
	//
	// obj = ;
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IEscudoDao<Escudo> dao = new EscudoDao(conn);
	//
	// try {
	// dao.delete(obj);
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
	// id = 17;
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IEscudoDao<Escudo> dao = new EscudoDao(conn);
	//
	// try {
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

		IEscudoDao<Escudo> dao = new EscudoDao(conn);

		try {
			System.out.println(dao.list());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
