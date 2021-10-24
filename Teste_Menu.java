package Avaliacao1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teste_Menu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta>Contas = new ArrayList<Conta>();
		int opt = 0, controle;
		
		String nomAgencia, nomCliente, CPFCliente;
		int numAgencia;
		double valorDeposito;
		
		Random geradorConta = new Random();
		
		do {
			System.out.println("1. Cadastrar");
			System.out.println("2. Depositar");
			System.out.println("3. Render Juros");
			System.out.println("4. Consultar Número da Agência");
			System.out.println("5. Alterar Número e Nome da Agêmcia");
			System.out.println("0. Sair");
			opt = sc.nextInt();
			
		switch(opt) {
		
		case 1:
		System.out.println();
		System.out.println("Nome da Agência: ");
		nomAgencia = sc.next();
		System.out.println("Número da Agência: ");
		numAgencia = sc.nextInt();
		System.out.println("Seu Nome: ");
		nomCliente = sc.next();
		System.out.println("Seu CPF: ");
		CPFCliente = sc.next();
		int numConta = geradorConta.nextInt(100);
		System.out.println("O Número da Sua Conta é: "+numConta);
			
		System.out.println("1. Poupança");
		System.out.println("2. Outra");
		controle = sc.nextInt();
			
		if(controle == 1);
		{
			Contas.add(new Poupanca(numConta, new banco(numAgencia, nomAgencia), new Clientes(nomCliente, CPFCliente), 0.0));
         }
			{
				Contas.add(new Conta(numConta, new banco(numAgencia, nomAgencia), new Clientes(nomCliente, CPFCliente), 0.0));
			}
			System.out.println("Cadastro Realizado com Sucesso!!");
			System.out.println("Saldo Inicial : 0.0");
		 break;
		 
		case 2:
			System.out.println("Infome Seu CPF: ");
			CPFCliente = sc.next();
			
			for (int i = 0; i < Contas.size(); i++) {
				if(Contas.get(i).getCliente().getCPF().equals(CPFCliente))
				{
					System.out.println("Valor a Ser Depositado: ");
					valorDeposito = sc.nextDouble();
					Contas.get(i).setSaldo(valorDeposito);
				}
			}
		break;
		
		case 3:
			System.out.println("Informe Seu CPF: ");
			CPFCliente = sc.next();
			
			for (int i = 0; i < Contas.size(); i++)
			{
				if(Contas.get(i) instanceof Poupanca)
				{
				 if(((Poupanca) Contas.get(i)).getCliente().getCPF().equals(CPFCliente))
				 {
					 System.out.println("Rendimento: "+((Poupanca)Contas.get(i)).RenderJuros());
				 }
				}
			}
		   break;
		   
		case 4:
			System.out.println("Numero da Agência: ");
			numAgencia = sc.nextInt();
			System.out.println("Nome da Agência: ");
			nomAgencia = sc.next();
			
			for ( int i = 0; i < Contas.size(); i++) {
				if(Contas.get(i).getBanco().getNomAgencia().equals(nomAgencia) && Contas.get(i).getBanco().getNumAgencia() == numAgencia)
				{
					System.out.println("Nome do Cliente: "+Contas.get(i).getCliente().getNome());
					System.out.println("CPF do Cliente: "+Contas.get(i).getCliente().getCPF());
				}
				}
			System.out.println("Agência Não Cadastrada!!");
			break;
			
		case 5:
			System.out.println("Informe seu nome: ");
			nomCliente = sc.next();
			
			for (int i = 0; i < Contas.size(); i++) {
				if(Contas.get(i).getCliente().getNome().equals(nomCliente))
				{
					System.out.println("Novo número da Agência: ");
					numAgencia = sc.nextInt();
					System.out.println("Nova Agência: ");
					nomAgencia = sc.next();			
					Contas.get(i).getBanco().setNumAgencia(numAgencia);
					Contas.get(i).getBanco().setNomAgencia(nomAgencia);
					System.out.println("Dados alterados com sucesso.");
				}
			}	
			break;
				}
			}while(opt!=0);
		}
								
		}
