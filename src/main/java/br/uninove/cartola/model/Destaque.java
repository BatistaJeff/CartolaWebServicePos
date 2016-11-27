package br.uninove.cartola.model;

public class Destaque {

	private int escalacoes;
	private String clube;
	private String escudo_clube;
	private String posicao;
	private Atleta atleta;

	public int getEscalacoes() {
		return escalacoes;
	}

	public void setEscalacoes(int escalacoes) {
		this.escalacoes = escalacoes;
	}

	public String getClube() {
		return clube;
	}

	public void setClube(String clube) {
		this.clube = clube;
	}

	public String getEscudo_clube() {
		return escudo_clube;
	}

	public void setEscudo_clube(String escudo_clube) {
		this.escudo_clube = escudo_clube;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Atleta getAtleta() {
		return atleta;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	@Override
	public String toString() {
		return "Destaque [escalacoes=" + escalacoes + ", clube=" + clube + ", escudo_clube=" + escudo_clube
				+ ", posicao=" + posicao + ", atleta=" + atleta + "]";
	}

}
