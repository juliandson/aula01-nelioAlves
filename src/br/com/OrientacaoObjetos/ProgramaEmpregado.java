package br.com.OrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaEmpregado {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Colabooradores serão anexados?");
		int x = sc.nextInt();
		
		List<String> lista = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<x;i++) {
			System.out.println("Colaborador #" + i + 1);
			System.out.println("Id: ");
			list.add(sc.nextInt());
			System.out.println("Nome: : ");
			sc.nextLine();
			lista.add(sc.nextLine());
			System.out.println("Salario: ");
			list.add(sc.nextInt());			
		}
		for(int i=0;i<x;i++) {
			System.out.println("Colaborador #" + i + 1);
			System.out.printf("Id: ", list.get(i));
			System.out.printf("Nome: : ", lista.get(i));
			System.out.printf("Salario: ", list.get(i));
		}
	}

}
