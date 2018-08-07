package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
	
	private Integer quantidade;
	private double preco;
	
//	private List <Produto> produto = new ArrayList <>(); 

//	for (int cont = 0; cont < quantidade; cont ++) {
//		
//	}
	
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

}
