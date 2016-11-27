package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dao.IEscudoDao;
import br.uninove.cartola.model.Escudo;

public class EscudoDao implements IEscudoDao<Escudo> {

	private final String SQL_INSERT = "insert into escudos(tamanho_60x60, tamanho_45x45,tamanho_30x30) values(?,?,?)";

	private final String SQL_UPDATE = "update escudos set tamanho_60x60=?, tamanho_45x45=?, tamanho_30x30=? where id=?";

	private final String SQL_DELETE = "delete from escudos where id=?";

	private final String SQL_SELECT_BY_ID = "select *from escudos where id =?";

	private final String SQL_SELECT_ALL = "select *from escudos";

	public Connection conn;

	public EscudoDao(Connection conn) {
		this.conn = conn;

	}

	@Override
	public void insert(Escudo model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
		preparedStatement.setString(1, model.getTamanho_60x60());
		preparedStatement.setString(2, model.getTamanho_45x45());
		preparedStatement.setString(3, model.getTamanho_30x30());
		preparedStatement.execute();
		preparedStatement.close();

	}

	@Override
	public void update(Escudo model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE);
		preparedStatement.setString(1, model.getTamanho_60x60());
		preparedStatement.setString(2, model.getTamanho_45x45());
		preparedStatement.setString(3, model.getTamanho_30x30());
		preparedStatement.setInt(4, model.getId());
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
	public Escudo get(Object id) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_BY_ID);
		preparedStatement.setInt(1, (Integer) id);
		ResultSet rs = preparedStatement.executeQuery();

		Escudo escudo = null;

		if(rs.next()) {
			escudo = new Escudo();
			
			escudo.setId(rs.getInt("id"));
			escudo.setTamanho_60x60(rs.getString("tamanho_60x60"));
			escudo.setTamanho_45x45(rs.getString("tamanho_45x45"));
			escudo.setTamanho_30x30(rs.getString("tamanho_30x30"));
		}
		preparedStatement.close();
		rs.close();
		
		return escudo;
	}

	@Override
	public List<Escudo> list() throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_ALL);

		ResultSet rs = preparedStatement.executeQuery();

		List<Escudo> result = new ArrayList<>();

		while (rs.next()) {
			Escudo escudo = new Escudo();
			escudo.setId(rs.getInt("id"));
			escudo.setTamanho_60x60(rs.getString("tamanho_60x60"));
			escudo.setTamanho_45x45(rs.getString("tamanho_45x45"));
			escudo.setTamanho_30x30(rs.getString("tamanho_30x30"));
			result.add(escudo);
		}

		preparedStatement.close();
		return result;
	}
}
