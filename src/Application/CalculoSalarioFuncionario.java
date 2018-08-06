package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;

public class CalculoSalarioFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de registro de funcionários: ");
		int qtdFuncionario = sc.nextInt();

		List<Funcionario> listFuncionario = new ArrayList<>();

			for (int cont = 0; cont < qtdFuncionario ; cont ++) {
				sc.nextLine();
				System.out.println("Funcionario #" + cont + " :");
				System.out.print("Id: ");
				Integer id = sc.nextInt();
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Salário: ");
				double salario = sc.nextDouble();
				System.out.print("\n");
				listFuncionario.add(new Funcionario(id, nome, salario));
			}

		System.out.print("Tamanho da lista :" + listFuncionario.size());
		System.out.print("\n");
		
		System.out.print("Entre com o Id do funcionário que receberá o aumento Salarial: ");
		int idFuncionario = sc.nextInt();
		
		System.out.print("\n");
		
		Funcionario emp = listFuncionario.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("Este número não existe no sistema.");
		} else {
			System.out.print("Informe o valor percentual: ");
			double porcentagem = sc.nextDouble();
			emp.recebeAumento(porcentagem);
		} 
		
		System.out.println();
		System.out.println("Lista de Funcionários: ");
		
		for (Funcionario list : listFuncionario) {
			System.out.println(list);
		}

		sc.close();
	}

}
