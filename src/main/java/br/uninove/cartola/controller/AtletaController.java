package br.uninove.cartola.controller;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.uninove.cartola.dao.ConnectionFactory;
import br.uninove.cartola.dao.IAtletaDao;
import br.uninove.cartola.dao.jdbc.AtletaDao;
import br.uninove.cartola.model.Atleta;

@Named
@SessionScoped
public class AtletaController implements Serializable {

	private static final long serialVersionUID = 1L;

	private Atleta atleta;
	private List<Atleta> atletas;

	@PostConstruct
	private void init() throws Exception {
		atletas = new ArrayList<Atleta>();
		atletas = listar();
	}

	// ACTIONS
	public List<Atleta> listar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IAtletaDao<Atleta> dao = new AtletaDao(conn);
		try {
			atletas = dao.list();
			System.out.println(atletas);
			System.out.println("Listando....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.close();
		return atletas;
	}

	public String salvar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IAtletaDao<Atleta> dao = new AtletaDao(conn);
		try {
			dao.insert(atleta);
			listar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.close();
		System.out.println("Salvando...");

		return "lista";
	}

	public String adicionar() {
		atleta = new Atleta();

		System.out.println("Adicionando...");

		return "novo";
	}

	public String cancelar() {
		System.out.println("Cancelando...");
		return "lista";

	}

	public String excluir(Atleta item) throws SQLException {
		atleta = item;

		Connection conn = new ConnectionFactory().getConnection();
		IAtletaDao<Atleta> dao = new AtletaDao(conn);
		try {
			dao.delete(atleta.getId());
			listar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.close();
		return "lista";
	}

	public String editar(Atleta item) {

		System.out.println("Editando...");
		atleta = item;
		return "edicao";
	}

	public String atualizar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IAtletaDao<Atleta> dao = new AtletaDao(conn);
		try {
			dao.update(atleta);
			listar();
			System.out.println("Atualizando...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		conn.close();
		return "lista";
	}

	// Getter and setters
	public Atleta getAtleta() {
		return atleta;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

}
