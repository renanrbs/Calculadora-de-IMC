package control;

import error.ValorInvalidoException;
import model.CalculoIMC;
import util.IMCUtils;

public class CalculadoraIMC {

	public String calcularIMC(double altura, double peso, String sexo, int idade) {

		try {
			IMCUtils.validarDados(altura, peso, sexo, idade);
			
			// pattern factory method
			CalculoIMC calculadora = CalculadoraCreator.createCalculadoraIMC(sexo, idade);
			return calculadora.calcularIMC(altura, peso);
		} catch (ValorInvalidoException e) {
			return e.getMessage();
		}
	}
}
