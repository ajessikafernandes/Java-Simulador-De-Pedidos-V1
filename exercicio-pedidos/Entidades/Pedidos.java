package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
	
	private Integer quantidade;
	private double preco;
	
	List <Produto> produto = new ArrayList <>(); 
	
	public Pedidos() {
		
	}

	public Pedidos(Integer quantidade, double preco) {
		this.quantidade = quantidade;
		this.preco = preco; 
		
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
		return getProduto();
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
}
