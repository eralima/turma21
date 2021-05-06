package lacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double numero;
		double soma = 0.0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextDouble();
			
			soma = soma + numero;
			
		} while (numero != 0);

		System.out.printf("\nA somat�ria dos n�meros digitados � %.2f", soma);
		leia.close();
	}
}
