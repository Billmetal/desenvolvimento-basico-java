package Digital.Innovation.Java.SOLID.liskov_substitution_principle;

public class Retangulo {
	
	private double altura,largura;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getArea() {
		return altura * largura;
	}

}
