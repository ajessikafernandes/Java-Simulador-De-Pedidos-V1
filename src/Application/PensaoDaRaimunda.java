package Application;

import java.util.Scanner;

import Entities.ClientesPensao;

public class PensaoDaRaimunda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ClientesPensao[] vectorQuartos = new ClientesPensao[10];
		
		System.out.print("Informe quantos quartos serão alugados: ");
		int qtdQuartos = sc.nextInt();
		
		
		for (int cont = 0; cont < qtdQuartos; cont ++ ) {
			sc.nextLine();
			System.out.println("Alugar #" + cont + " : ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Número do quarto? ");
			int quartoAlugado = sc.nextInt();
			
			vectorQuartos[quartoAlugado] = new ClientesPensao(nome, email);

		}
		
		System.out.print("\n");
		System.out.println("Quartos reservados: ");
		sc.nextLine();
		
		for(int cont = 0; cont < vectorQuartos.length; cont ++ ) {
			if (vectorQuartos[cont] != null) {
				System.out.println(cont + ": " + vectorQuartos[cont].getNome() + ", " + vectorQuartos[cont].getEmail());
			}
		}
		
		sc.close();
	}

}
