package lacoCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		//vari�veis
		int numero1;
		int numero2;
		int numero3;
		
		//entradas
		System.out.print("Digite um numero inteiro: ");
		numero1 = leia.nextInt();
		System.out.print("Digite um numero inteiro: ");
		numero2 = leia.nextInt();
		System.out.print("Digite um numero inteiro: ");
		numero3 = leia.nextInt();
		
		//processamento
		if(numero1 > numero2 && numero1 > numero3 ) {
			System.out.printf("O maior n�mero � %d", numero1);
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.printf("O maior n�mero � %d", numero2);
		}
		else {
			System.out.printf("O maior n�mero � %d", numero3);
		}
		leia.close();
	}

}
