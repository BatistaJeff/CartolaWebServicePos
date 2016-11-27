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
import br.uninove.cartola.dao.IFechamentoDao;
import br.uninove.cartola.dao.jdbc.FechamentoDao;
import br.uninove.cartola.model.Fechamento;

@Named
@SessionScoped
public class FechamentoController implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Fechamento> fechamentos;
	private Fechamento fechamento;

	@PostConstruct
	private void init() throws Exception {
		fechamentos = new ArrayList<Fechamento>();
		fechamentos = listar();
	}

	// ACTIONS
	public List<Fechamento> listar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IFechamentoDao<Fechamento> dao = new FechamentoDao(conn);
		try {
			fechamentos = dao.list();
			System.out.println(fechamentos);
			System.out.println("Listando....");
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return fechamentos;
	}

	public String salvar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IFechamentoDao<Fechamento> dao = new FechamentoDao(conn);
		try {
			dao.insert(fechamento);
			listar();
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		System.out.println("Salvando...");

		return "lista";
	}

	public String adicionar() {
		fechamento = new Fechamento();

		System.out.println("Adicionando...");

		return "novo";
	}

	public String cancelar() {
		System.out.println("Cancelando...");
		return "lista";

	}

	public String excluir(Fechamento item) throws SQLException {
		fechamento = item;

		Connection conn = new ConnectionFactory().getConnection();
		IFechamentoDao<Fechamento> dao = new FechamentoDao(conn);
		try {
			dao.delete(fechamento.getId());
			listar();
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return "lista";
	}

	public String editar(Fechamento item) {

		System.out.println("Editando...");
		fechamento = item;
		return "edicao";
	}

	public String atualizar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IFechamentoDao<Fechamento> dao = new FechamentoDao(conn);
		try {
			dao.update(fechamento);
			listar();
			System.out.println("Atualizando...");
		} catch (Exception e) {

			e.printStackTrace();
		}

		conn.close();
		return "lista";
	}

	// getters and setters
	public List<Fechamento> getFechamentos() {
		return fechamentos;
	}

	public void setFechamentos(List<Fechamento> fechamentos) {
		this.fechamentos = fechamentos;
	}

	public Fechamento getFechamento() {
		return fechamento;
	}

	public void setFechamento(Fechamento fechamento) {
		this.fechamento = fechamento;
	}

}
