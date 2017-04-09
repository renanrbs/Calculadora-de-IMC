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
			return new double[] {15, 18, 19.8};
		case 4:
			return new double[] {14.1, 17, 18};
		case 6:
			return new double[] {13.9, 17, 18.9 };
		case 8:
			return new double[] {14, 18.2, 19.6 };
		case 10:
			return new double[] {14.5, 20, 23.1 };
		case 12:
			return new double[] {15.2, 21.3, 25.2 };
		case 14:
			return new double[] {16.1, 23.2, 27.1 };
		case 16:
			return new double[] {17.5, 24.4, 30.2 };
		case 18:
			return new double[] {18.1, 25.3, 30.1 };
		case 19:
			return new double[] { 18.5, 26.2, 31.3 };
		default:
			return null;
		}
	}
}
