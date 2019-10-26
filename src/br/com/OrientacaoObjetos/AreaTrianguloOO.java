package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;
import Entidade.Triangulo;


public class AreaTrianguloOO {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as 3 areas do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as 3 areas do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
	
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area do triangulo y: %.4f%n", areaX );
		System.out.printf("Area do triangulo y: %.4f%n", areaY );
		
		if(areaX > areaY) {
			System.out.println("X é a maior area!!!/n");
		}else{
			System.out.println("Y é a maior area!!!/n");
		}
		
		sc.close();
	}

}
