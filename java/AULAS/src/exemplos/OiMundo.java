package exemplos;

import java.util.Scanner;

public class OiMundo {
	public static void main(String[] args) {
		
		//variaveis
		//inteiro numero1
		//cadeia nome
		//escreva ("Digite o nome: ")
		//leia (nome)
		
		//instanciar = criar um teclado
		Scanner leia = new Scanner(System.in);
		int numero1 = 10;
		int numero2 = 30;
		double salario = 1999.25;
		char opcao = 'S';
		String nome;
		
		//escreva ("Digite um número") no Portugol
		System.out.println("Digite um número 1: ");
		//leia (numero1) no Portugol
		numero1 = leia.nextInt();
		
		System.out.println("Digite um número 2: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite um nome: ");
		nome = leia.next();
		
		System.out.println("Digite um salario: ");
		salario = leia.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("Soma: " + numero1 + numero2);
		
	}
}
