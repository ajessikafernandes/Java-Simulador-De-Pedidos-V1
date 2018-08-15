package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Order;
import Entidades.OrderItem;
import Entidades.Produto;
import Enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		Order order = new Order();
		
		Cliente cliente = new Cliente();
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		cliente.setNomeCliente(ler.nextLine());
		System.out.print("Email: ");
		cliente.setEmail(ler.nextLine());

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		System.out.print("Data Nascimento(DD/MM/AAAA): ");
		String dataN = ler.nextLine();
		cliente.setDataNascimento(sdf.parse(dataN));
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(ler.next());
		System.out.print("Quantos items serão adicionados ao pedido? ");
		int qtd = ler.nextInt();
		ler.nextLine();
		
		for (int cont = 1; cont <= qtd; cont++ ) {
			System.out.println("Entre com dados do #" + cont + " item :");
			System.out.print("Nome Produto: ");
			String nomeProduto = ler.nextLine();
			System.out.print("Preço Produto: ");
			Double precoProduto = ler.nextDouble();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			Integer quantidade = ler.nextInt();
			
			OrderItem ordemItems = new OrderItem(quantidade, precoProduto, produto);
			order.addItem(ordemItems);
			
			ler.nextLine();
		}
		
		System.out.println("");
		
		System.out.println("Sumário do Pedido: ");
		//Aqui vai o toString
		
		System.out.println("Itens do Pedido: ");
		//Aqui vai o toString
		
		System.out.printf("Total: " + order.total());
		
		ler.close();

	}

}
