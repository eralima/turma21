package programacaoSequencial;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
		 * e mostre-a expressa apenas em dias. 
		 */
		
		//variáveis
		int idadeAnos;
		int idadeMeses;
		int idadeDias;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.println("Digite os anos da sua idade: ");
		idadeAnos = leia.nextInt();
		System.out.println("Digite os meses da sua idade: ");
		idadeMeses = leia.nextInt();
		System.out.println("Digite os dias da sua idade: ");
		idadeDias = leia.nextInt();
		
		//processamento
		int idadeEmDias;
		idadeEmDias = idadeDias + (idadeAnos * 365) + (idadeMeses * 30);
		
		//saídas
		System.out.println("A sua idade expressa em dias é " + idadeEmDias);
		
		leia.close();
	}

}
