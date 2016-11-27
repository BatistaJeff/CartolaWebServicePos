package br.uninove.cartola.dto;

public class ClubeDto {
	private int id_dto;
	private String nome_dto;
	private String abreviacao_dto;
	private int posicao_dto;
	private EscudoDto escudo_dto;

	public int getId_dto() {
		return id_dto;
	}

	public void setId_dto(int id_dto) {
		this.id_dto = id_dto;
	}

	public String getNome_dto() {
		return nome_dto;
	}

	public void setNome_dto(String nome_dto) {
		this.nome_dto = nome_dto;
	}

	public String getAbreviacao_dto() {
		return abreviacao_dto;
	}

	public void setAbreviacao_dto(String abreviacao_dto) {
		this.abreviacao_dto = abreviacao_dto;
	}

	public int getPosicao_dto() {
		return posicao_dto;
	}

	public void setPosicao_dto(int posicao_dto) {
		this.posicao_dto = posicao_dto;
	}

	public EscudoDto getEscudo_dto() {
		return escudo_dto;
	}

	public void setEscudo_dto(EscudoDto escudo_dto) {
		this.escudo_dto = escudo_dto;
	}

	@Override
	public String toString() {
		return "ClubeDto [id_dto=" + id_dto + ", nome_dto=" + nome_dto + ", abreviacao_dto=" + abreviacao_dto
				+ ", posicao_dto=" + posicao_dto + ", escudo_dto=" + escudo_dto + "]";
	}

}
