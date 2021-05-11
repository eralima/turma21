package utils;

import java.util.Scanner;

import classes.EnsinoBasico;

public class ProgramaTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o número da matricula: ");
		int matricula = leia.nextInt();
		System.out.print("Digite o CPF: ");
		String cpf = leia.next();
		System.out.print("Digite o dia do aniversário: ");
		int dia = leia.nextInt();
		
		EnsinoBasico alunoBasico = new EnsinoBasico(matricula, cpf, dia);
		alunoBasico.adicionarNota(10);
		System.out.printf("Pontos atuais: %.0f", alunoBasico.getPontos());
		
		
		
		
		

	}

}
