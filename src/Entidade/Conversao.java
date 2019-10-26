package Entidade;

public class Conversao {
	

	
	public static double cotacao(double cot, double dolar) {
		
		double conv = cot * dolar;
		double taxa = conv  * 6/100;
		double resultFinal = conv + taxa;
		return resultFinal;
	}
	

}
