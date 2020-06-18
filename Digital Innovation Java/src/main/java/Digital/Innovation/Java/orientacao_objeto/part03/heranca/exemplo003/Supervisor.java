package Digital.Innovation.Java.orientacao_objeto.part03.heranca.exemplo003;

public class Supervisor extends Funcionarios{
	
	private double imposto;

	public Supervisor(double salario) {
		super(salario);
		this.imposto = (salario * 0.05) / 100;
	}
	
	public double verSalario() {
		return this.getSalario() - imposto;
	}
	
	public double pagoDeImposto() {
		return imposto;
	}

}
