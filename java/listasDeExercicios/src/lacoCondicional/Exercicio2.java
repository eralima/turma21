package lacoCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		//variáveis
		int numero1;
		int numero2;
		int numero3;
		
		//entradas
		System.out.print("Digite um número inteiro: ");
		numero1 = leia.nextInt();
		System.out.print("Digite um número inteiro: ");
		numero2 = leia.nextInt();
		System.out.print("Digite um número inteiro: ");
		numero3 = leia.nextInt();
		
		
		//Todas as situações possíveis são (3, 2, 1) ou (3, 1, 2) ou (2, 1, 3) ou  
		//(1, 2, 3) ou (2, 3, 1) ou (1, 3, 2) 
		
		//processamento
		
		// Situações possíveis: (3, 2, 1) ou (3, 1, 2) ou (2, 1, 3)
		if(numero1 > numero2) {  
			if(numero2 > numero3) { // Digitação: (3, 2, 1)
				System.out.printf("A ordem crescente dos números é %d, %d e %d", numero3, numero2, numero1);
			}
			//numero2 < numero3. Situações possíveis: (3, 1, 2) ou (2, 1, 3) 
			else { 
				if(numero1 > numero3) {//Digitação: (3, 1, 2)
					System.out.printf("A ordem crescente dos números é %d, %d e %d", numero2, numero3, numero1);
				}
				else {//Digitação: (2, 1, 3)
					System.out.printf("A ordem crescente dos números é %d, %d e %d", numero2, numero1, numero3);
				}
			}
		}
		//numero1 < numero2 Situações possíveis: (1, 2, 3) ou (2, 3, 1) ou (1, 3, 2) 
		else {
			if(numero2 > numero3) {//Situações possíveis: (2, 3, 1) ou (1, 3, 2) 
				if(numero1 > numero3) {//Digitação: (2, 3, 1)
					System.out.printf("A ordem crescente dos números é %d, %d e %d", numero3, numero1, numero2);
				}
				else {//Digitação: (1, 3, 2) 
					System.out.printf("A ordem crescente dos números é %d, %d e %d", numero1, numero3, numero2);
				}	
			}
			else {//Digitação: 1, 2, 3
				System.out.printf("A ordem crescente dos números é %d, %d e %d", numero1, numero2, numero3);
			}
		}
		leia.close();
	}
	
}

