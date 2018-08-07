package Aplicacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

import Entidades.Cliente;
import Entidades.Ordem;
import Entidades.Pedidos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List <Cliente> cliente = new ArrayList <>();
		
		System.out.println("Informe os dados do Cliente: ");
		System.out.print("Nome: ");
		String nomeCliente = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		String dataNascimento = ler.nextLine();
		
		cliente.add(new Cliente (nomeCliente, email, dataNascimento));
		
		ler.nextLine();
		
//		List <Produto> produto = new ArrayList <>();
		
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String status = ler.nextLine();
		
		System.out.println("Quantos itens deverá ser acrescentado ao pedido: ");
		int qtdItem = ler.nextInt();
		
		List <Pedidos> pedido = new ArrayList <>();
		
		for (int cont = 0; cont < qtdItem; cont++) {
			System.out.println("Entre com os dados do item #" + cont + " :");
			System.out.print("Nome produto: ");
			String nome = ler.nextLine();
			System.out.print("Preço do produto: ");
			double preco = ler.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = ler.nextInt();
			
//			pedido.add(new Pedidos (nome, preco, quantidade));
		}
		
		System.out.println("Pedido Finalizado: ");
		Ordem momento = new Date();
		momento.getTime();
		
		System.out.print("Pedido realizado: ");
		System.out.println("Status do pedido: ");
		System.out.println("Cliente");
		
		ler.close();
	}

}
