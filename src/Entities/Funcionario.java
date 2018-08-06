package Entities;

public class Funcionario {

	private Integer id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario){
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario() {
	}

	public int getId() {
		return id;
	}
	public void setId(Integer id) {
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

	public void recebeAumento (double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString () {
		return id + ", " + nome + ", " + salario;
	}

}
