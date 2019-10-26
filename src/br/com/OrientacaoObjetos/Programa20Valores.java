package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class Programa20Valores {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	int x = sc.nextInt();
	double[] vetor = new double[x];
	
	for(int i=0;i<x;i++) {
		vetor[i] = sc.nextDouble();
	}
		
	double soma = 0.0;
	
	for(int i=0;i<x;i++) {
		soma +=vetor[i];
	}
	
	double media = soma / x;
	
	System.out.printf("A altura media é: %.2f%n", media);
	
	
	}

}
