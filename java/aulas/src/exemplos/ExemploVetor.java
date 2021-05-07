package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		int maiorPontuacao = 0;
		int pontos[] = new int [5];
		//declaração de vetor
		
		for (int i = 0; i < pontos.length; i++) {
			System.out.print("Digite a sua pontuação nas atividades: ");
			pontos [i] = leia.nextInt();
			
			if (maiorPontuacao < pontos[i]) {
				maiorPontuacao = pontos[i];
			}
		
			
		}
		System.out.printf("A maior pontualão de suas atividades é %d", maiorPontuacao);
		leia.close();
	
	}
}
