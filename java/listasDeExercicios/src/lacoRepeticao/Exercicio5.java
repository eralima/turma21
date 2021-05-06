package lacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		//No final, mostre a soma dos números digitados.(DO...WHILE)
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double numero;
		double soma = 0.0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextDouble();
			
			soma = soma + numero;
			
		} while (numero != 0);

		System.out.printf("\nA somatória dos números digitados é %.2f", soma);
		leia.close();
	}
}
