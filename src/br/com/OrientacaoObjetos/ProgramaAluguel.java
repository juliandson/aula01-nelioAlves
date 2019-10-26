package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Inquilino;

public class ProgramaAluguel {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Inquilino[] inq = new Inquilino[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int x = sc.nextInt();
		
		for(int i = 0;i<x;i++) {
			System.out.println("Nome do Aluno: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("QUARTO LOCADO");
			int al = sc.nextInt();
			inq[al] = new Inquilino(nome,email);
		}
		
		System.out.println("Quartos alugados: ");
		
		for(int i=0;i<10;i++) {
			if(inq[i] != null) {
			System.out.println(i + ", " + inq[i]);
			}
		}
		
		sc.close();
		
	}
			
			
}
