package model.adulto;

public class IMCIdosoM extends CalculadoraMaiorIdade {

	@Override
	public double[] gerarLimites() {
		return new double[] { 22, 27, 30, 35.1, 40 };
	}

}
