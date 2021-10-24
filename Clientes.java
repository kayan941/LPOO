package Avaliacao1;

public class Clientes {
	private String nome, CPF;
	
	public Clientes(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
