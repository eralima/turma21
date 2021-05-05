package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //usar o padrão americano
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		if(numero == 0) {
			System.out.printf("O número %d é neutro", numero);
		}
		else if (numero < 0) {
			System.out.printf("O número %d é negativo", numero);
		}
		else if (numero%2 == 0) {
			System.out.printf("O número %d é par", numero);
		}
		else {
			System.out.printf("O número %d é ímpar", numero);
		}
		leia.close();
	}
	
}
