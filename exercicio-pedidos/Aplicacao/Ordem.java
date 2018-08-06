package Aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entidades.Pedidos;
import Entidades.Produto;
import Entidades.StatusPedido;
import Entidades.Cliente;

public class Ordem {

	public static void main(String[] args) {

		Date horaMomento;
		StatusPedido status;
		
		Scanner ler = new Scanner(System.in);
		
		List <Cliente> cliente = new ArrayList <>();
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		System.out.print("Data de Nascimento (DD/MM/YYYY): ");
		String dataNascimento = ler.nextLine();
		
		cliente.add(new Cliente (nome , email , dataNascimento));
		
		System.out.println("Informe o status do pedido: ");
		StatusPedido.valueOf(ler.nextLine());
		
		System.out.println("Informe a quantidade de itens no pedido: ");
		int qtd = ler.nextInt();
		
		ler.nextInt();
		
		List <Pedidos> itensPedidos = new ArrayList <>();
		
		List <Produto> produto = new ArrayList <>();
		
		for (int cont = 1; cont < qtd ; cont++) {
			System.out.println("Informe dados do pedido #" + cont + " : ");
			System.out.print("Nome Produto: ");
			String nomeProduto = ler.nextLine();
			System.out.print("Nome Produto: ");
			double precoProduto = ler.nextDouble();
			System.out.println("Quantidade: ");
			int qdtItem = ler.nextInt();
			
			produto.add(new Produto (nomeProduto, precoProduto));
			itensPedidos.add(new Pedidos(qdtItem, precoProduto ));
		}
		
		
		ler.close();
	}

}
