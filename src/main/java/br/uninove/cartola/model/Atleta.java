package br.uninove.cartola.model;

public class Atleta {

	private int id;
	private String nome;
	private String apelido;
	private String foto;
	private int preco_editorial;

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

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getPreco_editorial() {
		return preco_editorial;
	}

	public void setPreco_editorial(int preco_editorial) {
		this.preco_editorial = preco_editorial;
	}

	@Override
	public String toString() {
		return "Atleta [id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", foto=" + foto + ", preco_editorial="
				+ preco_editorial + "]";
	}

}
