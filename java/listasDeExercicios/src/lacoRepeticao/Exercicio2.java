package lacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		//vari�veis
		int numero;
		int contadorPares = 0;
		int contadorImpares = 0;
		

		for (int i = 1; i < 11; i++) {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if (numero%2 == 0 && numero != 0) {
				contadorPares++;
				
			} else if (numero%2 != 0 && numero != 0){
				contadorImpares++;
			}
			
		}
		System.out.printf("\nForam digitados %d n�meros pares", contadorPares);
		System.out.printf("\nForam digitados %d n�meros �mpares", contadorImpares);
		
		leia.close();
	}

}
