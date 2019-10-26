package br.com.OrientacaoObjetos;

import java.util.Scanner;

public class NumeroMaior {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 valores: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		
		ShowResult(maior);
		
		sc.close();
	}
	
	public static int max(int x,int y, int z) {
		
		int aux;
		if(x > y) {
			aux =x;
		}else if(y > z){
			aux = y;
		}else{
			aux =z;
		}
		
		return aux;
	}
	
	public static void ShowResult(int valor) {
		System.out.println("Maior = " + valor);
	}

}
