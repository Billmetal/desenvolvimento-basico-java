package Digital.Innovation.Java.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/***Exercício Final****
 * 
 * Crie uma fila e execute as seguintes operações :
 * 
 * - Adicione 5 nomes : Juliana,Pedro,Carlos,Larissa e João.
 * - Navegue na fila exibindo cada nome no console.
 * - Retorne o primeiro item da fila , sem removê-lo.
 * - Retorne o primeiro item da fila , removendo o mesmo.
 * - Adicione um novo nome: Daniel. Verifique a posição que o mesmo
 * 		assumiu na fila.
 * - Retorne o tamanho da lista.
 * - Verifique se a lista esta vazia.
 * - Verifique se o nome Carlos está na lista.*/

public class ExercicioFinal {

	public static void main(String[] args) {
		
		Queue<String> filaNoCaixa = new LinkedList<>();
		
		filaNoCaixa.add("Juliana");
		filaNoCaixa.add("Pedro");
		filaNoCaixa.add("Carlos");
		filaNoCaixa.add("Larissa");
		filaNoCaixa.add("João");
		
		for(String nome:filaNoCaixa) {
			System.out.println(nome);
		}
		
		String primeiroNaFila = filaNoCaixa.peek();
		
		System.out.println(primeiroNaFila);
		
		primeiroNaFila = filaNoCaixa.poll();
		
		System.out.println(primeiroNaFila);
		
		filaNoCaixa.add("Daniel");
		
		System.out.println(filaNoCaixa);
		
		System.out.println(filaNoCaixa.size());
		
		System.out.println(filaNoCaixa.isEmpty());
		
		System.out.println(filaNoCaixa.contains("Carlos"));		
	}

}
