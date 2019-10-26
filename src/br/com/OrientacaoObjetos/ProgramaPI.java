package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Calculadora;

public class ProgramaPI {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = 0;
		System.out.println("Entre com o raio");
		raio = sc.nextDouble();

		double c = Calculadora.circunferencia(raio);
		double b = Calculadora.volume(raio);
		System.out.printf("O valor de PI: %.2f%n", Calculadora.PI);
		System.out.printf("Circuferencia:  %.2f%n", Calculadora.circunferencia(b));
		System.out.printf("Volume:  %.2f%n", Calculadora.volume(c));

	}

}
