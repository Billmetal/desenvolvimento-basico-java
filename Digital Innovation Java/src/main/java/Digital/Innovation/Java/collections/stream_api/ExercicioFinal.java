package Digital.Innovation.Java.collections.stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*****Exerc�cio Final**********
 * 
 * Utilizando uma lista com um objeto complexo (Estudante por exemplo) 
 * 		realize as seguintes opera��es : 
 * 
 * A) Transforme cada estudante em uma String com os atributos do objeto
 * B) Conte a quantidade de estudantes que tem na cole��o
 * C) Filtre estudantes com idade igual ou superior a 18 anos
 * D) Exiba cada elemento no console
 * E) Retorne estudantes com nome que possui a letra B
 * F) Retorne se existe ao menos um estudante com a letra D no nome 
 * G) Retorne o estudante mais velho (maior idade) da cole��o . Retorne o mais novo tamb�m***/

public class ExercicioFinal {

	public static void main(String[] args) {
		
		List<Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Estudante("Carlos", 16));
		estudantes.add(new Estudante("Diego", 17));
		estudantes.add(new Estudante("Carla", 17));
		estudantes.add(new Estudante("Marta", 18));
		estudantes.add(new Estudante("Henrrique", 19));
		estudantes.add(new Estudante("Sandra", 18));
		
		estudantes.stream().map(estudante -> estudante.toString());
		
		estudantes.stream().count();
		
		estudantes.stream().filter((estudante) -> estudante.getIdade() >= 18);
		
		estudantes.stream().forEach(System.out::println);
		
		System.out.println("Estudantes com a letra B no nome : "+estudantes.stream().filter((estudante) -> 
		estudante.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));
		
		System.out.println("Algum estudante com a letra D no nome ? "+estudantes.stream().anyMatch((elemento) -> 
			elemento.getNome().contains("d")));
		
		System.out.println("O estudante mais velho : "+estudantes.stream().max(Comparator.comparingInt(Estudante::getIdade)).get());
		
		System.out.println("O estudante mais novo : "+estudantes.stream().min(Comparator.comparingInt(Estudante::getIdade)).get());
	}

}

class Estudante{
	
	private final String nome;
	private final int idade;
	
	public Estudante(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return "Nome = "+nome+" , Idade = "+idade;
	}
}
