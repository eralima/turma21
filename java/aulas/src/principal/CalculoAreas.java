package principal;

import java.util.Scanner;

import entidades.Retangulo;

public class CalculoAreas {
	 public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Retangulo retangulo1 = new Retangulo();//instanciar o objeto ret�ngulo
		Retangulo retangulo2 = new Retangulo();
		
		System.out.println("Informa��es do primeiro ret�ngulo");
		System.out.print("Digite a medida da base do primeiro ret�ngulo: ");
		retangulo1.base = leia.nextDouble();
		System.out.print("Digite a medida da altura do primeiro ret�ngulo: ");
		retangulo1.altura = leia.nextDouble();
		
		retangulo1.area();
		
		System.out.println("\n\nInforma��es do segundo ret�ngulo");
		System.out.print("Digite a medida da base do segundo ret�ngulo: ");
		retangulo2.base = leia.nextDouble();
		System.out.print("Digite a medida da altura do segundo ret�ngulo: ");
		retangulo2.altura = leia.nextDouble();
		
		retangulo2.area();
		
	}
}
