package Application;

import java.util.Scanner;

public class LeituraMatrizes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de linhas: ");
		int linha = ler.nextInt();
		
		System.out.print("Informe a quantidade de colunas: ");
		int coluna = ler.nextInt();
		int [][] matriz= new int [linha][coluna];
		ler.nextLine();
		
		for (linha = 0; linha < matriz.length; linha ++) {		
			for (coluna = 0; coluna < matriz[linha].length; coluna ++) {
					
				matriz [linha][coluna] = ler.nextInt();
				
			}
		}
		
		ler.nextLine();
		
		System.out.println("Informe o número: ");
		int numero = ler.nextInt();
		ler.nextLine();
		
		for (linha = 0; linha < matriz.length; linha++) {		
			for (coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (numero == matriz[linha][coluna]) {
				System.out.println("Posição é igual a " + linha + "," + coluna + " .");
				}
			}
		}
		
		ler.close(); 
		 
	}
}
