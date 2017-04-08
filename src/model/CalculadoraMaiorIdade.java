package model;

public abstract class CalculadoraMaiorIdade extends CalculadoraGeneric implements BuilderIMC {

	public CalculadoraMaiorIdade(){
		buildLimitesIMC();
	}
}
