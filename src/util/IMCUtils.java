package util;

//pattern desconhecido
//classe de utilidades
public class IMCUtils {

	public static double getIMC(double peso, double altura) {
		return peso / (altura * altura);
	}
	
	//Faz a validação dos dados inseridos
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
