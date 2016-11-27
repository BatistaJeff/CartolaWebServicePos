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
import br.uninove.cartola.dao.IStatusDao;
import br.uninove.cartola.dao.jdbc.StatusDao;
import br.uninove.cartola.model.Fechamento;
import br.uninove.cartola.model.Status;

@Named
@SessionScoped
public class StatusController implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Status> statusList;
	private Status status;
	private Fechamento fechamentoSelecionado;

	private List<Fechamento> fechamentos;

	private FechamentoController fechamento;

	@PostConstruct
	private void init() throws Exception {

		statusList = new ArrayList<Status>();
		fechamento = new FechamentoController();
		fechamentos = new ArrayList<Fechamento>();
		statusList = listar();
		fechamentos = fechamento.listar();

	}

	// ACTIONS
	public List<Status> listar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IStatusDao<Status> dao = new StatusDao(conn);
		try {
			statusList = dao.list();
			System.out.println(statusList);
			System.out.println("Listando....");
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return statusList;
	}

	public String salvar() throws SQLException {

		status.setFechamento((fechamentoSelecionado));
		Connection conn = new ConnectionFactory().getConnection();
		IStatusDao<Status> dao = new StatusDao(conn);
		try {
			dao.insert(status);
			listar();
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		System.out.println("Salvando...");

		return "lista";
	}

	public String adicionar() {
		status = new Status();
		fechamentoSelecionado = new Fechamento();
		System.out.println("Adicionando...");

		return "novo";
	}

	public String cancelar() {
		System.out.println("Cancelando...");
		return "lista";

	}

	public String excluir(Status item) throws SQLException {
		status = item;
		fechamentoSelecionado = null;
		Connection conn = new ConnectionFactory().getConnection();
		IStatusDao<Status> dao = new StatusDao(conn);
		try {
			status.setFechamento(fechamentoSelecionado);
			dao.delete(status.getRodada_atual());
			listar();
			System.out.println("Excluindo..");
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return "lista";
	}

	public String editar(Status item) {

		System.out.println("Editando...");
		status = item;
		return "edicao";
	}

	public String atualizar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IStatusDao<Status> dao = new StatusDao(conn);
		try {
			dao.update(status);
			listar();
			System.out.println("Atualizando...");
		} catch (Exception e) {

			e.printStackTrace();
		}

		conn.close();
		return "lista";
	}

	public List<Status> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<Status> statusList) {
		this.statusList = statusList;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Fechamento getFechamentoSelecionado() {
		return fechamentoSelecionado;
	}

	public void setFechamentoSelecionado(Fechamento fechamentoSelecionado) {
		this.fechamentoSelecionado = fechamentoSelecionado;
	}

	public List<Fechamento> getFechamentos() {
		return fechamentos;
	}

	public void setFechamentos(List<Fechamento> fechamentos) {
		this.fechamentos = fechamentos;
	}

	public FechamentoController getFechamento() {
		return fechamento;
	}

	public void setFechamento(FechamentoController fechamento) {
		this.fechamento = fechamento;
	}

}
