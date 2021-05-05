package lacoCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		//vari�veis
		int numero1;
		int numero2;
		int numero3;
		
		//entradas
		System.out.print("Digite um n�mero inteiro: ");
		numero1 = leia.nextInt();
		System.out.print("Digite um n�mero inteiro: ");
		numero2 = leia.nextInt();
		System.out.print("Digite um n�mero inteiro: ");
		numero3 = leia.nextInt();
		
		
		//Todas as situa��es poss�veis s�o (3, 2, 1) ou (3, 1, 2) ou (2, 1, 3) ou  
		//(1, 2, 3) ou (2, 3, 1) ou (1, 3, 2) 
		
		//processamento
		
		// Situa��es poss�veis: (3, 2, 1) ou (3, 1, 2) ou (2, 1, 3)
		if(numero1 > numero2) {  
			if(numero2 > numero3) { // Digita��o: (3, 2, 1)
				System.out.printf("A ordem crescente dos n�meros � %d, %d e %d", numero3, numero2, numero1);
			}
			//numero2 < numero3. Situa��es poss�veis: (3, 1, 2) ou (2, 1, 3) 
			else { 
				if(numero1 > numero3) {//Digita��o: (3, 1, 2)
					System.out.printf("A ordem crescente dos n�meros � %d, %d e %d", numero2, numero3, numero1);
				}
				else {//Digita��o: (2, 1, 3)
					System.out.printf("A ordem crescente dos n�meros � %d, %d e %d", numero2, numero1, numero3);
				}
			}
		}
		//numero1 < numero2 Situa��es poss�veis: (1, 2, 3) ou (2, 3, 1) ou (1, 3, 2) 
		else {
			if(numero2 > numero3) {//Situa��es poss�veis: (2, 3, 1) ou (1, 3, 2) 
				if(numero1 > numero3) {//Digita��o: (2, 3, 1)
					System.out.printf("A ordem crescente dos n�meros � %d, %d e %d", numero3, numero1, numero2);
				}
				else {//Digita��o: (1, 3, 2) 
					System.out.printf("A ordem crescente dos n�meros � %d, %d e %d", numero1, numero3, numero2);
				}	
			}
			else {//Digita��o: 1, 2, 3
				System.out.printf("A ordem crescente dos n�meros � %d, %d e %d", numero1, numero2, numero3);
			}
		}
		leia.close();
	}
	
}

