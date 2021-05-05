package lacoCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
			�	10-14 infantil
			�	15-17 juvenil
			�	18-25 adulto*/
		
		Locale.setDefault(Locale.US); 
		Scanner leia = new Scanner (System.in);

		//vari�veis
		int idade;
		
		//entradas
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.print("A sua categoria � a infantil");	
		}
		else if (idade >= 15 && idade <= 17){
			System.out.print("A sua categoria � a juvenil");	
		}
		else if (idade >= 18 && idade <= 25){
			System.out.print("A sua categoria � a juvenil");	
		}
		else {
			System.out.print("N�o se enquadra em nenhuma categoria");	
		}
		
		leia.close();
	}

}
