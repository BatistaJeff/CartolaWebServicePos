package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.uninove.cartola.dao.ConnectionFactory;
import br.uninove.cartola.dao.IAtletaDao;
import br.uninove.cartola.dao.IClubeDao;
import br.uninove.cartola.model.Atleta;
import br.uninove.cartola.model.Clube;
import br.uninove.cartola.model.Escudo;

public class ClubeDaoTest {

	// @Test
	// public void testInsert() throws SQLException {
	// Clube clube = new Clube();
	// Escudo escudo = new Escudo();
	// escudo.setId(19);
	// clube.setEscudo_id(escudo);
	// clube.setNome("teste");
	// clube.setAbreviacao("abr");
	// clube.setPosicao(5);
	// // clube.setEscudo(escudo);
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IClubeDao<Clube> dao = new ClubeDao(conn);
	// try {
	// dao.insert(clube);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	// @Test
	// public void testList() throws SQLException {
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IClubeDao<Clube> dao = new ClubeDao(conn);
	// try {
	// dao.list();
	// System.out.println(dao.list());
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

	@Test
	public void testget() throws SQLException {
		Object id = new Object();
		id = 798;
		Connection conn = new ConnectionFactory().getConnection();

		IClubeDao<Clube> dao = new ClubeDao(conn);
		try {
			dao.get(id);
			System.out.println(dao.list());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
