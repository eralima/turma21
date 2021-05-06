package lacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		//Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int numero;
		int soma = 0;
		int quantidadeNumeros = 0;
		
		do {
			System.out.print("Digite um n�mero inteiro: ");
			numero = leia.nextInt();
			
			if(numero%3 == 0) {
				soma = soma + numero;
				quantidadeNumeros++;	
			}
			
		} while (numero != 0 );
		
		double media = soma/(quantidadeNumeros - 1);
		System.out.printf("\nA m�dia dos n�meros digitados m�ltiplos de 3 � %f", media);
		leia.close();
	}

}
