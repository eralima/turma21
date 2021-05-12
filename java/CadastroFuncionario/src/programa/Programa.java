package programa;

import java.util.Scanner;

import classes.Terceiro;

public class Programa {

	public static void main(String[] args) {
		Scanner leia =  new Scanner(System.in);
		
		//variáveis usadas para o teste usando os valores informados pelo usuário
		String matricula;
		String nome;
		int horasTrabalhadas;
		double valorHora;
		
		//teste do desenvolvedor usando o construtor
		Terceiro terceiro1 = new Terceiro("11", "Ed", 60, 9);
		System.out.print("Matrícula: " + terceiro1.getMatricula());
		System.out.print("\nNome: " + terceiro1.getNome());
		terceiro1.mostrarSalario();
		
		//teste usando os valores informados pelo usuário 
		System.out.print("\nInforme a matrícula do funcionário: ");
		matricula = leia.next();
		System.out.print("Informe o nome do funcionário: ");
		nome = leia.next();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = leia.nextInt();
		System.out.print("Informe o valor da hora trabalhada: ");
		valorHora = leia.nextDouble();
		
		Terceiro terceiro2 = new Terceiro(matricula, nome, horasTrabalhadas, valorHora);
		System.out.print("\nMatricula: " + terceiro2.getMatricula());
		System.out.print("\nNome: " + terceiro2.getNome());
		terceiro1.mostrarSalario();

	}

}
