package Digital.Innovation.Java.orientacao_objeto.part03.heranca.exemplo003;

public class Funcionarios {
		
	private double salario;
	
	public Funcionarios(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double pagoDeImposto() {
		return 0;
	}
	
}
