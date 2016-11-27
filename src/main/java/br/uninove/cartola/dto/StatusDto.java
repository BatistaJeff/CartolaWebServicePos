package br.uninove.cartola.dto;

public class StatusDto {

	private int rodada_atual_dto;
	private int status_mercado_dto;
	private int esquema_default_id_dto;
	private int cartoleta_inicial_dto;
	private int max_ligas_free_dto;
	private int max_ligas_pro_dto;
	private int max_ligas_matamata_free_dto;
	private int max_ligas_matamata_pro_dto;
	private int max_ligas_patrocinadas_free_dto;
	private int max_ligas_patrocinadas_pro_num_dto;
	private boolean game_over_dto;
	private int times_escalados_dto;
	private boolean mercado_pos_rodada_dto;
	private String aviso_dto;
	private FechamentoDto fechamentoDto;
	public int getRodada_atual_dto() {
		return rodada_atual_dto;
	}
	public void setRodada_atual_dto(int rodada_atual_dto) {
		this.rodada_atual_dto = rodada_atual_dto;
	}
	public int getStatus_mercado_dto() {
		return status_mercado_dto;
	}
	public void setStatus_mercado_dto(int status_mercado_dto) {
		this.status_mercado_dto = status_mercado_dto;
	}
	public int getEsquema_default_id_dto() {
		return esquema_default_id_dto;
	}
	public void setEsquema_default_id_dto(int esquema_default_id_dto) {
		this.esquema_default_id_dto = esquema_default_id_dto;
	}
	public int getCartoleta_inicial_dto() {
		return cartoleta_inicial_dto;
	}
	public void setCartoleta_inicial_dto(int cartoleta_inicial_dto) {
		this.cartoleta_inicial_dto = cartoleta_inicial_dto;
	}
	public int getMax_ligas_free_dto() {
		return max_ligas_free_dto;
	}
	public void setMax_ligas_free_dto(int max_ligas_free_dto) {
		this.max_ligas_free_dto = max_ligas_free_dto;
	}
	public int getMax_ligas_pro_dto() {
		return max_ligas_pro_dto;
	}
	public void setMax_ligas_pro_dto(int max_ligas_pro_dto) {
		this.max_ligas_pro_dto = max_ligas_pro_dto;
	}
	public int getMax_ligas_matamata_free_dto() {
		return max_ligas_matamata_free_dto;
	}
	public void setMax_ligas_matamata_free_dto(int max_ligas_matamata_free_dto) {
		this.max_ligas_matamata_free_dto = max_ligas_matamata_free_dto;
	}
	public int getMax_ligas_matamata_pro_dto() {
		return max_ligas_matamata_pro_dto;
	}
	public void setMax_ligas_matamata_pro_dto(int max_ligas_matamata_pro_dto) {
		this.max_ligas_matamata_pro_dto = max_ligas_matamata_pro_dto;
	}
	public int getMax_ligas_patrocinadas_free_dto() {
		return max_ligas_patrocinadas_free_dto;
	}
	public void setMax_ligas_patrocinadas_free_dto(int max_ligas_patrocinadas_free_dto) {
		this.max_ligas_patrocinadas_free_dto = max_ligas_patrocinadas_free_dto;
	}
	public int getMax_ligas_patrocinadas_pro_num_dto() {
		return max_ligas_patrocinadas_pro_num_dto;
	}
	public void setMax_ligas_patrocinadas_pro_num_dto(int max_ligas_patrocinadas_pro_num_dto) {
		this.max_ligas_patrocinadas_pro_num_dto = max_ligas_patrocinadas_pro_num_dto;
	}
	public boolean isGame_over_dto() {
		return game_over_dto;
	}
	public void setGame_over_dto(boolean game_over_dto) {
		this.game_over_dto = game_over_dto;
	}
	public int getTimes_escalados_dto() {
		return times_escalados_dto;
	}
	public void setTimes_escalados_dto(int times_escalados_dto) {
		this.times_escalados_dto = times_escalados_dto;
	}
	public boolean isMercado_pos_rodada_dto() {
		return mercado_pos_rodada_dto;
	}
	public void setMercado_pos_rodada_dto(boolean mercado_pos_rodada_dto) {
		this.mercado_pos_rodada_dto = mercado_pos_rodada_dto;
	}
	public String getAviso_dto() {
		return aviso_dto;
	}
	public void setAviso_dto(String aviso_dto) {
		this.aviso_dto = aviso_dto;
	}
	public FechamentoDto getFechamentoDto() {
		return fechamentoDto;
	}
	public void setFechamentoDto(FechamentoDto fechamentoDto) {
		this.fechamentoDto = fechamentoDto;
	}
	@Override
	public String toString() {
		return "StatusDto [rodada_atual_dto=" + rodada_atual_dto + ", status_mercado_dto=" + status_mercado_dto
				+ ", esquema_default_id_dto=" + esquema_default_id_dto + ", cartoleta_inicial_dto="
				+ cartoleta_inicial_dto + ", max_ligas_free_dto=" + max_ligas_free_dto + ", max_ligas_pro_dto="
				+ max_ligas_pro_dto + ", max_ligas_matamata_free_dto=" + max_ligas_matamata_free_dto
				+ ", max_ligas_matamata_pro_dto=" + max_ligas_matamata_pro_dto + ", max_ligas_patrocinadas_free_dto="
				+ max_ligas_patrocinadas_free_dto + ", max_ligas_patrocinadas_pro_num_dto="
				+ max_ligas_patrocinadas_pro_num_dto + ", game_over_dto=" + game_over_dto + ", times_escalados_dto="
				+ times_escalados_dto + ", mercado_pos_rodada_dto=" + mercado_pos_rodada_dto + ", aviso_dto="
				+ aviso_dto + ", fechamentoDto=" + fechamentoDto + "]";
	}

	

}
