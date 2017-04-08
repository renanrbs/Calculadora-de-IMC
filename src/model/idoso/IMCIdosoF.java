package model.idoso;

import model.CalculadoraMaiorIdade;
import model.LimiteIMC;

public class IMCIdosoF extends CalculadoraMaiorIdade{

	@Override
	public void buildLimitesIMC() {
		listaLimitesIMC.add(new LimiteIMC(22, "Baixo peso"));
		listaLimitesIMC.add(new LimiteIMC(27, "Peso normal"));
		listaLimitesIMC.add(new LimiteIMC(32, "Sobrepeso"));
		listaLimitesIMC.add(new LimiteIMC(37, "Obesidade grau I"));
		listaLimitesIMC.add(new LimiteIMC(42, "Obesidade grau II"));
		listaLimitesIMC.add(new LimiteIMC(Double.MAX_VALUE, "Obesidade grau III"));
	}

}
