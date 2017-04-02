package model;

public class IMCInfantilAdapter implements CalculoIMC{

	private CalculoIMCInfantil calculoIMCInfantil;
	private int idade;

	public IMCInfantilAdapter(CalculoIMCInfantil calculoIMCInfantil, int idade) {
		this.calculoIMCInfantil = calculoIMCInfantil;
		this.idade = idade;
	}

	@Override
	public String calcularIMC(double altura, double peso) {
		return this.calculoIMCInfantil.calcularIMC(altura, peso, this.idade);
	}

}
