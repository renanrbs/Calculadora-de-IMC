package model.adulto;

import model.CalculadoraGeneric;
import model.LimiteIMC;

public class IMCAdultos extends CalculadoraGeneric{
	
	@Override
	public void buildLimitesIMC() {
		limitesIMC.add(new LimiteIMC(16, "Baixo peso muito grave"));
		limitesIMC.add(new LimiteIMC(17, "Baixo peso grave"));
		limitesIMC.add(new LimiteIMC(18.5, "Baixo peso"));
		limitesIMC.add(new LimiteIMC(25, "Peso normal"));
		limitesIMC.add(new LimiteIMC(30, "Sobrepeso"));
		limitesIMC.add(new LimiteIMC(35, "Obesidade grau I"));
		limitesIMC.add(new LimiteIMC(40, "Obesidade grau II"));
		limitesIMC.add(new LimiteIMC(Double.MAX_VALUE, "Obesidade grau III"));
	}

	
}
