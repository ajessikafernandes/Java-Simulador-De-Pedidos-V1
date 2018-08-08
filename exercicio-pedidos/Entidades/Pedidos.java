package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {

	private Integer quantidade;
	private double preco;

	private List<Produto> produto = new ArrayList<>();

	public Pedidos() {

	}

	public Pedidos(double preco, Integer quantidade) {
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public void toString(Produto nome, double preco, Integer quantidade, Produto precoProduto) {
		System.out.println(nome + ", $" + preco + ", Quantidade: " + quantidade + " , Subtotal: $" + precoProduto);

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

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public void addProduto(Produto produto) {
		addProduto(produto);
	}

	public void removeProduto(Produto produto) {
		removeProduto(produto);
	}

	public double total() {
		return preco * quantidade;
	}

}
