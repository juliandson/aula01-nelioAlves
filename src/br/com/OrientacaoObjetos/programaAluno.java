package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Aluno;

public class programaAluno {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno al = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		al.nome = sc.nextLine();
		
		System.out.println();
		System.out.println("Insira a nota do primeiro bimestre");
		al.bim1 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Insira a nota do segundo bimestre");
		al.bim2 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Insira a nota do terceiro bimestre");
		al.bim3 = sc.nextDouble();
		
		double a = 0;

		System.out.println(al.CalculoMedia(a));
		System.out.println();
		
	
		
		
		
		
		
		
		
	}

}
