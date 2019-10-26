package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Empregado;

public class ProgramaSalario {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		System.out.println("Digite o nome");
		emp.nome = sc.nextLine();
		
		System.out.println("Digite o salario");
		emp.salarioBruto = sc.nextDouble();
		
		System.out.println("Digite o taxa");
		emp.taxa = sc.nextDouble();
		
		
		System.out.println("Nome: " + emp.nome);
		System.out.println("Salario Liquido" + emp.salarioLiquido());
		System.out.println("Taxa; " + emp.taxa);
		
		System.out.println("Qual a porccentagem de gratificação?");
		double gratificacao =  sc.nextDouble();
		emp.incremento(gratificacao);
		
		System.out.printf("O salario mais a Gratificação: %.2f%n", emp.incremento(gratificacao));
		
		
		
		
		
		
		
		
	}

}
