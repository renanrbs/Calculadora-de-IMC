package model;

import model.adulto.IMCAdultos;
import model.idoso.IMCIdosoF;
import model.idoso.IMCIdosoM;
import model.infantil.IMCInfantilAdapter;
import model.infantil.IMCInfantilF;
import model.infantil.IMCInfantilM;

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
			return new IMCInfantilAdapter(new IMCInfantilM(), idade);
		} else {
			return new IMCInfantilAdapter(new IMCInfantilF(), idade);
		}
	}
	
	private static CalculoIMC createIMCIdoso(String sexo) {
		if (sexo.equals("masculino")) {
			return new IMCIdosoM();
		} else {
			return new IMCIdosoF();
		}
	}
}
