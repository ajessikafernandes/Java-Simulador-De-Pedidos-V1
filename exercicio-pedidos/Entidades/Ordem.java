package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Entidades.Ordem;
import Entidades.Pedidos;

import Enums.StatusPedido;

public class Ordem {

	private Date momento = new Date();
	private StatusPedido status;
	
	private List<Pedidos> pedidos = new ArrayList<>();

	public Ordem() {

	}

	public Ordem(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}

	public void addItem(Pedidos pedido) {
		pedidos.add(pedido);
	}

	public void removeItem(Pedidos pedido) {
		pedidos.remove(pedido);
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

	public void getPedidos(List<Pedidos> pedidos) {
		pedidos.add(new Pedidos());
	}

	public void setPedidos(List<Pedidos> pedidos) {
		pedidos.remove(new Pedidos());
	}
	
	
}
