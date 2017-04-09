package model.infantil;

public class IMCInfantilM extends CalculadoraMenorIdade {

	public IMCInfantilM(int idade) {
		super(idade);
	}

	// insere 3 valores que se referem a baixo peso, peso normal e sobrepeso
	public double[] gerarLimites(int idade) {
		switch (idade) {
		case 2:
			return new double[] {15, 18, 19.2 };
		case 4:
			return new double[] {14.5, 17, 18.1 };
		case 6:
			return new double[] {14, 17, 18.2 };
		case 8:
			return new double[] {14.1, 18, 20.1 };
		case 10:
			return new double[] {14.4, 19.1, 22.1 };
		case 12:
			return new double[] {15.2, 21.2, 25.2 };
		case 14:
			return new double[] {16.5, 22.5, 26.1 };
		case 16:
			return new double[] {17.9, 24.1, 27.5 };
		case 18:
			return new double[] {19, 25.5, 28.9 };
		case 19:
			return new double[] { 20, 27, 30.3 };
		default:
			return null;
		}
	}

}
