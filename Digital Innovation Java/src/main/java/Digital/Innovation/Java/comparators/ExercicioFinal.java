package Digital.Innovation.Java.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/****Exercício Final****
 * 
 * Crie uma lista de um objeto complexo e execute as seguintes operações :
 * 
 * - Adicione elementos nesta lista.
 * - Ordene implementando a interface Comparable no seu objeto complexo.
 * - Ordene implementando um novo objeto com a interface Comparator.
 * - Ordene usando uma expressão lambda na chamada de suaLista.sort().
 * - Ordene usando referências de métodos e os métodos estáticos de Comparator.
 * - Ordene coleções TreeSet e TreeMap .
 * 
 * */

public class ExercicioFinal {

	public static void main(String[] args) {
		
		List<Jogador> jogadores = new ArrayList<>();
		
		jogadores.add(new Jogador("Daniela", 21, 1500));
		jogadores.add(new Jogador("Jonas", 18, 2600));
		jogadores.add(new Jogador("Paulo", 23, 3000));
		jogadores.add(new Jogador("Roberta", 17, 2000));
		jogadores.add(new Jogador("Artur", 19, 3200));
		jogadores.add(new Jogador("Renata", 22, 2500));
				
		
		Collections.sort(jogadores);
						
		Collections.sort(jogadores,new OrdenaPontuacao());
						
		jogadores.sort((first,second) -> first.getIdade() - second.getIdade());
		
		jogadores.sort(Comparator.comparingInt(Jogador::getIdade));
		
		jogadores.sort(Comparator.comparingInt(Jogador::getPotuacao));
		
		TreeSet<Jogador> treeJogadores = new TreeSet<>(new Comparator<Jogador>() {

			@Override
			public int compare(Jogador o1, Jogador o2) {
				return o2.getPotuacao() - o1.getPotuacao();
			}
		});
		
		treeJogadores.add(new Jogador("Larissa", 18, 2300));
		treeJogadores.add(new Jogador("Alfredo", 20, 3100));
		treeJogadores.add(new Jogador("Roger", 19, 2800));
		
		System.out.println(treeJogadores);
		
		TreeMap<Integer,String> ranking = new TreeMap<>((i1,i2) -> i2 - i1);
		
		ranking.put(15000, "Jeferson");
		ranking.put(10450, "Rodrigo");
		ranking.put(11500, "Renata");
		ranking.put(14900, "Anderson");
		ranking.put(14950, "Pamela");
		
		System.out.println(ranking);
	}

}

class Jogador implements Comparable<Jogador>{
	
	private final String nome;
	private final int idade,potuacao;
	
	public Jogador(String nome, int idade, int potuacao) {
		this.nome = nome;
		this.idade = idade;
		this.potuacao = potuacao;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getPotuacao() {
		return potuacao;
	}
	
	@Override
		public String toString() {
			return nome+" - "+idade+" - "+potuacao;
		}

	@Override
	public int compareTo(Jogador o) {
		return this.getIdade() - o.getIdade();
	}
		
}

class OrdenaPontuacao implements Comparator<Jogador>{
	
	@Override
	public int compare(Jogador o1, Jogador o2) {
		return o1.getPotuacao() - o2.getPotuacao();
	}
}


