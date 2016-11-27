package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dao.IClubeDao;
import br.uninove.cartola.model.Clube;
import br.uninove.cartola.model.Escudo;

public class ClubeDao implements IClubeDao<Clube> {

	private final String SQL_INSERT = "insert into clubes(nome, abreviacao, posicao, escudo) values(?,?,?,?)";

	private final String SQL_UPDATE = "update clubes set nome=?, abreviacao=?, posicao=?, escudo=? where id=?";

	private final String SQL_DELETE = "delete from clubes where id=?";

	private final String SQL_SELECT_BY_ID = "select *from clubes where id =?";

	private final String SQL_SELECT_ALL = "select *from clubes";

	public Connection conn;

	public ClubeDao(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Clube model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
		preparedStatement.setString(1, model.getNome());
		preparedStatement.setString(2, model.getAbreviacao());
		preparedStatement.setInt(3, model.getPosicao());
		preparedStatement.setInt(4, model.getEscudo_id().getId());
		preparedStatement.execute();
		preparedStatement.close();
	}

	@Override
	public void update(Clube model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE);
		preparedStatement.setString(1, model.getNome());
		preparedStatement.setString(2, model.getAbreviacao());
		preparedStatement.setInt(3, model.getPosicao());
		preparedStatement.setInt(4, model.getEscudo_id().getId());
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
	public Clube get(Object id) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_BY_ID);
		preparedStatement.setInt(1, (Integer) id);
		
		ResultSet rs = preparedStatement.executeQuery();
		
		Clube clube = null;
		Escudo escudo = null;
		
		if(rs.next()) {
		
			clube = new Clube();
			escudo = new Escudo();
			
			escudo.setId(rs.getInt("id"));
	
			clube.setId(rs.getInt("id"));
			clube.setNome(rs.getString("nome"));
			clube.setAbreviacao(rs.getString("abreviacao"));
			clube.setPosicao(rs.getInt("posicao"));
			clube.setEscudo_id(escudo);
			
		}
		rs.close();
		preparedStatement.close();

		return clube;
	}

	@Override
	public List<Clube> list() throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_ALL);

		ResultSet rs = preparedStatement.executeQuery();
		List<Clube> result = new ArrayList<>();
		while (rs.next()) {
			Clube clube = new Clube();
			Escudo escudo = new Escudo();
			escudo.setId(rs.getInt("id"));
			clube.setId(rs.getInt("id"));
			clube.setNome(rs.getString("nome"));
			clube.setAbreviacao(rs.getString("abreviacao"));
			clube.setPosicao(rs.getInt("posicao"));
			clube.setEscudo_id(escudo);
			result.add(clube);
		}

		rs.close();
		preparedStatement.close();
		return result;
	}

}
