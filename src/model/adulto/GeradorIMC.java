package model.adulto;

import model.GeradorMensagens;

public interface GeradorIMC extends GeradorMensagens{
	
	public void criarLimitesIMC();
	
	public double[] gerarLimites();
	
}
