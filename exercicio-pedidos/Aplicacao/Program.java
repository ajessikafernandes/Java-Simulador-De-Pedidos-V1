package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.OrdemFinal;
import Entidades.OrdemItens;
import Entidades.Produto;

import Enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		/* LISTAS */
		List<Cliente> cliente = new ArrayList<>();
		List<Produto> pd = new ArrayList<>();
		List<OrdemItens> po = new ArrayList<>();

		System.out.println("Informe os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		System.out.print("Data de Nascimento (DD/MM/AAAA): ");
		String dataNascimento = ler.nextLine();

		cliente.add(new Cliente(nome, email, dataNascimento));

		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(ler.next());

		System.out.print("Quantos itens deverá ser acrescentado ao pedido: ");
		int qtdItem = ler.nextInt();
		ler.nextLine();

		System.out.println();

		/* Objetos */
		Produto produto = new Produto();
		OrdemItens pedidos = new OrdemItens();
		OrdemFinal ordem = new OrdemFinal();

		for (int cont = 1; cont <= qtdItem; cont++) {
			System.out.println("Entre com os dados do item #" + cont + " :");
			System.out.print("Nome produto: ");
			// produto.setNome(ler.nextLine());
			String nomeItem = ler.nextLine();

			System.out.print("Preço do produto: ");
			// produto.setPreco(ler.nextDouble());
			double preco = ler.nextDouble();

			pd.add(new Produto(nomeItem, preco));

			System.out.print("Quantidade: ");
			// pedidos.setQuantidade(ler.nextInt());
			int quantidade = ler.nextInt();

			// o.add(quantidade);

			ler.nextLine();

		}

		System.out.println("Dados do Pedido: ");

		System.out.print("Pedido realizado: ");
		Calendar cal = Calendar.getInstance();
		String dataf = sdf.format(cal.getTime());
		System.out.println(dataf);

		System.out.println("Status do pedido: " + status);
		System.out.println("Cliente: " + cliente);

		System.out.println("Itens do Pedido: " );
		
		System.out.println(produto.getNome() + ", $" + pedidos.getQuantidade() + "SubTotal" + pedidos.subtotal() );
		
		
//		for (Pedidos pd1 : po) {
//			System.out.println(produto.getNome() + ", $" + pedidos.getQuantidade() + "SubTotal" + pedidos.subtotal() );
//			System.out.println();
//		}

		ler.close();
	}

}
