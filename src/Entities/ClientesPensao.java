package Entities;

public class ClientesPensao {

	private String nome;
	private String email;
	
	public ClientesPensao(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
}
