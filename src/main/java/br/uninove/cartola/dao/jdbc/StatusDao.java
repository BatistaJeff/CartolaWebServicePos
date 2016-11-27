package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dao.IStatusDao;
import br.uninove.cartola.model.Fechamento;
import br.uninove.cartola.model.Status;

public class StatusDao implements IStatusDao<Status> {

	private final String SQL_INSERT = "insert into status(rodada_atual,status_mercado,esquema_default_id, cartoleta_inicial,max_ligas_free, max_ligas_pro,max_ligas_matamata_free,max_ligas_matamata_pro,max_ligas_patrocinadas_free,max_ligas_patrocinadas_pro_num,game_over,times_escalados,mercado_pos_rodada,aviso,fechamento) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	private final String SQL_UPDATE = "update status set status_mercado=?, esquema_default_id=?, cartoleta_inicial=?, max_ligas_free=?, max_ligas_pro=?, max_ligas_matamata_free=?, max_ligas_matamata_pro=?, max_ligas_patrocinadas_free=?, max_ligas_patrocinadas_pro_num=?, game_over=?, times_escalados=?, mercado_pos_rodada=?, aviso=?, fechamento=? where rodada_atual=?";

	private final String SQL_DELETE = "delete from status where rodada_atual=?";

	private final String SQL_SELECT_BY_ID = "select *from status where rodada_atual=?";

	private final String SQL_SELECT_ALL = "select *from status";

	public Connection conn;

	public StatusDao(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Status model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
		preparedStatement.setInt(1, model.getRodada_atual());
		preparedStatement.setInt(2, model.getStatus_mercado());
		preparedStatement.setInt(3, model.getEsquema_default_id());
		preparedStatement.setInt(4, model.getCartoleta_inicial());
		preparedStatement.setInt(5, model.getMax_ligas_free());
		preparedStatement.setInt(6, model.getMax_ligas_pro());
		preparedStatement.setInt(7, model.getMax_ligas_matamata_free());
		preparedStatement.setInt(8, model.getMax_ligas_matamata_pro());
		preparedStatement.setInt(9, model.getMax_ligas_patrocinadas_free());
		preparedStatement.setInt(10, model.getMax_ligas_patrocinadas_pro_num());
		preparedStatement.setBoolean(11, model.isGame_over());
		preparedStatement.setInt(12, model.getTimes_escalados());
		preparedStatement.setBoolean(13, model.isMercado_pos_rodada());
		preparedStatement.setString(14, model.getAviso());
		preparedStatement.setInt(15, model.getFechamento().getId());

		preparedStatement.execute();
		preparedStatement.close();

	}

	@Override
	public void update(Status model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE);
		//
		preparedStatement.setInt(1, model.getStatus_mercado());
		preparedStatement.setInt(2, model.getEsquema_default_id());
		preparedStatement.setInt(3, model.getCartoleta_inicial());
		preparedStatement.setInt(4, model.getMax_ligas_free());
		preparedStatement.setInt(5, model.getMax_ligas_pro());
		preparedStatement.setInt(6, model.getMax_ligas_matamata_free());
		preparedStatement.setInt(7, model.getMax_ligas_matamata_pro());
		preparedStatement.setInt(8, model.getMax_ligas_patrocinadas_free());
		preparedStatement.setInt(9, model.getMax_ligas_patrocinadas_pro_num());
		preparedStatement.setBoolean(10, model.isGame_over());
		preparedStatement.setInt(11, model.getTimes_escalados());
		preparedStatement.setBoolean(12, model.isMercado_pos_rodada());
		preparedStatement.setString(13, model.getAviso());
		preparedStatement.setInt(14, model.getFechamento().getId());
		preparedStatement.setInt(15, model.getRodada_atual());

		preparedStatement.execute();
		preparedStatement.close();

	}

	@Override
	public void delete(Object id) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE);

		preparedStatement.setInt(1, (Integer) id);
		preparedStatement.execute();
		preparedStatement.close();
	}

	@Override
	public Status get(Object id) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_BY_ID);
		preparedStatement.setInt(1, (Integer) id);
		ResultSet rs = preparedStatement.executeQuery();

		Status status = null;
		Fechamento fechamento = null;
		
		if(rs.next()){
			
			status = new Status();
			fechamento = new Fechamento();
			
			status.setAviso(rs.getString("aviso"));
			status.setFechamento(fechamento);
			status.setCartoleta_inicial(rs.getInt("cartoleta_inicial"));
			status.setEsquema_default_id(rs.getInt(rs.getInt("esquema_default")));
			status.setGame_over(rs.getBoolean("game_over"));
			status.setMax_ligas_free(rs.getInt("max_ligas_free"));
			status.setMax_ligas_matamata_free(rs.getInt("max_ligas_matamata_free"));
			status.setMax_ligas_matamata_pro(rs.getInt("max_ligas_matamata_pro"));
			status.setMax_ligas_patrocinadas_free(rs.getInt("max_ligas_patrocinadas_free"));
			status.setMax_ligas_patrocinadas_pro_num(rs.getInt("max_ligas_patrocinadas_pro_num"));
			status.setMax_ligas_pro(rs.getInt("max_ligas_pro"));
			status.setMercado_pos_rodada(rs.getBoolean("mercado_pos_rodada"));
			status.setStatus_mercado(rs.getInt("status_mercado"));
			status.setRodada_atual(rs.getInt("rodada_atual"));
			status.setTimes_escalados(rs.getInt("times_escalados"));
			
		}
		preparedStatement.close();
		rs.close();
		
		return status;
	}

	@Override
	public List<Status> list() throws Exception {

		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_ALL);

		ResultSet rs = preparedStatement.executeQuery();

		List<Status> result = new ArrayList<>();
		while (rs.next()) {
			Status status = new Status();
			Fechamento fechamento = new Fechamento();
			fechamento.setId(rs.getInt("fechamento"));
			status.setRodada_atual(rs.getInt("rodada_atual"));
			status.setStatus_mercado(rs.getInt("status_mercado"));
			status.setEsquema_default_id(rs.getInt("esquema_default_id"));
			status.setCartoleta_inicial(rs.getInt("cartoleta_inicial"));
			status.setMax_ligas_free(rs.getInt("max_ligas_free"));
			status.setMax_ligas_pro(rs.getInt("max_ligas_pro"));
			status.setMax_ligas_matamata_free(rs.getInt("max_ligas_matamata_free"));
			status.setMax_ligas_matamata_pro(rs.getInt("max_ligas_matamata_pro"));
			status.setMax_ligas_patrocinadas_free(rs.getInt("max_ligas_patrocinadas_free"));
			status.setMax_ligas_patrocinadas_pro_num(rs.getInt("max_ligas_patrocinadas_pro_num"));
			status.setGame_over(rs.getBoolean("game_over"));
			status.setTimes_escalados(rs.getInt("times_escalados"));
			status.setMercado_pos_rodada(rs.getBoolean("mercado_pos_rodada"));
			status.setAviso(rs.getString("aviso"));
			status.setFechamento(fechamento);
			result.add(status);

		}

		return result;
	}
}
