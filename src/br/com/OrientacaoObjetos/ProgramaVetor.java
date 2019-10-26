package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;
import Entidade.Produtc;

public class ProgramaVetor {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		Produtc[] vetor = new Produtc[n];	
		
		for(int i = 0;i<vetor.length;i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produtc(nome,preco);
		}
		
		double sum = 0.0;
		for(int i=0; i<vetor.length;i++) {
			sum = sum + vetor[i].getPreco();
		}
		
		double avg = sum / 3;
		
		System.out.printf("A media é %.2f%n", avg);
	}

}
