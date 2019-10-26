package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Retangulo;

public class ProgramaRetangulo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		Retangulo ret = new Retangulo();
		
		System.out.println("Entre com a base do retangulo: ");
		ret.base = sc.nextDouble();
		
		System.out.println();
		System.out.println("Entre com a altura do retangulo: ");
		ret.altura = sc.nextDouble();
		
		System.out.printf("Area do Retangulo: %.2f%n", ret.area());
		System.out.printf("Perimetro Retangulo: %.2f%n", ret.perimetro());
		System.out.printf("Diagonal do Retangulo: %.2f%n", ret.diagonal());
		
		
	}

}
