package matrizesVetores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*Faça um programa que receba 6 números inteiros e mostre:
			• Os números pares digitados;
			• A soma dos números pares digitados;
			• Os números ímpares digitados;
			• A quantidade de números ímpares digitados.*/
		
		Scanner leia = new Scanner(System.in);
		
		//variáveis
		int numeros[]= new int[5];
		int somaPares = 0;
		int quantidadeImpares = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número inteiro: ");
			numeros[i] = leia.nextInt();
			
			if (numeros[i]%2 == 0 && numeros[i] != 0 ) {
				somaPares = somaPares + numeros[i];
				
			} else if (numeros[i]%2 != 0 && numeros[i] != 0 ) {
				 quantidadeImpares++;
			}
			
		}
		System.out.print("Os números pares digitados foram: ");
		
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
		
		System.out.printf("\nA soma dos números pares digitados é %d", somaPares);
		System.out.printf("\nForam digitados %d números ímpares", quantidadeImpares);
		
		leia.close();
	}

}
