package Digital.Innovation.Java.orientacao_objeto.part02.construtores.exemplo003;


public class Carro {

	private String marca,modelo,variante;
	private Integer ano;
	
	public Carro(String modelo, String marca, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = Integer.valueOf(ano);
	}

	public String getVariante() {
		return variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getAno() {
		return ano;
	}
	
	
	
}
