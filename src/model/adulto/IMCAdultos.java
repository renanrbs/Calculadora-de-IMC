package model.adulto;

public class IMCAdultos extends CalculadoraMaiorIdade {

	@Override
	public double[] gerarLimites() {
		return new double[] { 16, 17, 18.5, 25, 30, 35, 40 };
	}

	@Override
	public String[] buildMensagens() {
		return new String[] { "Baixo peso muito grave", "Baixo peso grave", "Baixo peso", "Peso normal", "Sobrepeso",
				"Obesidade grau I", "Obesidade grau II", "Obesidade grau III" };
	}

}
