package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Conversao;

public class ProgramaConversao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("qual a cotação do dolar");
		double cotacao = sc.nextDouble();
		
		System.out.println("Quantos Dolares deseja comprar?");
		double dolar = sc.nextDouble();
		
		System.out.printf("O valor a ser pago em Reais é: %.2f%n", Conversao.cotacao(cotacao, dolar));
		
		
	}

}
