package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //usar o padr�o americano
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		if(numero == 0) {
			System.out.printf("O n�mero %d � neutro", numero);
		}
		else if (numero < 0) {
			System.out.printf("O n�mero %d � negativo", numero);
		}
		else if (numero%2 == 0) {
			System.out.printf("O n�mero %d � par", numero);
		}
		else {
			System.out.printf("O n�mero %d � �mpar", numero);
		}
		leia.close();
	}
	
}
