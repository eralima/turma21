package lacoCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		//exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
		//se for �mpar exiba o n�mero elevado ao quadrado.
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
				
		//vari�veis
		double numero;
		double raizQuadrada;
		double elevadoQuadrado;
		
		//entradas
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		//processamento
		if(numero == 0) {
			System.out.printf("O n�mero 0 � neutro\n");	
		}
		else if(numero%2 == 0) {
			System.out.printf("O n�mero %f � par\n", numero);
			raizQuadrada = Math.sqrt(numero);
			System.out.printf("A ra�z quadrada do n�mero %.1f � %.2f\n", numero, raizQuadrada);
		}
		else {
			System.out.printf("O n�mero %f � �mpar\n", numero);
			elevadoQuadrado = Math.pow(numero, 2);
			System.out.printf("A ra�z quadrada do n�mero %.2f � %.2f\n", numero, elevadoQuadrado);
		}
		leia.close();
	}

}
