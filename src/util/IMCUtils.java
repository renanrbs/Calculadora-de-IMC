package util;

//pattern ????
public class IMCUtils {

	public static double getIMC(double peso, double altura) {
		return peso / (altura * altura);
	}

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
