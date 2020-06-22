package Digital.Innovation.Java.SOLID.open_closed_principle;

public class DescontoLivroInfantil implements DescontoLivro{
	
	@Override
	public double valorDesconto() {
		return 0.3;
	}
}
