package Digital.Innovation.Java.optionals;

import java.util.Optional;

/****Exercício Final*********
 * 
 *Crie um optional de um determinado tipo de dado:
 *
 *- Crie com estado vazio, estado presente e com null
 *- Se presente , exiba o valor no console
 *- Se Vazio , lançe uma exceção IlegalStateException
 *- Se Vazio , exiba "Optional Vazio" no console
 *- Se presente , transforme o valor e exiba no console
 *- Se presente , pegue o valor do optional e atribua em uma variável
 *- Se presente , filtre o optional com uma determinada regra de negócio
 *
 ***/

public class ExercicioFinal {

	public static void main(String[] args) {
		
		Optional<String> optVazio = Optional.empty();
		Optional<String> optPresente = Optional.of("Resolvendo Exercício !"); 
		Optional<String> optNulo = Optional.ofNullable(null);
		
		optVazio.ifPresent(System.out::println);
		optPresente.ifPresent(System.out::println);
		optNulo.ifPresent(System.out::println);
		
		optVazio.orElseThrow(IllegalStateException::new);
		optPresente.orElseThrow(IllegalStateException::new);
		optNulo.orElseThrow(IllegalStateException::new);
		
		if(optVazio.isEmpty() || optPresente.isEmpty() || optNulo.isEmpty()) {
			System.out.println("Optional Vazio");
		}
		
		optVazio.map((valor) -> valor = "Transformando Valor !").ifPresent(System.out::println);
		optPresente.map((valor) -> valor = "Transformando Valor !").ifPresent(System.out::println);
		optNulo.map((valor) -> valor = "Transformando Valor !").ifPresent(System.out::println);
		
		if(optVazio.isPresent()) {
			String valor = optVazio.get();
		}
		if(optPresente.isPresent()) {
			String valor = optVazio.get();
		}
		if(optNulo.isPresent()) {
			String valor = optVazio.get();
		}
		
		optVazio.ifPresent((valor) -> valor.endsWith("!"));
		optPresente.ifPresent((valor) -> valor.contains("!"));
		optNulo.ifPresent((valor) -> valor.isEmpty());
	}

}
