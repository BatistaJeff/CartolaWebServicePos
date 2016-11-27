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
import br.uninove.cartola.dao.IEscudoDao;
import br.uninove.cartola.dao.jdbc.EscudoDao;
import br.uninove.cartola.model.Escudo;

@Named
@SessionScoped
public class EscudoController implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Escudo> escudos;
	private Escudo escudo;

	@PostConstruct
	private void init() throws Exception {

		escudos = new ArrayList<Escudo>();
		escudos = listar();
	}

	// ACTIONS
	public List<Escudo> listar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IEscudoDao<Escudo> dao = new EscudoDao(conn);
		try {
			escudos = dao.list();
			System.out.println(escudos);
			System.out.println("Listando....");
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return escudos;
	}

	public String salvar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IEscudoDao<Escudo> dao = new EscudoDao(conn);
		try {
			dao.insert(escudo);
			listar();
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		System.out.println("Salvando...");

		return "lista";
	}

	public String adicionar() {
		escudo = new Escudo();

		System.out.println("Adicionando...");

		return "novo";
	}

	public String cancelar() {
		System.out.println("Cancelando...");
		return "lista";

	}

	public String excluir(Escudo item) throws SQLException {
		escudo = item;

		Connection conn = new ConnectionFactory().getConnection();
		IEscudoDao<Escudo> dao = new EscudoDao(conn);
		try {
			dao.delete(escudo.getId());
			listar();
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return "lista";
	}

	public String editar(Escudo item) {

		System.out.println("Editando...");
		escudo = item;
		return "edicao";
	}

	public String atualizar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IEscudoDao<Escudo> dao = new EscudoDao(conn);
		try {
			dao.update(escudo);
			listar();
			System.out.println("Atualizando...");
		} catch (Exception e) {

			e.printStackTrace();
		}

		conn.close();
		return "lista";
	}

	// Getters And Setters
	public List<Escudo> getEscudos() {
		return escudos;
	}

	public void setEscudos(List<Escudo> escudos) {
		this.escudos = escudos;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

}
