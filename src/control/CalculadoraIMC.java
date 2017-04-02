package control;

import model.CalculadoraCreator;
import model.CalculoIMC;
import util.IMCUtils;

public class CalculadoraIMC {

	public String calcularIMC(double altura, double peso, String sexo, int idade) {

		if (IMCUtils.ValidarDados(altura, peso, sexo, idade)) {
			// pattern factory method
			CalculoIMC calculadora = CalculadoraCreator.createCalculadoraIMC(sexo, idade);
			return calculadora.calcularIMC(altura, peso);
		} else {
			return "Valor Invalido";
		}
	}
}
