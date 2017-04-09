package model.adulto;

public class IMCIdosoF extends CalculadoraMaiorIdade{

	@Override
	public double[] gerarLimites() {
		return new double[] {22, 27, 32,37,42};
	}

}
