package Entities;

public class ReforcoListaFuncionarios {

	private int id;
	private String nome;
	private double salario;
	
	public ReforcoListaFuncionarios (int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public void listar (int id, String nome, double salario) {
		System.out.println(id + " - " + nome + ", $" + salario);
	}
	
	public void aumentoSalario(double porcentagem) {
		salario += salario * porcentagem;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public char[] listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
