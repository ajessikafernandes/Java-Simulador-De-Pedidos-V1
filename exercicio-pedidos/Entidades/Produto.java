package Entidades;

public class Produto {

	private String nomeItem;
	private double preco;

	public Produto() {

	}

	public Produto(String nome, double preco) {
		this.nomeItem = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nomeItem;
	}

	public void setNome(String nome) {
		this.nomeItem = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
