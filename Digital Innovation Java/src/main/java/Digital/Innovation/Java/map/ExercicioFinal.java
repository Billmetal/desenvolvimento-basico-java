package Digital.Innovation.Java.map;

import java.util.HashMap;
import java.util.Map;

/*****Exerc�cio Final******
 * 
 * Crie um Map execute as seguintes opera��es :
 * 
 * - Adicione os 26 estados brasileiros no map, onde a sigla ser� a chave
 * 		e o nome do estado o valor.
 * - Remova o estado de Minas Gerais.
 * - Adicione o Distrito Federal.
 * - Verifique o tamanho do mapa.
 * - Remova o estado de Mato Grosso do Sul usando o nome.
 * - Navegue em todos os registros do map , mostrando no console no 
 * 		seguinte formato: NOME(SIGLA).
 * - Verifique se o estado de Santa Catarina existe no map buscando 
 * 		por sua sigla (SC).
 * - Verifique se o estado do Maranh�o existe no map buscando por seu nome.
 * 
 * */

public class ExercicioFinal {

	public static void main(String[] args) {
		
		Map<String,String> estados = new HashMap<>();
		
		estados.put("AC","Acre");
		estados.put("AL","Alagoas");
		estados.put("AP","Amap�");
		estados.put("AM","Amazonas");
		estados.put("BA","Bahia");
		estados.put("CE","Cear�");
		estados.put("ES","Esp�rito Santo");
		estados.put("GO","Goi�s");
		estados.put("MA","Maranh�o");
		estados.put("MT","Mato Grosso");
		estados.put("MS","Mato Grosso do Sul");
		estados.put("MG","Minas Gerais");
		estados.put("PA","Par�");
		estados.put("PB","Para�ba");
		estados.put("PR","Paran�");
		estados.put("PE","Pernambuco");
		estados.put("PI","Piau�");
		estados.put("RJ","Rio de Janeiro");
		estados.put("RN","Rio Grande do Norte");
		estados.put("RS","Rio Grande do Sul");
		estados.put("RO","Rond�nia");
		estados.put("RR","Roraima");
		estados.put("SC","Santa Catarina");
		estados.put("SP","S�o Paulo");
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
		
		System.out.println(estados.containsValue("Maranh�o"));
	}

}
