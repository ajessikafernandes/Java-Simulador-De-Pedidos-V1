package Entidades;

public class Produto {

	private String nomeProduto;
	private double precoProduto;

	public Produto() {

	}

	public Produto(String nomeProduto, double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
}
