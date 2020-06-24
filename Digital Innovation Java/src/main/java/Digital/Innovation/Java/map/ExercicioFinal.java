package Digital.Innovation.Java.map;

import java.util.HashMap;
import java.util.Map;

/*****Exercício Final******
 * 
 * Crie um Map execute as seguintes operações :
 * 
 * - Adicione os 26 estados brasileiros no map, onde a sigla será a chave
 * 		e o nome do estado o valor.
 * - Remova o estado de Minas Gerais.
 * - Adicione o Distrito Federal.
 * - Verifique o tamanho do mapa.
 * - Remova o estado de Mato Grosso do Sul usando o nome.
 * - Navegue em todos os registros do map , mostrando no console no 
 * 		seguinte formato: NOME(SIGLA).
 * - Verifique se o estado de Santa Catarina existe no map buscando 
 * 		por sua sigla (SC).
 * - Verifique se o estado do Maranhão existe no map buscando por seu nome.
 * 
 * */

public class ExercicioFinal {

	public static void main(String[] args) {
		
		Map<String,String> estados = new HashMap<>();
		
		estados.put("AC","Acre");
		estados.put("AL","Alagoas");
		estados.put("AP","Amapá");
		estados.put("AM","Amazonas");
		estados.put("BA","Bahia");
		estados.put("CE","Ceará");
		estados.put("ES","Espírito Santo");
		estados.put("GO","Goiás");
		estados.put("MA","Maranhão");
		estados.put("MT","Mato Grosso");
		estados.put("MS","Mato Grosso do Sul");
		estados.put("MG","Minas Gerais");
		estados.put("PA","Pará");
		estados.put("PB","Paraíba");
		estados.put("PR","Paraná");
		estados.put("PE","Pernambuco");
		estados.put("PI","Piauí");
		estados.put("RJ","Rio de Janeiro");
		estados.put("RN","Rio Grande do Norte");
		estados.put("RS","Rio Grande do Sul");
		estados.put("RO","Rondônia");
		estados.put("RR","Roraima");
		estados.put("SC","Santa Catarina");
		estados.put("SP","São Paulo");
		estados.put("SE","Sergipe");
		estados.put("TO","Tocantins");
		
		estados.remove("MG");
		
		estados.put("DF","Distrito Federal");		
		
		System.out.println(estados.size());
		
		estados.remove("Mato Grosso do Sul");
		
		for(Map.Entry<String,String> estado:estados.entrySet()) {
			System.out.println(estado.getValue()+"("+estado.getKey()+")");
		}
		
		System.out.println(estados.containsKey("SC"));
		
		System.out.println(estados.containsValue("Maranhão"));
	}

}
