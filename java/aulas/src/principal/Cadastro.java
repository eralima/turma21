package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
	
		
		System.out.print("Insira o nome do amigo: ");
		pessoa.nome = leia.nextLine();
		System.out.print("Insira o ano de nascimento do amigo: ");
		pessoa.anoNascimento = leia.nextInt();
		System.out.print("Insira o genero do amigo (F/M/O): ");
		pessoa.genero = leia.next().toUpperCase().charAt(0);
		System.out.print("O amigo está vivo? (1 - Sim / 2 - Não): ");
		pessoa.estado = leia.next().charAt(0);
		
		
		System.out.println();
		System.out.println("Seu amigo se chama " + pessoa.nome);
		
		pessoa.idadeAproximada();
		pessoa.genero(pessoa.genero);
		pessoa.vivoMorto(pessoa.estado);
		
		//Impressão para verificar o atributo boolean vivo
		System.out.println(pessoa.vivo);
		
		
		leia.close();
	}

}
