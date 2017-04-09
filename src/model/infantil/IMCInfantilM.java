package model.infantil;

import model.CalculadoraMenorIdade;

public class IMCInfantilM extends CalculadoraMenorIdade {

	public IMCInfantilM(int idade) {
		super(idade);
	}

	// insere 3 valores que se referem a baixo peso, peso normal e sobrepeso
	protected double[] decidirLimites(int idade) {
		switch (idade) {
		case 2:
			return new double[] {15, 18, 20 };
		case 4:
			return new double[] {14.5, 17, 18.5 };
		case 6:
			return new double[] {14, 17, 19 };
		case 8:
			return new double[] {14.1, 18, 21 };
		case 10:
			return new double[] {14.5, 19.2, 23.8 };
		case 12:
			return new double[] {15.5, 21, 26 };
		case 14:
			return new double[] {16.5, 22.5, 28 };
		case 16:
			return new double[] {17.8, 24.1, 29 };
		case 18:
			return new double[] {19, 25.5, 30 };
		case 19:
			return new double[] { 20, 27, 30.3 };
		default:
			return null;
		}
	}

}
