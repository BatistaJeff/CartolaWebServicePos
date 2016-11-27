package br.uninove.cartola.model;

public class Clube {

	private int id;
	private String nome;
	private String abreviacao;
	private int posicao;
	private Escudo escudo_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAbreviacao() {
		return abreviacao;
	}

	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public Escudo getEscudo_id() {
		return escudo_id;
	}

	public void setEscudo_id(Escudo escudo_id) {
		this.escudo_id = escudo_id;
	}

	@Override
	public String toString() {
		return "Clube [id=" + id + ", nome=" + nome + ", abreviacao=" + abreviacao + ", posicao=" + posicao
				+ ", escudo_id=" + escudo_id + "]";
	}

}
