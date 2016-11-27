package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.uninove.cartola.dao.ConnectionFactory;
import br.uninove.cartola.dao.IFechamentoDao;
import br.uninove.cartola.model.Fechamento;

public class FechamentoDaoTest {

	// @Test
	// public void testInsert() throws SQLException {
	// Fechamento fechamento = new Fechamento();
	// fechamento.setDia(12);
	// fechamento.setMes(2);
	// fechamento.setAno(2016);
	// fechamento.setHora(23);
	// fechamento.setMinuto(56);
	// fechamento.setTimestamp(1231658446);
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IFechamento<Fechamento> dao = new FechamentoDao(conn);
	//
	// try {
	// dao.insert(fechamento);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

	// @Test
	// public void testUpdate() throws SQLException {
	// Fechamento fechamento = new Fechamento();
	// fechamento.setDia(13);
	// fechamento.setMes(3);
	// fechamento.setAno(2016);
	// fechamento.setHora(24);
	// fechamento.setMinuto(50);
	// fechamento.setTimestamp(45564213);
	// fechamento.setId(1);
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IFechamento<Fechamento> dao = new FechamentoDao(conn);
	//
	// try {
	// dao.update(fechamento);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// @Test
	// public void testDelete() throws SQLException {
	// Object id = new Object();
	//
	// id = 1;
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IFechamento<Fechamento> dao = new FechamentoDao(conn);
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
	// Object id = new Object();
	// id = 2;
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IFechamento<Fechamento> dao = new FechamentoDao(conn);
	//
	// try {
	// dao.get(id);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	@Test
	public void testList() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();

		IFechamentoDao<Fechamento> dao = new FechamentoDao(conn);

		try {
			System.out.println(dao.list());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
