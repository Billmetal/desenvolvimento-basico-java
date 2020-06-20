package Digital.Innovation.Java.SOLID.single_responsibility_principle;

import java.math.BigDecimal;

public class Produto {
	
	private String produto,marca;
	private BigDecimal valor;

	public Produto(String produto, String marca,double valor) {
		this.produto = produto;
		this.marca = marca;
		this.valor = new BigDecimal(valor);
	}

	public String getProduto() {
		return produto;
	}

	public String getMarca() {
		return marca;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

}
