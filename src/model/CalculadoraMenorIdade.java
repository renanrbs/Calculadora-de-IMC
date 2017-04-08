package model;

import java.util.Arrays;

public abstract class CalculadoraMenorIdade extends CalculadoraGeneric implements BuilderIMCInfantil {

	public CalculadoraMenorIdade(int idade) {
		this.buildLimitesIMC(idade);
	}

	@Override
	public void buildLimitesIMC(int idade) {
		double[] valores = decidirLimites(idade);

		// adiciona o valor de obesidade
		valores = Arrays.copyOf(valores, 4);
		valores[3] = Double.MAX_VALUE;

		registrarLimites(valores);

	}

	protected abstract double[] decidirLimites(int idade);

	public void registrarLimites(double[] valores) {
		String[] mensagens = new String[] { "Baixo Peso", "Peso Normal", "Sobrepeso", "Obesidade" };
		for (int i = 0; i < valores.length; i++) {
			listaLimitesIMC.add(new LimiteIMC(valores[i], mensagens[i]));
		}
	}
}
