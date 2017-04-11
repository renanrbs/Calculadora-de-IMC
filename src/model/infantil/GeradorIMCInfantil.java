package model.infantil;

import model.GeradorMensagens;

public interface GeradorIMCInfantil extends GeradorMensagens{

	public void gerarLimitesIMC(int idade);
	
	public double[] gerarLimites(int idade);
}
