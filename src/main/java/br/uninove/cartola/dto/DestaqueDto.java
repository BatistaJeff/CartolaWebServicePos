package br.uninove.cartola.dto;

import br.uninove.cartola.model.Atleta;

public class DestaqueDto {
	private int escalacoes_dto;
	private String clube_dto;
	private String escudo_clube_dto;
	private String posicao_dto;
	private Atleta atleta_dto;

	public int getEscalacoes_dto() {
		return escalacoes_dto;
	}

	public void setEscalacoes_dto(int escalacoes_dto) {
		this.escalacoes_dto = escalacoes_dto;
	}

	public String getClube_dto() {
		return clube_dto;
	}

	public void setClube_dto(String clube_dto) {
		this.clube_dto = clube_dto;
	}

	public String getEscudo_clube_dto() {
		return escudo_clube_dto;
	}

	public void setEscudo_clube_dto(String escudo_clube_dto) {
		this.escudo_clube_dto = escudo_clube_dto;
	}

	public String getPosicao_dto() {
		return posicao_dto;
	}

	public void setPosicao_dto(String posicao_dto) {
		this.posicao_dto = posicao_dto;
	}

	public Atleta getAtleta_dto() {
		return atleta_dto;
	}

	public void setAtleta_dto(Atleta atleta_dto) {
		this.atleta_dto = atleta_dto;
	}

	@Override
	public String toString() {
		return "DestaqueDto [escalacoes_dto=" + escalacoes_dto + ", clube_dto=" + clube_dto + ", escudo_clube_dto="
				+ escudo_clube_dto + ", posicao_dto=" + posicao_dto + ", atleta_dto=" + atleta_dto + "]";
	}

}
