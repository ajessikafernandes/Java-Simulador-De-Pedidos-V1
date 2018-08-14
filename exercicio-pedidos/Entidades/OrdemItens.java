package Entidades;

public class OrdemItens {

	private Integer quantidade;
	private double preco;

	private Produto produto;
	
	public OrdemItens(Produto produto, double preco, Integer quantidade) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.produto = produto;
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
	
	public String toString(String nomeItem, double preco, Integer quantidade) {
		return produto.getNome() + ", $" + quantidade + "SubTotal" + subtotal();
	}

}
