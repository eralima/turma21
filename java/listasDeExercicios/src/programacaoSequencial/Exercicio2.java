package programacaoSequencial;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		/*Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/
		
		//vari�veis
		int idadeEmDias;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite os dias da sua idade: ");
		idadeEmDias = leia.nextInt();
		
		//processamento
		//opera��o para calcular a quantidade de anos que tem nos dias
		int anos = (idadeEmDias/365);
		//opera��o para calcular a quantidade de meses que tem nos dias
		int meses = ((idadeEmDias%365)/30);
		//opera��o para calcular a quantidade de dias 
		int dias = ((idadeEmDias%365)%30);
		
		//sa�das
		System.out.println("A sua idade de " + idadeEmDias + " � de " + anos + " anos, " + meses + " meses e " + dias + " dias");
		
		leia.close();
	}

}
