package model;

import java.util.ArrayList;
import java.util.List;

public abstract class CalculadoraGeneric implements CalculoIMC {
	List<LimiteIMC> limitesIMC;

	double imc;

	public CalculadoraGeneric() {
		this.limitesIMC = new ArrayList<>();
		this.buildLimitesIMC();
	}

	public abstract void buildLimitesIMC();

	@Override
	public String calcularIMC(double altura, double peso) {
		double imc = peso / (altura * altura);
		return this.AnalisarIMC(imc);
	}

	public String AnalisarIMC(double imc) {
		for (LimiteIMC limite : limitesIMC) {
			if (imc < limite.getValor()) {
				return  limite.getMensagem();
			}
		}
		return null;
	}
}
