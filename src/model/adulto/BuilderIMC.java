package model.adulto;

import model.BuilderMensagens;

public interface BuilderIMC extends BuilderMensagens{
	
	public void buildLimitesIMC();
	
	public double[] gerarLimites();
	
}
