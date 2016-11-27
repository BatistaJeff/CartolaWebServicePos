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
import br.uninove.cartola.dao.IDestaqueDao;
import br.uninove.cartola.dao.jdbc.DestaqueDao;
import br.uninove.cartola.model.Atleta;
import br.uninove.cartola.model.Destaque;

@Named
@SessionScoped
public class DestaqueController implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Destaque> destaques;
	private Destaque destaque;
	private Atleta atletaSelecionado;
	private List<Atleta> atletas;

	private AtletaController atleta;

	@PostConstruct
	private void init() throws Exception {
		destaques = new ArrayList<Destaque>();
		atleta = new AtletaController();
		atletas = new ArrayList<Atleta>();
		destaques = listar();
		atletas = atleta.listar();

	}

	// ACTIONS
	public List<Destaque> listar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IDestaqueDao<Destaque> dao = new DestaqueDao(conn);
		try {
			destaques = dao.list();
//			System.out.println(destaques);
			System.out.println("Listando....");
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return destaques;
	}

	public String salvar() throws SQLException {

		destaque.setAtleta(atletaSelecionado);
		Connection conn = new ConnectionFactory().getConnection();
		IDestaqueDao<Destaque> dao = new DestaqueDao(conn);
		try {
			dao.insert(destaque);
			listar();
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		System.out.println("Salvando...");

		return "lista";
	}

	public String adicionar() {
		destaque = new Destaque();
		atletaSelecionado = new Atleta();
		System.out.println("Adicionando...");

		return "novo";
	}

	public String cancelar() {
		System.out.println("Cancelando...");
		return "lista";

	}

	public String excluir(Destaque item) throws SQLException {
		destaque = item;
		atletaSelecionado = null;
		Connection conn = new ConnectionFactory().getConnection();
		IDestaqueDao<Destaque> dao = new DestaqueDao(conn);
		try {
			destaque.setAtleta(atletaSelecionado);
			dao.delete(destaque.getEscalacoes());
			listar();
			System.out.println("Excluindo..");
		} catch (Exception e) {

			e.printStackTrace();
		}
		conn.close();
		return "lista";
	}

	public String editar(Destaque item) {

		System.out.println("Editando...");
		destaque = item;
		return "edicao";
	}

	public String atualizar() throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		IDestaqueDao<Destaque> dao = new DestaqueDao(conn);
		try {
			dao.update(destaque);
			listar();
			System.out.println("Atualizando...");
		} catch (Exception e) {

			e.printStackTrace();
		}

		conn.close();
		return "lista";
	}

	// Getters and setters
	public List<Destaque> getDestaques() {
		return destaques;
	}

	public void setDestaques(List<Destaque> destaques) {
		this.destaques = destaques;
	}

	public Destaque getDestaque() {
		return destaque;
	}

	public void setDestaque(Destaque destaque) {
		this.destaque = destaque;
	}

	public Atleta getAtletaSelecionado() {
		return atletaSelecionado;
	}

	public void setAtletaSelecionado(Atleta atletaSelecionado) {
		this.atletaSelecionado = atletaSelecionado;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

	public AtletaController getAtleta() {
		return atleta;
	}

	public void setAtleta(AtletaController atleta) {
		this.atleta = atleta;
	}

}
