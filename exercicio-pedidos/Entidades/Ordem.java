package Entidades;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import Enums.StatusPedido;

public class Ordem {

	private Date momento;

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

	private StatusPedido status;

	public void addItem(Pedidos item) {

	}

	public Ordem(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}

	public void removeItem(Pedidos item) {

	}

	public double total(double totalSoma) {

		return totalSoma;
	}

}
