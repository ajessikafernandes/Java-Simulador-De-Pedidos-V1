package Aplicacao;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Enums.StatusPedido;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		String dataNascimento = ler.nextLine();
		
		//List <Cliente> cliente = new ArrayList <>();
		
		ler.nextLine();
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String status = ler.next();
		System.out.println("Quantos itens deverá ser acrescentado ao pedido: ");
		int qtdItem = ler.nextInt();
		
		for (int cont = 0; cont < qtdItem; cont++) {
			System.out.println("Entre com os dados do item #" + cont + " :");
			System.out.print("Nome produto: ");
			String nomeProduto = ler.nextLine();
			System.out.print("Preço do produto: ");
			double preco = ler.nextDouble();
			System.out.println("Quantidade: ");
			int qtd = ler.nextInt();
			
			
		}
		
		System.out.println("Pedido Finalizado: ");
		
		System.out.println();
		
	}

}
