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
import br.uninove.cartola.dao.IClubeDao;
import br.uninove.cartola.dao.jdbc.ClubeDao;
import br.uninove.cartola.model.Clube;
import br.uninove.cartola.model.Escudo;

@Named
@SessionScoped
public class ClubeController implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Clube> clubes;
	private Clube clube;
	private Escudo escudoSelecionado;

	private List<Escudo> escudos;

	private EscudoController escudo;

	@PostConstruct
	private void init() throws Exception {

		clubes = new ArrayList<Clube>();
		escudo = new EscudoController();
		escudos = new ArrayList<Escudo>();
		clubes = listar();
		escudos = escudo.listar();

	}

	// ACTIONS
	public List<Clube> listar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IClubeDao<Clube> dao = new ClubeDao(conn);
		try {
			clubes = dao.list();
			System.out.println(clubes);
			System.out.println("Listando....");
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return clubes;
	}

	public String salvar() throws SQLException {

		clube.setEscudo_id(escudoSelecionado);
		Connection conn = new ConnectionFactory().getConnection();
		IClubeDao<Clube> dao = new ClubeDao(conn);
		try {
			dao.insert(clube);
			listar();
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		System.out.println("Salvando...");

		return "lista";
	}

	public String adicionar() {
		clube = new Clube();
		escudoSelecionado = new Escudo();
		System.out.println("Adicionando...");

		return "novo";
	}

	public String cancelar() {
		System.out.println("Cancelando...");
		return "lista";

	}

	public String excluir(Clube item) throws SQLException {
		clube = item;
		escudoSelecionado = null;
		Connection conn = new ConnectionFactory().getConnection();
		IClubeDao<Clube> dao = new ClubeDao(conn);
		try {
			clube.setEscudo_id(escudoSelecionado);
			dao.delete(clube.getId());
			listar();
			System.out.println("Excluindo..");
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return "lista";
	}

	public String editar(Clube item) {

		System.out.println("Editando...");
		clube = item;
		return "edicao";
	}

	public String atualizar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IClubeDao<Clube> dao = new ClubeDao(conn);
		try {
			dao.update(clube);
			listar();
			System.out.println("Atualizando...");
		} catch (Exception e) {

			e.printStackTrace();
		}

		conn.close();
		return "lista";
	}

	// getters and setters
	public List<Clube> getClubes() {
		return clubes;
	}

	public void setClubes(List<Clube> clubes) {
		this.clubes = clubes;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}

	public List<Escudo> getEscudos() {
		return escudos;
	}

	public void setEscudos(List<Escudo> escudos) {
		this.escudos = escudos;
	}

	public EscudoController getEscudo() {
		return escudo;
	}

	public void setEscudo(EscudoController escudo) {
		this.escudo = escudo;
	}

	public Escudo getEscudoSelecionado() {
		return escudoSelecionado;
	}

	public void setEscudoSelecionado(Escudo escudoSelecionado) {
		this.escudoSelecionado = escudoSelecionado;
	}

}
