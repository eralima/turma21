package programacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos 
		 * e mostre-o expresso em horas, minutos e segundos. */
		
		//vari�veis
		int tempoSegundos;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o tempo do evento em segundos: ");
		tempoSegundos = leia.nextInt();
		
		//processamento
		//opera��o para calcular a quantidade de horas que tem nos segundos
		int horas = (tempoSegundos/3600);
		//opera��o para calcular a quantidade de minutos que tem nos segundos
		int minutos = ((tempoSegundos%3600)/60);
		//opera��o para calcular a quantidade de segundos 
		int segundos = ((tempoSegundos%3600)%60);
		
		//sa�da
		System.out.print("O evento de " + tempoSegundos + " durou " + horas + " h, " + minutos + " min e " + segundos + " s");
		
		leia.close();	
	}

}
