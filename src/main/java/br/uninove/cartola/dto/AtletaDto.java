package br.uninove.cartola.dto;

public class AtletaDto {
	private int atleta_id_dto;
	private String nome_dto;
	private String apelido_dto;
	private String foto_dto;
	private int preco_editorial_dto;

	public int getAtleta_id_dto() {
		return atleta_id_dto;
	}

	public void setAtleta_id_dto(int atleta_id_dto) {
		this.atleta_id_dto = atleta_id_dto;
	}

	public String getNome_dto() {
		return nome_dto;
	}

	public void setNome_dto(String nome_dto) {
		this.nome_dto = nome_dto;
	}

	public String getApelido_dto() {
		return apelido_dto;
	}

	public void setApelido_dto(String apelido_dto) {
		this.apelido_dto = apelido_dto;
	}

	public String getFoto_dto() {
		return foto_dto;
	}

	public void setFoto_dto(String foto_dto) {
		this.foto_dto = foto_dto;
	}

	public int getPreco_editorial_dto() {
		return preco_editorial_dto;
	}

	public void setPreco_editorial_dto(int preco_editorial_dto) {
		this.preco_editorial_dto = preco_editorial_dto;
	}

	@Override
	public String toString() {
		return "AtletaDto [atleta_id_dto=" + atleta_id_dto + ", nome_dto=" + nome_dto + ", apelido_dto=" + apelido_dto
				+ ", foto_dto=" + foto_dto + ", preco_editorial_dto=" + preco_editorial_dto + "]";
	}

}
