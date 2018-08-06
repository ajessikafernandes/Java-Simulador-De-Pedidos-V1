package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ReforcoListaFuncionarios;

public class ReforcoCalculoAumentoSalario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		List<ReforcoListaFuncionarios> fun = new ArrayList<>();

		System.out.print("Informe a quantidade de funcion�rios: ");
		int qtd = ler.nextInt();
		ler.nextLine();

		for (int cont = 1; cont <= qtd; cont++) {

			System.out.print("Informe o id: ");
			int id = ler.nextInt();
			ler.nextLine();

			System.out.print("Informe o nome funcion�rio: ");
			String nome = ler.nextLine();

			System.out.print("Informe o sal�rio do funcion�rio: ");
			double salario = ler.nextDouble();

			fun.add(new ReforcoListaFuncionarios(id, nome, salario));

			System.out.print("\n");

		}

		System.out.print("Size = " + fun.size());

		System.out.print("\n");

		System.out.print("Informe qual o id do Funcion�rio que receber� o aumento: ");
		int idFun = ler.nextInt();
		ler.nextLine();

		for (ReforcoListaFuncionarios list : fun) {
//
//			int idPromo = 0;
//			String opcao = null;
//
//				System.out.print("Informe qual o id do Funcion�rio que receber� o aumento: ");
//				idPromo = ler.nextInt();
//				ler.nextLine();
//				
//				if (list.getId() == idPromo) {
//					System.out.print("Informe qual a porcentagem : ");
//					double porcentagem = ler.nextDouble();
//					list.aumentoSalario(porcentagem);
//
//				} else if (list.getId() != idPromo) {
//					System.out.println("Id informado n�o encontrado.");
//
//				} else {
//					System.out.println("Deseja continuar a aplica��o(Y/N)?");
//					opcao = ler.nextLine();
//				}

			if (idFun == list.getId()) {
					System.out.print("Informe qual a porcentagem : ");
					double porcentagem = ler.nextDouble();
					list.aumentoSalario(porcentagem);
					
			} else {
				
				System.out.println("Id informado n�o encontrado.");
				
			}

		}

		System.out.println("\n");
		System.out.println("Lista de Funcion�rios: ");

		for (ReforcoListaFuncionarios list : fun) {
			System.out.println("#" + list.getId() + " - " + list.getNome() + ", $ " + list.getSalario() + " .");
		}

		ler.close();
	}

}
