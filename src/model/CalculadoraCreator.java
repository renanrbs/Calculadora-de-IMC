package model;

public class CalculadoraCreator {

	public static CalculoIMC createCalculadoraIMC(String sexo, int idade) {
		if (idade < 20) {
			return createIMCInfantil(sexo, idade);
		} else if (idade > 65) {
			return createIMCIdoso(sexo);
		}
		return new IMCAdultos();

	}

	private static CalculoIMC createIMCInfantil(String sexo, int idade) {
		if (sexo.equals("masculino")) {
			return new IMCInfantilAdapter(new IMCInfantilMasc(), idade);
		} else {
			return new IMCInfantilAdapter(new IMCInfantilFem(), idade);
		}
	}
	
	private static CalculoIMC createIMCIdoso(String sexo) {
		if (sexo.equals("masculino")) {
			return new IMCIdosoMasc();
		} else {
			return new IMCIdosoFem();
		}
	}
}
