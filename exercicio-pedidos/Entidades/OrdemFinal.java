package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.OrdemFinal;
import Entidades.OrdemItens;

import Enums.StatusPedido;

public class OrdemFinal {

	private Date momento = new Date();
	private StatusPedido status;
	
	private Cliente cliente;
	
	private List<OrdemItens> itens = new ArrayList <>();
	
	public OrdemFinal(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/* Adicionar itens a lista */
	
	public List<OrdemItens> getItens(){
		return itens;
	}

	public void addItens (OrdemItens itens){
		itens.add(itens);
	}
	
	public void removeItens (OrdemItens itens){
		itens.remove(itens);
	}

	public double total() {
		double soma = 0.0;
		
		for (OrdemItens item : itens) {
			soma += item.subtotal();
		}
		return soma;
	}

}
