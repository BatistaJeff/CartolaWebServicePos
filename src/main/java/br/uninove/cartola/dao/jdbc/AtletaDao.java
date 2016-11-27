package br.uninove.cartola.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dao.IAtletaDao;
import br.uninove.cartola.model.Atleta;

public class AtletaDao implements IAtletaDao<Atleta> {

	private final String SQL_INSERT = "insert into atletas(nome, apelido, foto, preco_editorial) values(?,?,?,?)";

	private final String SQL_UPDATE = "update atletas set nome=?, apelido=?, foto=?, preco_editorial=? where id=?";

	private final String SQL_DELETE = "delete from atletas where id=?";

	private final String SQL_SELECT_BY_ID = "select *from atletas where id =?";

	private final String SQL_SELECT_ALL = "select *from atletas";

	public Connection conn;

	public AtletaDao(Connection conn) {
		this.conn = conn;

	}

	public void insert(Atleta model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
		preparedStatement.setString(1, model.getNome());
		preparedStatement.setString(2, model.getApelido());
		preparedStatement.setString(3, model.getFoto());
		preparedStatement.setInt(4, model.getPreco_editorial());
		preparedStatement.execute();
		preparedStatement.close();
	}

	public void update(Atleta model) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE);
		preparedStatement.setString(1, model.getNome());
		preparedStatement.setString(2, model.getApelido());
		preparedStatement.setString(3, model.getFoto());
		preparedStatement.setInt(4, model.getPreco_editorial());
		preparedStatement.setInt(5, model.getId());
		preparedStatement.execute();
		preparedStatement.close();

	}

	public void delete(Object id) throws Exception {

		PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE);
		preparedStatement.setInt(1, (Integer) id);
		preparedStatement.execute();
		preparedStatement.close();

	}

	public Atleta get(Object id) throws Exception {
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_BY_ID);
		preparedStatement.setInt(1, (Integer) id);
		
		ResultSet rs = (ResultSet) preparedStatement.executeQuery();
		Atleta atleta = null;
		
		if(rs.next()) {
			
			atleta = new Atleta();
	
			atleta.setId(rs.getInt("id"));
			atleta.setNome(rs.getString("nome"));
			atleta.setApelido(rs.getString("apelido"));
			atleta.setFoto(rs.getString("foto"));
			atleta.setPreco_editorial(rs.getInt("preco_editorial"));
	
		}
		rs.close();
		preparedStatement.close();

		return atleta;
	}

	private void If(boolean next) {
		// TODO Auto-generated method stub
		
	}

	public List<Atleta> list() throws Exception {

		PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_ALL);

		ResultSet rs = preparedStatement.executeQuery();

		List<Atleta> result = new ArrayList<>();
		while (rs.next()) {
			Atleta atleta = new Atleta();
			atleta.setId(rs.getInt("id"));
			atleta.setNome(rs.getString("nome"));
			atleta.setApelido(rs.getString("apelido"));
			atleta.setFoto(rs.getString("foto"));
			atleta.setPreco_editorial(rs.getInt("preco_editorial"));
			result.add(atleta);

		}
		rs.close();
		preparedStatement.close();
		return result;
	}

}
