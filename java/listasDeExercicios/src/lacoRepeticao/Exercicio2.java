package lacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		//variáveis
		int numero;
		int contadorPares = 0;
		int contadorImpares = 0;
		

		for (int i = 1; i < 11; i++) {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero%2 == 0 && numero != 0) {
				contadorPares++;
				
			} else if (numero%2 != 0 && numero != 0){
				contadorImpares++;
			}
			
		}
		System.out.printf("\nForam digitados %d números pares", contadorPares);
		System.out.printf("\nForam digitados %d números ímpares", contadorImpares);
		
		leia.close();
	}

}
