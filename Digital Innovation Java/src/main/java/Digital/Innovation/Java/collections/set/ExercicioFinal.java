package Digital.Innovation.Java.collections.set;

import java.util.HashSet;
import java.util.Set;

/*****Exerc�cio Final*******
 * 
 * Crie um Set e execute as seguintes opera��es : 
 * 
 * - Adicione 5 n�meros inteiros : 3,88,20,44,3.
 * - Navegue no Set exibindo cada n�mero no console.
 * - Remova o primeiro item do Set.
 * - Adicione um novo n�mero no Set : 23.
 * - Verifique o tamanho do Set.
 * - Verifique se o Set est� vazio.
 * 
 * */

public class ExercicioFinal {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		
		for(int num:numeros) {
			System.out.println(num);
		}
		
		numeros.remove(3);
		
		numeros.add(23);
		
		System.out.println(numeros.size());
		
		System.out.println(numeros.isEmpty());
	}

}
