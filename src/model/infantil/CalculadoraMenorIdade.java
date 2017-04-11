package model.infantil;

import model.CalculadoraGeneric;
import util.IMCUtils;

public abstract class CalculadoraMenorIdade extends CalculadoraGeneric implements GeradorIMCInfantil {

	public CalculadoraMenorIdade(int idade) {
		this.gerarLimitesIMC(idade);
	}

	@Override
	public void gerarLimitesIMC(int idade) {
		double[] valores = gerarLimites(idade);
		registrarLimites(IMCUtils.inserirValorMaximo(valores),gerarMensagens());
	}
	
	@Override
	public String[] gerarMensagens(){
		return new String[] { "Baixo Peso", "Peso Normal", "Sobrepeso", "Obesidade" };
	}

	
}
