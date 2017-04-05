package model.infantil;

import model.CalculoIMC;
import model.CalculoIMCInfantil;

public class IMCInfantilAdapter implements CalculoIMC{

	private CalculoIMCInfantil calculoIMCInfantil;
	private int idade;

	public IMCInfantilAdapter(CalculoIMCInfantil calculoIMCInfantil, int idade) {
		//salva um objeto da classe CalculoIMCInfantil
		this.calculoIMCInfantil = calculoIMCInfantil;
		//Salva a idade para ser usada no metodo de calcular
		this.idade = idade;
	}

	@Override
	public String calcularIMC(double altura, double peso) {
		return this.calculoIMCInfantil.calcularIMC(altura, peso, this.idade);
	}

}
