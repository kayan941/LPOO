package Avaliacao1;

public class Conta {
	
	private int Numero;
	private banco Banco;
	private Clientes Cliente;
	private double Saldo;
	
	public Conta(int Numero, banco Banco, Clientes Cliente, double Saldo) {
		super();
		this.Numero = Numero;
		this.Banco = Banco;
		this.Cliente = Cliente;
		this.Saldo = Saldo;

	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public banco getBanco() {
		return Banco;
	}

	public void setBanco(banco banco) {
		Banco = banco;
	}

	public Clientes getCliente() {
		return Cliente;
	}

	public void setCliente(Clientes cliente) {
		Cliente = cliente;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

}
