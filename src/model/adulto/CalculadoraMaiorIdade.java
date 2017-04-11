package model.adulto;

import model.CalculadoraGeneric;
import util.IMCUtils;

public abstract class CalculadoraMaiorIdade extends CalculadoraGeneric implements GeradorIMC {

	public CalculadoraMaiorIdade() {
		criarLimitesIMC();
	}

	@Override
	public void criarLimitesIMC() {
		double[] valores = gerarLimites();
		registrarLimites(IMCUtils.inserirValorMaximo(valores), gerarMensagens());
	}

	@Override
	public String[] gerarMensagens() {
		return new String[] { "Baixo peso", "Peso normal", "Sobrepeso", "Obesidade grau I",
				"Obesidade grau II", "Obesidade grau III" };
	}
}
