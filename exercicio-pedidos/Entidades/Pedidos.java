package Entidades;

public class Pedidos {

	private Integer quantidade;
	private double preco;

	private Produto nome;
	private Produto precoProduto;

	public Pedidos(Produto nome, double preco, Integer quantidade, Produto precoProduto) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.precoProduto = precoProduto;
	}

	public Produto getNome() {
		return nome;
	}

	public void setNome(Produto nome) {
		this.nome = nome;
	}

	public Produto getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Produto precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void toString(Produto nome, double preco, Integer quantidade, Produto precoProduto) {
		System.out.println(nome + ", $" + preco + ", Quantidade: " + quantidade + " , Subtotal: $" + precoProduto);
		
	}
	
	public double somaTotal (double preco, Integer quantidade, Produto precoProduto) {
		
	}

}
