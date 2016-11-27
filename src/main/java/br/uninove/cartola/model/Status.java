package br.uninove.cartola.model;

public class Status {

	private int rodada_atual;
	private int status_mercado;
	private int esquema_default_id;
	private int cartoleta_inicial;
	private int max_ligas_free;
	private int max_ligas_pro;
	private int max_ligas_matamata_free;
	private int max_ligas_matamata_pro;
	private int max_ligas_patrocinadas_free;
	private int max_ligas_patrocinadas_pro_num;
	private boolean game_over;
	private int times_escalados;
	private boolean mercado_pos_rodada;
	private String aviso;
	private Fechamento fechamento;

	public Fechamento getFechamento() {
		return fechamento;
	}

	public void setFechamento(Fechamento fechamento) {
		this.fechamento = fechamento;
	}

	public int getRodada_atual() {
		return rodada_atual;
	}

	public void setRodada_atual(int rodada_atual) {
		this.rodada_atual = rodada_atual;
	}

	public int getStatus_mercado() {
		return status_mercado;
	}

	public void setStatus_mercado(int status_mercado) {
		this.status_mercado = status_mercado;
	}

	public int getEsquema_default_id() {
		return esquema_default_id;
	}

	public void setEsquema_default_id(int esquema_default_id) {
		this.esquema_default_id = esquema_default_id;
	}

	public int getCartoleta_inicial() {
		return cartoleta_inicial;
	}

	public void setCartoleta_inicial(int cartoleta_inicial) {
		this.cartoleta_inicial = cartoleta_inicial;
	}

	public int getMax_ligas_free() {
		return max_ligas_free;
	}

	public void setMax_ligas_free(int max_ligas_free) {
		this.max_ligas_free = max_ligas_free;
	}

	public int getMax_ligas_pro() {
		return max_ligas_pro;
	}

	public void setMax_ligas_pro(int max_ligas_pro) {
		this.max_ligas_pro = max_ligas_pro;
	}

	public int getMax_ligas_matamata_free() {
		return max_ligas_matamata_free;
	}

	public void setMax_ligas_matamata_free(int max_ligas_matamata_free) {
		this.max_ligas_matamata_free = max_ligas_matamata_free;
	}

	public int getMax_ligas_matamata_pro() {
		return max_ligas_matamata_pro;
	}

	public void setMax_ligas_matamata_pro(int max_ligas_matamata_pro) {
		this.max_ligas_matamata_pro = max_ligas_matamata_pro;
	}

	public int getMax_ligas_patrocinadas_free() {
		return max_ligas_patrocinadas_free;
	}

	public void setMax_ligas_patrocinadas_free(int max_ligas_patrocinadas_free) {
		this.max_ligas_patrocinadas_free = max_ligas_patrocinadas_free;
	}

	public int getMax_ligas_patrocinadas_pro_num() {
		return max_ligas_patrocinadas_pro_num;
	}

	public void setMax_ligas_patrocinadas_pro_num(int max_ligas_patrocinadas_pro_num) {
		this.max_ligas_patrocinadas_pro_num = max_ligas_patrocinadas_pro_num;
	}

	public boolean isGame_over() {
		return game_over;
	}

	public void setGame_over(boolean game_over) {
		this.game_over = game_over;
	}

	public int getTimes_escalados() {
		return times_escalados;
	}

	public void setTimes_escalados(int times_escalados) {
		this.times_escalados = times_escalados;
	}

	public boolean isMercado_pos_rodada() {
		return mercado_pos_rodada;
	}

	public void setMercado_pos_rodada(boolean mercado_pos_rodada) {
		this.mercado_pos_rodada = mercado_pos_rodada;
	}

	public String getAviso() {
		return aviso;
	}

	public void setAviso(String aviso) {
		this.aviso = aviso;
	}

	public String toString() {
		return "Status [rodada_atual=" + rodada_atual + ", status_mercado=" + status_mercado + ", esquema_default_id="
				+ esquema_default_id + ", cartoleta_inicial=" + cartoleta_inicial + ", max_ligas_free=" + max_ligas_free
				+ ", max_ligas_pro=" + max_ligas_pro + ", max_ligas_matamata_free=" + max_ligas_matamata_free
				+ ", max_ligas_matamata_pro=" + max_ligas_matamata_pro + ", max_ligas_patrocinadas_free="
				+ max_ligas_patrocinadas_free + ", max_ligas_patrocinadas_pro_num=" + max_ligas_patrocinadas_pro_num
				+ ", game_over=" + game_over + ", times_escalados=" + times_escalados + ", mercado_pos_rodada="
				+ mercado_pos_rodada + ", aviso=" + aviso + ", fechamento=" + fechamento + "]";
	}

}
