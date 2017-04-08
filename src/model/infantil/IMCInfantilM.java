package model.infantil;

import model.CalculadoraMenorIdade;

public class IMCInfantilM extends CalculadoraMenorIdade {

	public IMCInfantilM(int idade) {
		super(idade);
	}

	// insere 3 valores que se referem a baixo peso, peso normal e sobrepeso
	protected double[] decidirLimites(int idade) {
		switch (idade) {
		case 19:
			return new double[] { 20, 27, 30.3 };
		default:
			return null;
		}
	}

}
