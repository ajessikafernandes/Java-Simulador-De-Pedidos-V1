package Application;

import java.util.Scanner;

public class LeituraMatrizes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de linhas: ");
		String a = "a" ;
		
		System.out.print("Informe a quantidade de colunas: ");
		String b = "haha";
		String[][] matriz= new String[a][b];
		
		ler.nextLine();
		
		int x = 0;
		
		for (int cont = 0; cont < matriz.length; cont ++) {
						
			for (int cont2 = 0; cont2 < matriz.length; cont2 ++) {
				System.out.println("Informe os valores: ");
			
				matriz [a][b] = matriz[2][2];
				
				System.out.println(a);
			}
		}
		
		ler.close(); 
		 
	}
}
