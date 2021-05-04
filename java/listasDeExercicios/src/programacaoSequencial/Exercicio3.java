package programacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
		 * e mostre-o expresso em horas, minutos e segundos. */
		
		//variáveis
		int tempoSegundos;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o tempo do evento em segundos: ");
		tempoSegundos = leia.nextInt();
		
		//processamento
		//operação para calcular a quantidade de horas que tem nos segundos
		int horas = (tempoSegundos/3600);
		//operação para calcular a quantidade de minutos que tem nos segundos
		int minutos = ((tempoSegundos%3600)/60);
		//operação para calcular a quantidade de segundos 
		int segundos = ((tempoSegundos%3600)%60);
		
		//saída
		System.out.print("O evento de " + tempoSegundos + " durou " + horas + " h, " + minutos + " min e " + segundos + " s");
		
		leia.close();	
	}

}
