package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.ContaCliente;

public class ProgramaConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaCliente conta;

		System.out.println("Insira os Dados para a abertura da conta");
		System.out.println("Insira seu nome");
		String nome = sc.nextLine();
		System.out.println("Insira o numero da  conta");
	
		int numeroConta = sc.nextInt();
		System.out.println("Qual valor deposito inicial?");

		double depositoInicial = sc.nextDouble();
		if (depositoInicial > 0) {
			conta = new ContaCliente(nome, numeroConta, depositoInicial);
		} else {
			conta = new ContaCliente(nome, numeroConta);
		}

		System.out.println(conta.toString());
		

		System.out.println("Entre com valor a ser depositado");
		double deposito = sc.nextDouble();
		
		conta.deposito(deposito);

		
		System.out.println(conta.toString());
		
		System.out.println("Entre com valor a ser sacado: ");
		double saque = sc.nextDouble();
		
		conta.saque(saque);
		System.out.println(conta.toString());

	}

}
