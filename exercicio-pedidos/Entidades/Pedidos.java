package Entidades;

public class Pedidos {

	private Integer quantidade;
	private double preco;

	public Pedidos() {

	}

	Produto produto = new Produto ();
	
	public Pedidos(Produto nomeItem, double preco, Integer quantidade) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.produto = nomeItem;
	}

	public String toString(String nomeItem, double preco, Integer quantidade) {
		return nomeItem + ", $ " + preco + ", Quantidade: " + quantidade + " , Subtotal: $" + subtotal();
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
