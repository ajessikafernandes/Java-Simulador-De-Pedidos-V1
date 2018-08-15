package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enums.StatusPedido;

public class Order {

	private Date momento;
	private StatusPedido status;

	List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date momento, StatusPedido status, List<OrderItem> items) {
		this.momento = momento;
		this.status = status;
		this.items = items;
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

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public void addItem(OrderItem ordemItems) {
		 items.add(ordemItems);
	}

	public void removeItem(OrderItem  ordemItems) {
		 items.remove(ordemItems);
	}

	public Double total() {
		Double totalPreco = 0.00;

		for (OrderItem item : items) {
			totalPreco += item.subTotal();
		}

		return totalPreco;
	}
	
}
