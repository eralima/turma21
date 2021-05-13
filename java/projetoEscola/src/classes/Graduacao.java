package classes;

import java.util.Scanner;

public class Graduacao extends Estudante{
	private double bonus = 2.0;

	//construtor
	public Graduacao(int matricula, String cpf) {
		super(matricula, cpf);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void tirarNota(double pontos) {
		Scanner leia = new Scanner(System.in);
		double pontoIncluido;
		
		double aux = 0.00;
		if (super.getPontos() >= pontos) {
			super.tirarNota(pontos);
		}
		else if ((super.getPontos() + bonus) >= pontos) {
			aux = pontos - super.getPontos();
			bonus = bonus - aux;
			super.adicionarNota(aux);
			super.tirarNota(pontos);
		} else {
			double excesso = super.getPontos() - pontos + bonus;
			bonus = 0;
			
			System.out.printf("\nTotal atual: %.2f ", super.getPontos());
			System.out.printf("\n   INCLUIA uma NOTA MAIOR OU IGUAL A %.1f\n", Math.abs(excesso));
			System.out.print("Informe o valor do movimento: ");
			pontoIncluido = leia.nextDouble();
			
			super.adicionarNota(excesso + pontoIncluido);
		}
		
	}
}
