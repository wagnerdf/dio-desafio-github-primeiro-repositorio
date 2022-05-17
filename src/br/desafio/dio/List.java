package br.desafio.dio;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.List<String> list = new ArrayList<>();

		//Adicionado nomes em uma lista 
		list.add("Wagner");
		list.add("Marina");
		list.add("Bruna");
		list.add("Valmir");
		list.add("Raquel");
		list.add("Dany");
		//Adiciona na posição 3 da lista o nome Valdeir
		list.add(3,"Valdeir");
		
		//Informa o tamanho da lista
		System.out.println(list.size());
		
		//Imprime os valores percorrendo a lista 
		for(String x : list) {
			System.out.println(x);
		}
		
		//Removendo elemento das lista que inicia com a letra V
		System.out.println("---------------------------------");
		list.removeIf(x -> x.charAt(0) == 'V');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//Imprime a posição em que o nome se encontra na lista, caso não encontre o valor retornado será -1
		System.out.println("---------------------------------");
		System.out.println("Index of Raquel: "+ list.indexOf("Raquel"));
		System.out.println("Index of Lucelia: "+ list.indexOf("Lucelia"));
		System.out.println("---------------------------------");
		java.util.List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		//Imprime todos registros iniciados com a letra D, caso não encontre o valor retornado será NULL
		System.out.println("---------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
