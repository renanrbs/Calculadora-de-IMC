package model.idoso;

import model.CalculadoraMaiorIdade;
import model.LimiteIMC;

public class IMCIdosoM extends CalculadoraMaiorIdade{

	@Override
	public void buildLimitesIMC() {
		listaLimitesIMC.add(new LimiteIMC(22, "Baixo peso"));
		listaLimitesIMC.add(new LimiteIMC(27, "Peso normal"));
		listaLimitesIMC.add(new LimiteIMC(30, "Sobrepeso"));
		listaLimitesIMC.add(new LimiteIMC(35.1, "Obesidade grau I"));
		listaLimitesIMC.add(new LimiteIMC(40, "Obesidade grau II"));
		listaLimitesIMC.add(new LimiteIMC(Double.MAX_VALUE, "Obesidade grau III"));
	}

}
