package programacaoSequencial;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */

		//variáveis
		double nota1;
		double nota2;
		double nota3;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite a sua nota 1: ");
		nota1 = leia.nextDouble();
		System.out.print("Digite a sua nota 2: ");
		nota2 = leia.nextDouble();
		System.out.print("Digite a sua nota 3: ");
		nota3 = leia.nextDouble();
		
		//processamento
		double mediaFinal = ((2 * nota1 + 3 * nota2 + 5 * nota3)/10);
				
		//saída
		System.out.print("A sua média final é " + mediaFinal);
		
		
		leia.close();	
	}
}
