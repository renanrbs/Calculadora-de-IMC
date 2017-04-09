package model.adulto;

import model.CalculadoraGeneric;
import util.IMCUtils;

public abstract class CalculadoraMaiorIdade extends CalculadoraGeneric implements BuilderIMC {

	public CalculadoraMaiorIdade() {
		buildLimitesIMC();
	}

	@Override
	public void buildLimitesIMC() {
		double[] valores = gerarLimites();
		registrarLimites(IMCUtils.inserirValorMaximo(valores), buildMensagens());
	}

	@Override
	public String[] buildMensagens() {
		return new String[] { "Baixo peso", "Peso normal", "Sobrepeso", "Obesidade grau I",
				"Obesidade grau II", "Obesidade grau III" };
	}
}
