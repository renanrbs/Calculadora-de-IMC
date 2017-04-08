package model;

import java.util.ArrayList;
import java.util.List;

public abstract class CalculadoraGeneric implements CalculoIMC {
	protected List<LimiteIMC> listaLimitesIMC;

	double imc;

	public CalculadoraGeneric() {
		//Ele cria um array 
		this.listaLimitesIMC = new ArrayList<>();
	}

	@Override
	public String calcularIMC(double altura, double peso) {
		double imc = peso / (altura * altura);
		return this.AnalisarIMC(imc);
	}

	public String AnalisarIMC(double imc) {
		for (LimiteIMC limite : listaLimitesIMC) {
			if (imc < limite.getValor()) {
				
				return  limite.getMensagem();
			}
		}
		return null;
	}
}
