package Digital.Innovation.Java.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		// Adiciona os numeros no Set
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(1);
		
		System.out.println(sequenciaNumerica);
		
		// Remove o numero do Set
		sequenciaNumerica.remove(4);
		
		System.out.println(sequenciaNumerica);
		
		// Retorna a quantidade de itens do Set
		System.out.println(sequenciaNumerica.size());
		
		// Navega em todos os itens do iterator
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
				
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				
		for(Integer numero:sequenciaNumerica) {
			System.out.println(numero);
		}
		
		// Retorna se o Set esta vazio ou n�o
		System.out.println(sequenciaNumerica.isEmpty());
	}

}
