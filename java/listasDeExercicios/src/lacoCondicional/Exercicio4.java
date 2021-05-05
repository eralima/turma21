package lacoCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		//Faça um programa em que permita a entrada de um número qualquer e 
		//exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
		//se for ímpar exiba o número elevado ao quadrado.
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
				
		//variáveis
		double numero;
		double raizQuadrada;
		double elevadoQuadrado;
		
		//entradas
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		//processamento
		if(numero == 0) {
			System.out.printf("O número 0 é neutro\n");	
		}
		else if(numero%2 == 0) {
			System.out.printf("O número %f é par\n", numero);
			raizQuadrada = Math.sqrt(numero);
			System.out.printf("A raíz quadrada do número %.1f é %.2f\n", numero, raizQuadrada);
		}
		else {
			System.out.printf("O número %f é ímpar\n", numero);
			elevadoQuadrado = Math.pow(numero, 2);
			System.out.printf("A raíz quadrada do número %.2f é %.2f\n", numero, elevadoQuadrado);
		}
		leia.close();
	}

}
