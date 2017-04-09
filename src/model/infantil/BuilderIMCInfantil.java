package model.infantil;

import model.BuilderMensagens;

public interface BuilderIMCInfantil extends BuilderMensagens{

	public void buildLimitesIMC(int idade);
	
	public double[] gerarLimites(int idade);
}
