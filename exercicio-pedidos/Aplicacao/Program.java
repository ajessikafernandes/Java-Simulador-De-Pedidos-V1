package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Ordem;
import Entidades.Pedidos;
import Enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Informe os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		System.out.print("Data de Nascimento: ");
		String dataNascimento = ler.nextLine();
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		ler.nextLine();
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String status = ler.nextLine();
				
		StatusPedido.valueOf(status);
		
		System.out.println("Quantos itens deverá ser acrescentado ao pedido: ");
		int qtdItem = ler.nextInt();
		ler.nextLine();
		
		//List <Pedidos> pedido = new ArrayList <>();
		
		for (int cont = 1; cont < qtdItem; cont++) {
			System.out.println("Entre com os dados do item #" + cont + " :");
			System.out.print("Nome produto: ");
			String nomeItem = ler.nextLine();
			System.out.print("Preço do produto: ");
			double preco = ler.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = ler.nextInt();
			
//			Pedidos pedido = new Pedidos (nomeItem, preco, quantidade);
		}
		
		System.out.println("Pedido Finalizado: ");
		Date momento = sdf.parse(ler.next());
		
		System.out.print("Pedido realizado: "); 
		System.out.println(momento);
		System.out.println("Status do pedido: ");
		System.out.println("Cliente");
		System.out.println(cliente);
		
		ler.close();
	}

}
