package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Ponto;

public class ProgramaMatriz {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de linhas da matriz: ");
		int l = sc.nextInt();
		
		System.out.println("Insira a quantidade de colunas");
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for(int i=0;i<l;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Insira o Proximo numero: ");
				mat[i][j] = sc.nextInt(); 
				
			}
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0; j<mat[0].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Insira o numero a ser consultado na matriz: ");
		int num = sc.nextInt();
		
		Ponto p = new Ponto(num);
		
		
		
		


		}
		
	
}
