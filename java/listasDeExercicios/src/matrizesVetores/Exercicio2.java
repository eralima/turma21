package matrizesVetores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*Fa�a um programa que receba 6 n�meros inteiros e mostre:
			� Os n�meros pares digitados;
			� A soma dos n�meros pares digitados;
			� Os n�meros �mpares digitados;
			� A quantidade de n�meros �mpares digitados.*/
		
		Scanner leia = new Scanner(System.in);
		
		//vari�veis
		int numeros[]= new int[5];
		int somaPares = 0;
		int quantidadeImpares = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um n�mero inteiro: ");
			numeros[i] = leia.nextInt();
			
			if (numeros[i]%2 == 0 && numeros[i] != 0 ) {
				somaPares = somaPares + numeros[i];
				
			} else if (numeros[i]%2 != 0 && numeros[i] != 0 ) {
				 quantidadeImpares++;
			}
			
		}
		System.out.print("Os n�meros pares digitados foram: ");
		
		for (int i : numeros) {
			if (i%2 == 0 && i != 0 ) {
				System.out.print(i + " ");
				
			}	
			
		}
		/*for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0 && numeros[i] != 0 ) {
				System.out.print(numeros[i] + " ");
				
			}	
		}*/
		
		System.out.printf("\nA soma dos n�meros pares digitados � %d", somaPares);
		System.out.printf("\nForam digitados %d n�meros �mpares", quantidadeImpares);
		
		leia.close();
	}

}
