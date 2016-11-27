package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dao.IDestaqueDao;
import br.uninove.cartola.model.Atleta;
import br.uninove.cartola.model.Destaque;

public class DestaqueDao implements IDestaqueDao<Destaque> {

	private final String SQL_INSERT = "insert into destaques(escalacoes,clube, escudo_clube, posicao, atleta) values(?,?,?,?,?)";

	private final String SQL_UPDATE = "update destaques set clube=?, escudo_clube=?, posicao=?, atleta=? where escalacoes=?";

	private final String SQL_DELETE = "delete from destaques where escalacoes=?";

	private final String SQL_SELECT_BY_ID = "select *from destaques where escalacoes =?";

	private final String SQL_SELECT_ALL = "select *from destaques";

	public Connection conn;

	public DestaqueDao(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Destaque model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
		preparedStatement.setInt(1, model.getEscalacoes());
		preparedStatement.setString(2, model.getClube());
		preparedStatement.setString(3, model.getEscudo_clube());
		preparedStatement.setString(4, model.getPosicao());
		preparedStatement.setInt(5, model.getAtleta().getId());
		preparedStatement.execute();
		preparedStatement.close();

	}

	@Override
	public void update(Destaque model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE);

		preparedStatement.setString(1, model.getClube());
		preparedStatement.setString(2, model.getEscudo_clube());
		preparedStatement.setString(3, model.getPosicao());
		preparedStatement.setInt(4, model.getAtleta().getId());
		preparedStatement.setInt(5, model.getEscalacoes());
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
	public Destaque get(Object id) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_BY_ID);

		ResultSet rs = preparedStatement.executeQuery();

		Destaque destaque = null;
		Atleta atleta = null;
		if(rs.next()) {
		
			destaque = new Destaque();
			atleta = new Atleta();
			
			atleta.setId(rs.getInt("atleta"));
			destaque.setEscalacoes(rs.getInt("escalacoes"));
			destaque.setClube(rs.getString("clube"));
			destaque.setEscudo_clube(rs.getString("escudo_clube"));
			destaque.setPosicao(rs.getString("posicao"));
			destaque.setAtleta(atleta);
		}

		rs.close();
		preparedStatement.close();

		return destaque;
	}

	@Override
	public List<Destaque> list() throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_ALL);

		ResultSet rs = preparedStatement.executeQuery();
		List<Destaque> result = new ArrayList<>();
		while (rs.next()) {
			Destaque destaque = new Destaque();
			Atleta atleta = new Atleta();
			atleta.setId(rs.getInt("atleta"));
			destaque.setEscalacoes(rs.getInt("escalacoes"));
			destaque.setClube(rs.getString("clube"));
			destaque.setEscudo_clube(rs.getString("escudo_clube"));
			destaque.setPosicao(rs.getString("posicao"));
			destaque.setAtleta(atleta);
			result.add(destaque);

		}
		rs.close();
		preparedStatement.close();
		return result;
	}

}
