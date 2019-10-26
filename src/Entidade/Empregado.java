package Entidade;

public class Empregado {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		double result = salarioBruto - 1000;
		return result;
	}
	
	public double incremento(double grat) {
		double result = (salarioBruto * grat ) / 100;
		double valorFinal = salarioLiquido() + result;
		return valorFinal;
	}

}
