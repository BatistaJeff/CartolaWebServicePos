package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.uninove.cartola.dao.ConnectionFactory;
import br.uninove.cartola.dao.IStatusDao;
import br.uninove.cartola.model.Fechamento;
import br.uninove.cartola.model.Status;

public class StatusDaoTest {

	@Test
	public void testInsert() throws SQLException {
		Status result = new Status();
		Fechamento fechamento = new Fechamento();
		fechamento.setId(3);
		result.setRodada_atual(29);
		result.setStatus_mercado(1);
		result.setEsquema_default_id(4);
		result.setCartoleta_inicial(200);
		result.setMax_ligas_free(3);
		result.setMax_ligas_pro(1);
		result.setMax_ligas_matamata_free(5);
		result.setMax_ligas_matamata_pro(5);
		result.setMax_ligas_patrocinadas_free(2);
		result.setMax_ligas_patrocinadas_pro_num(2);
		result.setGame_over(false);
		result.setTimes_escalados(4642);
		result.setMercado_pos_rodada(true);
		result.setAviso("Aviso Padrão");
		result.setFechamento(fechamento);

		Connection conn = new ConnectionFactory().getConnection();

		IStatusDao<Status> dao = new StatusDao(conn);
		try {
			dao.insert(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.close();

	}

	// @Test
	// public void testupdate() throws SQLException {
	// Status result = new Status();
	// Fechamento fechamento = new Fechamento();
	// fechamento.setId(2);
	//
	// result.setStatus_mercado(1);
	// result.setEsquema_default_id(5);
	// result.setCartoleta_inicial(200);
	// result.setMax_ligas_free(2);
	// result.setMax_ligas_pro(5);
	// result.setMax_ligas_matamata_free(5);
	// result.setMax_ligas_matamata_pro(5);
	// result.setMax_ligas_patrocinadas_free(2);
	// result.setMax_ligas_patrocinadas_pro_num(2);
	// result.setGame_over(false);
	// result.setTimes_escalados(52464);
	// result.setMercado_pos_rodada(true);
	// result.setAviso("E um aviso de sistema");
	// result.setFechamento(fechamento);
	// result.setRodada_atual(28);
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IStatusDao<Status> dao = new StatusDao(conn);
	// try {
	// dao.update(result);
	// System.out.println(result);
	//
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// conn.close();
	//
	// }

	// @Test
	// public void testdelete() throws SQLException {
	// Object id = new Object();
	//
	// id = 28;
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IStatusDao<Status> dao = new StatusDao(conn);
	// try {
	// dao.delete(id);
	//
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// conn.close();
	//
	// }

	// @Test
	// public void testget() throws SQLException {
	//
	// Object id = new Object();
	// id = 2;
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IStatusDao<Status> dao = new StatusDao(conn);
	// try {
	// dao.get(id);
	//
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// conn.close();
	//
	// }

	//
	// @Test
	// public void testlist() throws SQLException {
	//
	// Connection conn = new ConnectionFactory().getConnection();
	//
	// IStatusDao<Status> dao = new StatusDao(conn);
	// try {
	// System.out.println(dao.list());
	//
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// conn.close();
	//
	// }
}
