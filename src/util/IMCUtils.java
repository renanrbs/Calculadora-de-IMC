package util;

import java.util.List;

import model.LimiteIMC;

//pattern desconhecido
//classe de utilidades
public class IMCUtils {

	
	//Faz a validacao dos dados inseridos
	public static boolean ValidarDados(double altura, double peso, String sexo, int idade) {
		if (altura <= 0 || peso <= 0 || idade < 0) {
			return false;
		}

		if (!(sexo.equals("masculino") || sexo.equals("feminino"))) {
			return false;
		}

		return true;
	}

}
