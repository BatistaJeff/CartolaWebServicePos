package br.uninove.cartola.model;

public class Escudo {

	private int id;
	private String tamanho_60x60;
	private String tamanho_45x45;
	private String tamanho_30x30;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTamanho_60x60() {
		return tamanho_60x60;
	}

	public void setTamanho_60x60(String tamanho_60x60) {
		this.tamanho_60x60 = tamanho_60x60;
	}

	public String getTamanho_45x45() {
		return tamanho_45x45;
	}

	public void setTamanho_45x45(String tamanho_45x45) {
		this.tamanho_45x45 = tamanho_45x45;
	}

	public String getTamanho_30x30() {
		return tamanho_30x30;
	}

	public void setTamanho_30x30(String tamanho_30x30) {
		this.tamanho_30x30 = tamanho_30x30;
	}

	@Override
	public String toString() {
		return "Escudo [id=" + id + ", tamanho_60x60=" + tamanho_60x60 + ", tamanho_45x45=" + tamanho_45x45
				+ ", tamanho_30x30=" + tamanho_30x30 + "]";
	}
}
