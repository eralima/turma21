package programacaoSequencial;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
		 * e mostre-a expressa apenas em dias. 
		 */
		
		//vari�veis
		int idadeAnos;
		int idadeMeses;
		int idadeDias;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite os anos da sua idade: ");
		idadeAnos = leia.nextInt();
		System.out.print("Digite os meses da sua idade: ");
		idadeMeses = leia.nextInt();
		System.out.print("Digite os dias da sua idade: ");
		idadeDias = leia.nextInt();
		
		//processamento
		int idadeEmDias;
		idadeEmDias = idadeDias + (idadeAnos * 365) + (idadeMeses * 30);
		
		//sa�das
		System.out.print("A sua idade expressa em dias � " + idadeEmDias);
		
		leia.close();
	}

}
