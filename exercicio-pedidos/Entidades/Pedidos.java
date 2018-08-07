package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
	
	private Integer quantidade;
	private double preco;
	
	private Produto nome;
	private Produto precoProduto;
	
	private List <Produto> produto = new ArrayList <>(); 

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
	
	public String toString (Integer quantidade, double preco, Produto nome, Produto precoProduto ) {
		System.out.println(nome + ", $" + preco + ", Quantidade: " + quantidade + " " );
	}

}
