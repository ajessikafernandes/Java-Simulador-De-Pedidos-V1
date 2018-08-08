package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.Cliente;
import Entidades.Ordem;
import Entidades.Pedidos;

import Enums.StatusPedido;

public class Ordem {

	private Date momento = new Date();
	private StatusPedido status;

	private List<Cliente> cliente = new ArrayList<>();
	private List<Pedidos> pedidos = new ArrayList<>();

	public Ordem() {

	}

	public Ordem(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
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

	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public void addItem(Pedidos pedido) {
		pedidos.add(pedido);
	}

	public void removeItem(Pedidos pedido) {
		pedidos.remove(pedido);
	}

	public void addCliente(Cliente cliente) {
		addCliente(cliente);
	}

	public void removeCliente(Cliente cliente) {
		removeCliente(cliente);
	}

	public double total() {
		double sum = preco * quantidade;
		
		for (Produto somatotal : produto){
			somatotal += sum;
		}
		return sum;
	}
}
