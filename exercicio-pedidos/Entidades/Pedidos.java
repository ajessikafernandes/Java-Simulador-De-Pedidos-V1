package Entidades;

public class Pedidos {

	private Integer quantidade;
	private double preco;
	private Produto nomeItem;

	public Pedidos() {

	}

	public Pedidos(Produto nomeItem, double preco, Integer quantidade) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.nomeItem = nomeItem;
	}

	public void toString(Produto nomeItem, double preco, Integer quantidade, Produto precoProduto) {
		System.out.println(nomeItem + ", $" + preco + ", Quantidade: " + quantidade + " , Subtotal: $" + precoProduto);

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

	public void addProduto(Produto produto) {
		addProduto(produto);
	}

	public void removeProduto(Produto produto) {
		removeProduto(produto);
	}

	public double subtotal() {
		return preco * quantidade;
	}

}
