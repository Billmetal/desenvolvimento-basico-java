package Digital.Innovation.Java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***Exerc�cio Final****
 * 
 * Crie uma lista e execute as seguintes opera��es :
 * 
 * - Adicione 5 nomes : Juliana,Pedro,Carlos,Larissa e Jo�o.
 * - Navegue na lista exibindo cada nome no console.
 * - Substitua o nome Carlos por Roberto.
 * - Retorne o nome da posi��o 1.
 * - Remova o nome da posi��o 4.
 * - Remova o nome Jo�o.
 * - Retorne a quantidade de itens na lista.
 * - Verifique se o nome Juliano existe na lista.
 * - Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os
 * 		itens da nova lista na primeira lista criada.
 * - Ordene os itens da lista por ordem alfabetica.
 * - Verifique se a lista esta vazia.*/

public class ExercicioFinal {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("Jo�o");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.set(2,"Roberto");
		
		System.out.println(nomes.get(1));
		
		nomes.remove(4);
		
		nomes.remove("Jo�o");
		
		System.out.println(nomes.size());
		
		System.out.println(nomes.contains("Juliano"));
		
		List<String> nomes2 = new ArrayList<>();
		nomes2.add("Ismael");
		nomes2.add("Rodrigo");
		
		nomes.addAll(nomes2);
		
		Collections.sort(nomes);
		
		System.out.println(nomes.isEmpty());
		
		System.out.println(nomes);
		
	}

}
