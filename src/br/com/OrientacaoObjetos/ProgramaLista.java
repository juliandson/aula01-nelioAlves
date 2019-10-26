package br.com.OrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaLista {
	
	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		list.add("Alex");
		list.add("Maria");
		list.add("Bob");
		list.add("Anna");
		list.add("Marco");
		list.add("Eduarda");
		list.add("Isabele");
		
		for(String pess : list) {
			System.out.println(pess);
		}
		
		System.out.println("---------------------------------------------");
		
		list.removeIf(pess -> pess.charAt(0) == 'E');
		for(String pess : list) {
			System.out.println(pess);
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Index of Bob: " + list.lastIndexOf("Bob"));
		System.out.println("Index of Isabele: " + list.lastIndexOf("Isabele"));
		
		System.out.println("---------------------------------------------");
		
		List<String> result = list.stream().filter(pess -> pess.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String pess : result) {
			System.out.println(pess);
		}
		
		System.out.println("---------------------------------------------");
		
		String nome = list.stream().filter(pess -> pess.charAt(0) == 'A').findFirst().orElse(null);
		

			System.out.println(nome);

	
	}

}
