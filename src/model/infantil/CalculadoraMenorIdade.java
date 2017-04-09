package model.infantil;

import model.CalculadoraGeneric;
import util.IMCUtils;

public abstract class CalculadoraMenorIdade extends CalculadoraGeneric implements BuilderIMCInfantil {

	public CalculadoraMenorIdade(int idade) {
		this.buildLimitesIMC(idade);
	}

	@Override
	public void buildLimitesIMC(int idade) {
		double[] valores = gerarLimites(idade);
		registrarLimites(IMCUtils.inserirValorMaximo(valores),buildMensagens());
	}
	
	@Override
	public String[] buildMensagens(){
		return new String[] { "Baixo Peso", "Peso Normal", "Sobrepeso", "Obesidade" };
	}

	
}
