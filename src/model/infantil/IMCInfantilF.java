package model.infantil;

import model.CalculadoraMenorIdade;

public class IMCInfantilF extends CalculadoraMenorIdade {

	public IMCInfantilF(int idade) {
		super(idade);
	}

	@Override
	protected double[] decidirLimites(int idade) {
		switch (idade) {
		case 2:
			return new double[] {15, 18, 19.5 };
		case 4:
			return new double[] {14, 17, 18.5 };
		case 6:
			return new double[] {13.8, 17, 20 };
		case 8:
			return new double[] {14, 18.4, 22 };
		case 10:
			return new double[] {14.5, 20, 24.5 };
		case 12:
			return new double[] {15.5, 21.6, 27 };
		case 14:
			return new double[] {16.5, 23.1, 29 };
		case 16:
			return new double[] {17.5, 24.5, 31 };
		case 18:
			return new double[] {18.2, 25.8, 29.5 };
		case 19:
			return new double[] { 18.5, 26, 34 };
		default:
			return null;
		}
	}
}
