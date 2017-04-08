package model.adulto;

import model.CalculadoraMaiorIdade;
import model.LimiteIMC;

public class IMCAdultos extends CalculadoraMaiorIdade {

	@Override
	public void buildLimitesIMC() {
		listaLimitesIMC.add(new LimiteIMC(16, "Baixo peso muito grave"));
		listaLimitesIMC.add(new LimiteIMC(17, "Baixo peso grave"));
		listaLimitesIMC.add(new LimiteIMC(18.5, "Baixo peso"));
		listaLimitesIMC.add(new LimiteIMC(25, "Peso normal"));
		listaLimitesIMC.add(new LimiteIMC(30, "Sobrepeso"));
		listaLimitesIMC.add(new LimiteIMC(35, "Obesidade grau I"));
		listaLimitesIMC.add(new LimiteIMC(40, "Obesidade grau II"));
		listaLimitesIMC.add(new LimiteIMC(Double.MAX_VALUE, "Obesidade grau III"));

	}

}
