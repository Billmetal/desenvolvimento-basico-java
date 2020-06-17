package Digital.Innovation.Java.orientacao_objeto.part01.paradigma.exemplo001;

public class Carro {

	private int pessoasNoCarro,lotacao;
	
	public Carro(int lotacao,int pessoasNoCarro) {
		this.lotacao = lotacao;
		this.pessoasNoCarro = pessoasNoCarro; 
	}
	
	public int getPessoasNoCarro() {
		return pessoasNoCarro;
	}
	
	public String adicionaPessoa(int qtas) {
		if(qtas > 0 && verificaLotacao(qtas)) {
			pessoasNoCarro += qtas;
			return mensagem("add",qtas);
		} else {
			return "Pessoas demais ou nenhuma pessoa para entrar no carro.";
		}
	}
	
	public String removePessoa(int qtas) {
		if(qtas > 0 && verificaVazio(qtas)) {
			pessoasNoCarro -= qtas;
			return mensagem("minus",qtas);
		} else {
			return "Poucas pessoas ou nenhuma pessoa para sair do carro.";
		}
	}
	
	private boolean verificaVazio(int qtas) {
		if((pessoasNoCarro - qtas) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean verificaLotacao(int qtas) {
		if((pessoasNoCarro + qtas) <= lotacao) {
			return true;
		} else {
			return false;
		}
	}
	
	private String mensagem(String tipo,int quantidade) {
		var msg = "";
		switch(tipo) {
		case "add":
			if(quantidade == 1) {
				msg = "Uma pessoa entrou no carro .";
			} else {
				msg = quantidade + " pessoas entraram no carro .";
			}
			break;
		case "minus":
			if(quantidade == 1) {
				msg = "Uma pessoa saiu do carro .";
			} else {
				msg = quantidade + " pessoas sairam do carro .";
			}
			break;
		}
		return msg;
	}
	
}
