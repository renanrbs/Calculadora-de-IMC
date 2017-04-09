package util;

import java.util.Arrays;

import error.ValorInvalidoException;

//classe de utilidades
public class IMCUtils {

	// Faz a validacao dos dados inseridos
	public static void validarDados(double altura, double peso, String sexo, int idade) throws ValorInvalidoException{
		if (altura <= 0 || peso <= 0 || idade < 0) {
			throw new ValorInvalidoException();
		}

		if (!(sexo.equals("masculino") || sexo.equals("feminino"))) {
			throw new ValorInvalidoException();
		}
	}

	public static double[] inserirValorMaximo(double[] array) {
		double[] valores = Arrays.copyOf(array, array.length + 1);
		valores[valores.length - 1] = Double.MAX_VALUE;
		return valores;
	}

}
