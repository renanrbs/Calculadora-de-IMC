package model.idoso;

import control.CalculadoraIMC;
import model.CalculadoraGeneric;
import model.LimiteIMC;

public class IMCIdosoM extends CalculadoraGeneric{

	@Override
	public void buildLimitesIMC() {
		limitesIMC.add(new LimiteIMC(22, "Baixo peso"));
		limitesIMC.add(new LimiteIMC(27, "Peso normal"));
		limitesIMC.add(new LimiteIMC(30, "Sobrepeso"));
		limitesIMC.add(new LimiteIMC(35.1, "Obesidade grau I"));
		limitesIMC.add(new LimiteIMC(40, "Obesidade grau II"));
		limitesIMC.add(new LimiteIMC(Double.MAX_VALUE, "Obesidade grau III"));
	}

}
