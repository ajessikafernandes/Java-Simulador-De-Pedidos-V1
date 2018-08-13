package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Pedidos;
import Entidades.Produto;

import Enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		List<Cliente> cliente = new ArrayList<>();
		
		System.out.println("Informe os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		System.out.print("Data de Nascimento: ");
		String dataNascimento = ler.nextLine();
		
		cliente.add(new Cliente (nome, email, dataNascimento ));
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(ler.next());
				
		System.out.print("Quantos itens deverá ser acrescentado ao pedido: ");
		int qtdItem = ler.nextInt();
		ler.nextLine();
		
		System.out.println();
		
		List <Produto> produto = new ArrayList <>();
		List <Pedidos> pedidos = new ArrayList <>();
		
		for (int cont = 1; cont <= qtdItem; cont++) {
			System.out.println("Entre com os dados do item #" + cont + " :");
			System.out.print("Nome produto: ");
			String nomeItem = ler.nextLine();
			System.out.print("Preço do produto: ");
			double preco = ler.nextDouble();
			
			produto.add(new Produto (nomeItem, preco));
			
			System.out.print("Quantidade: ");
			int quantidade = ler.nextInt();
			ler.nextLine();
		
			//pedidos.add(quantidade);
			
		}
		
		System.out.println("Dados do Pedido: ");
		System.out.print("Pedido realizado: "); 
		Calendar cal = Calendar.getInstance();
		String dataf = sdf.format(cal.getTime());
		System.out.println(dataf);
		System.out.print("Status do pedido: ");
		System.out.println(status);
		System.out.print("Cliente: ");
		System.out.println(cliente);
		
		System.out.println("Itens do Pedido: ");
		System.out.println(produto);
		
		ler.close();
	}

}
