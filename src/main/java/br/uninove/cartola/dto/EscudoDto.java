package br.uninove.cartola.dto;

public class EscudoDto {
	private String tamanho_60x60_dto;
	private String tamanho_45x45_dto;
	private String tamanho_30x30_dto;

	public String getTamanho_60x60_dto() {
		return tamanho_60x60_dto;
	}

	public void setTamanho_60x60_dto(String tamanho_60x60_dto) {
		this.tamanho_60x60_dto = tamanho_60x60_dto;
	}

	public String getTamanho_45x45_dto() {
		return tamanho_45x45_dto;
	}

	public void setTamanho_45x45_dto(String tamanho_45x45_dto) {
		this.tamanho_45x45_dto = tamanho_45x45_dto;
	}

	public String getTamanho_30x30_dto() {
		return tamanho_30x30_dto;
	}

	public void setTamanho_30x30_dto(String tamanho_30x30_dto) {
		this.tamanho_30x30_dto = tamanho_30x30_dto;
	}

	@Override
	public String toString() {
		return "EscudoDto [tamanho_60x60_dto=" + tamanho_60x60_dto + ", tamanho_45x45_dto=" + tamanho_45x45_dto
				+ ", tamanho_30x30_dto=" + tamanho_30x30_dto + "]";
	}

}
