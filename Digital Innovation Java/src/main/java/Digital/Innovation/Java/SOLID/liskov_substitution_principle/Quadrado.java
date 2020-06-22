package Digital.Innovation.Java.SOLID.liskov_substitution_principle;

public class Quadrado extends Retangulo{

	@Override
	public void setAltura(double altura) {
		super.setLargura(altura);
		super.setAltura(altura);
	}
	
	@Override
	public void setLargura(double largura) {
		super.setAltura(largura);
		super.setLargura(largura);
	}
}
