package principal;

import java.util.Scanner;

import entidades.Retangulo;

public class CalculoAreas {
	 public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Retangulo retangulo1 = new Retangulo();//instanciar o objeto retângulo
		Retangulo retangulo2 = new Retangulo();
		
		System.out.println("Informações do primeiro retângulo");
		System.out.print("Digite a medida da base do primeiro retângulo: ");
		retangulo1.base = leia.nextDouble();
		System.out.print("Digite a medida da altura do primeiro retângulo: ");
		retangulo1.altura = leia.nextDouble();
		
		retangulo1.area();
		
		System.out.println("\n\nInformações do segundo retângulo");
		System.out.print("Digite a medida da base do segundo retângulo: ");
		retangulo2.base = leia.nextDouble();
		System.out.print("Digite a medida da altura do segundo retângulo: ");
		retangulo2.altura = leia.nextDouble();
		
		retangulo2.area();
		
	}
}
