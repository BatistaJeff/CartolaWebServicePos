package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dao.IFechamentoDao;
import br.uninove.cartola.model.Fechamento;

public class FechamentoDao implements IFechamentoDao<Fechamento> {

	private final String SQL_INSERT = "insert into fechamentos(dia, mes, ano, hora, minuto, timestamp) values(?,?,?,?,?,?)";

	private final String SQL_UPDATE = "update fechamentos set dia=?, mes=?, ano=?,hora=?, minuto=?, timestamp=? where id=?";

	private final String SQL_DELETE = "delete from fechamentos where id=?";

	private final String SQL_SELECT_BY_ID = "select *from fechamentos where id =?";

	private final String SQL_SELECT_ALL = "select *from fechamentos";

	public Connection conn;

	public FechamentoDao(Connection conn) {
		this.conn = conn;

	}

	@Override
	public void insert(Fechamento model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
		preparedStatement.setInt(1, model.getDia());
		preparedStatement.setInt(2, model.getMes());
		preparedStatement.setInt(3, model.getAno());
		preparedStatement.setInt(4, model.getHora());
		preparedStatement.setInt(5, model.getMinuto());
		preparedStatement.setInt(6, model.getTimestamp());
		preparedStatement.execute();
		preparedStatement.close();

	}

	@Override
	public void update(Fechamento model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE);
		preparedStatement.setInt(1, model.getDia());
		preparedStatement.setInt(2, model.getMes());
		preparedStatement.setInt(3, model.getAno());
		preparedStatement.setInt(4, model.getHora());
		preparedStatement.setInt(5, model.getMinuto());
		preparedStatement.setInt(6, model.getTimestamp());
		preparedStatement.setInt(7, model.getId());
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
	public Fechamento get(Object id) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_BY_ID);
		preparedStatement.setInt(1, (Integer) id);
		ResultSet rs = preparedStatement.executeQuery();

		Fechamento fechamento = null;

		while (rs.next()) {
			fechamento = new Fechamento();
			
			fechamento.setId(rs.getInt("id"));
			fechamento.setDia(rs.getInt("dia"));
			fechamento.setMes(rs.getInt("mes"));
			fechamento.setAno(rs.getInt("ano"));
			fechamento.setHora(rs.getInt("hora"));
			fechamento.setMinuto(rs.getInt("minuto"));
			fechamento.setTimestamp(rs.getInt("timestamp"));

		}
		rs.close();
		preparedStatement.close();
		
		return fechamento;
	}

	@Override
	public List<Fechamento> list() throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_ALL);
		ResultSet rs = preparedStatement.executeQuery();

		List<Fechamento> result = new ArrayList<>();

		while (rs.next()) {
			Fechamento fechamento = new Fechamento();

			fechamento.setId(rs.getInt("id"));
			fechamento.setDia(rs.getInt("dia"));
			fechamento.setMes(rs.getInt("mes"));
			fechamento.setAno(rs.getInt("ano"));
			fechamento.setHora(rs.getInt("hora"));
			fechamento.setMinuto(rs.getInt("minuto"));
			fechamento.setTimestamp(rs.getInt("timestamp"));
			result.add(fechamento);
		}
		rs.close();
		preparedStatement.close();

		return result;
	}

}
