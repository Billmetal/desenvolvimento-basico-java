package Digital.Innovation.Java.orientacao_objeto.part03.heranca.exemplo003;

public class Gerente extends Funcionarios{
	
	private double imposto;

	public Gerente(double salario) {
		super(salario);
		this.imposto = (salario * 0.1) / 100;
	}
	
	public double verSalario() {
		return this.getSalario() - imposto;
	}
	
	public double pagoDeImposto() {
		return imposto;
	}

}
