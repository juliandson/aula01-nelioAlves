package Entidade;

public class Aluno {

	public String nome;
	public double bim1;
	public double bim2;
	public double bim3;

	double media = 0;
	double mediarep = 0;

	public double CalculoMedia(double a) {

		if (bim1 <= 30 && bim2 <= 35 && bim3 <= 35) {
			media = (bim1 + bim2 + bim3);
			if (media >= 60) {
				System.out.println("Aluno aprovado!");

			} else if (media < 60) {
				System.out.printf("Media Final: %.2f%n", media);
				media = 60 - media;
				System.out.println("Aluno reprovado");
				System.out.printf("Faltam %.2f%n pontos ", media);

			}
		} else {
			System.out.println("Notas invalidas");
		}

		return media;
	}

}
