package model;

import model.adulto.IMCAdultos;
import model.idoso.IMCIdosoF;
import model.idoso.IMCIdosoM;
import model.infantil.IMCInfantilF;
import model.infantil.IMCInfantilM;

public class CalculadoraCreator {

	public static CalculoIMC createCalculadoraIMC(String sexo, int idade) {
		//verifica se eh menor de idade
		if (idade < 20) {
			//Se a idade for menor que 20, retorna o IMC infantil
			return createIMCInfantil(sexo, idade);
		} else if (idade > 65) {
			//Se a idade for acima de 65, retorna o IMC de idoso
			return createIMCIdoso(sexo);
		}
		//Se a idade nao se aplica em nenhuma das condicoes, retorna o IMC normal
		return new IMCAdultos();
	}

	private static CalculoIMC createIMCInfantil(String sexo, int idade) {
		if (sexo.equals("masculino")) {
			return new IMCInfantilM(idade);
		} else {
			return new IMCInfantilF(idade);
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
