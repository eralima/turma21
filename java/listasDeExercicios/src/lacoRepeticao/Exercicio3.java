package lacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		//Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);
		
		//variáveis
		int idade;
		int menosDe21 = 0;
		int maisDe50 = 0;
		
		//entradas
		System.out.print("Digite a idade da pessoa: ");
		idade = leia.nextInt();
		
		while (idade <= 99) {
			
			if (idade < 21) {
				menosDe21++;
				
			} else if (idade > 50) {
				maisDe50++;
			}
			
			System.out.print("Digite a idade da pessoa: ");
			idade = leia.nextInt();
		}
		
		System.out.printf("\nO total de pessoas com menos de 21 anos é %d", menosDe21);
		System.out.printf("\nO total de pessoas com mais de 50 anos é %d", maisDe50);
		
		leia.close();
	}

}
