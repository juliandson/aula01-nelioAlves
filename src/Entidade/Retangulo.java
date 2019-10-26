package Entidade;

public class Retangulo {
	
	public double base;
	public double altura;
	
	public double area() {
		double result = base * altura;
		return result;	
	}
	
	public double perimetro() {
		double result = (base * 2) + (altura * 2);
		return result;
		
	}
	
	public double diagonal() {
		double result = Math.sqrt(base * base + altura * altura);
		return result;
		
	}

}
