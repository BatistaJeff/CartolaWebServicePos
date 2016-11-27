package br.uninove.cartola.dto;

public class FechamentoDto {

	private int dia_dto;
	private int mes_dto;
	private int ano_dto;
	private int hora_dto;
	private int minuto_dto;
	private int timestamp_dto;

	public int getDia_dto() {
		return dia_dto;
	}

	public void setDia_dto(int dia_dto) {
		this.dia_dto = dia_dto;
	}

	public int getMes_dto() {
		return mes_dto;
	}

	public void setMes_dto(int mes_dto) {
		this.mes_dto = mes_dto;
	}

	public int getAno_dto() {
		return ano_dto;
	}

	public void setAno_dto(int ano_dto) {
		this.ano_dto = ano_dto;
	}

	public int getHora_dto() {
		return hora_dto;
	}

	public void setHora_dto(int hora_dto) {
		this.hora_dto = hora_dto;
	}

	public int getMinuto_dto() {
		return minuto_dto;
	}

	public void setMinuto_dto(int minuto_dto) {
		this.minuto_dto = minuto_dto;
	}

	public int getTimestamp_dto() {
		return timestamp_dto;
	}

	public void setTimestamp_dto(int timestamp_dto) {
		this.timestamp_dto = timestamp_dto;
	}

	@Override
	public String toString() {
		return "FechamentoDto [dia_dto=" + dia_dto + ", mes_dto=" + mes_dto + ", ano_dto=" + ano_dto + ", hora_dto="
				+ hora_dto + ", minuto_dto=" + minuto_dto + ", timestamp_dto=" + timestamp_dto + "]";
	}

}
