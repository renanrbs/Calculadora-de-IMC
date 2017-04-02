package model;

import util.IMCUtils;

public class IMCAdultos implements CalculoIMC {

	@Override
	public String calcularIMC(double altura, double peso) {
		double imc = IMCUtils.getIMC(peso, altura);

		if (imc < 18.5)
			return calcularIMCBaixo(imc);

		if (imc > 25)
			return calcularIMCAlto(imc);

		return "Peso normal";

	}

	private String calcularIMCBaixo(double imc) {
		if (imc < 16)
			return "Baixo peso muito grave";

		if (imc >= 17)
			return "Baixo peso";

		return "Baixo peso grave";

	}

	private String calcularIMCAlto(double imc) {
		if (imc < 35) {
			return calcularIMCMedioAlto(imc);
		} else {
			return calcularIMCMuitoAlto(imc);
		}
	}

	private String calcularIMCMedioAlto(double imc) {
		if (imc < 30) {
			return "Sobrepeso";
		} else {
			return "Obesidade grau I";
		}
	}

	private String calcularIMCMuitoAlto(double imc) {
		if (imc < 40) {
			return "Obesidade grau II";
		} else {
			return "Obesidade grau III";
		}
	}
}
