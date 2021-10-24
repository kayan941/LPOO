package Avaliacao1;

public class banco {

	 private int numAgencia;
	 private String nomAgencia;
	 
	 public banco(int numAgencia, String nomAgencia) {
		 this.numAgencia = numAgencia;
		 this.nomAgencia = nomAgencia;
		 

	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNomAgencia() {
		return nomAgencia;
	}

	public void setNomAgencia(String nomAgencia) {
		this.nomAgencia = nomAgencia;
	}

}
