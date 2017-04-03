package model.idoso;

import model.CalculadoraGeneric;
import model.LimiteIMC;

public class IMCIdosoF extends CalculadoraGeneric{

	@Override
	public void buildLimitesIMC() {
		limitesIMC.add(new LimiteIMC(22, "Baixo peso"));
		limitesIMC.add(new LimiteIMC(27, "Peso normal"));
		limitesIMC.add(new LimiteIMC(32, "Sobrepeso"));
		limitesIMC.add(new LimiteIMC(37, "Obesidade grau I"));
		limitesIMC.add(new LimiteIMC(42, "Obesidade grau II"));
		limitesIMC.add(new LimiteIMC(Double.MAX_VALUE, "Obesidade grau III"));
	}

}
