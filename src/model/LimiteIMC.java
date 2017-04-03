package model;

public class LimiteIMC {
	private double valor;
	private String mensagem;

	public LimiteIMC(double valor, String mensagem) {
		this.valor = valor;
		this.mensagem = mensagem;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
