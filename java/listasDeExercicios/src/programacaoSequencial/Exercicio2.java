package programacaoSequencial;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/
		
		//variáveis
		int idadeEmDias;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite os dias da sua idade: ");
		idadeEmDias = leia.nextInt();
		
		//processamento
		//operação para calcular a quantidade de anos que tem nos dias
		int anos = (idadeEmDias/365);
		//operação para calcular a quantidade de meses que tem nos dias
		int meses = ((idadeEmDias%365)/30);
		//operação para calcular a quantidade de dias 
		int dias = ((idadeEmDias%365)%30);
		
		//saídas
		System.out.println("A sua idade de " + idadeEmDias + " é de " + anos + " anos, " + meses + " meses e " + dias + " dias");
		
		leia.close();
	}

}
