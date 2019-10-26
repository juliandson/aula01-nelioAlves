package br.com.OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Produto;

public class ProgramaProdutos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com novo produto:");
		System.out.println("Produto:");
		String nome = sc.nextLine();
		System.out.println("Preço:");
		double preco = sc.nextDouble();
		System.out.println("quantidade:");
		int quantidade = sc.nextInt();
		
		Produto prod = new Produto(nome,  preco);
		
		prod.setNome("Computador");
		System.out.println("Atualização de nome: " + prod.getNome());
		
		System.out.println(prod);
		
		System.out.println();
		System.out.println("Entre com a quantidade de produtos que deseja adcionar");
		int quant = sc.nextInt();
		prod.adcionaProoduto(quant);
		
		System.out.println();
		System.out.println(prod);
		
		System.out.println();
		System.out.println("Entre com a quantidade de produtos que deseja retirar");
		int rem = sc.nextInt();
		prod.retiraProduto(rem);
		
		System.out.println();
		System.out.println(prod);
	}

}
