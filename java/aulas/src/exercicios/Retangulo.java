package exercicios;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double altura1, altura2;
		double base1, base2;

		System.out.println("Digite a medida da altura do retangulo 1: ");
		altura1 = leia.nextDouble();
		System.out.println("Digite a medida da base do retangulo 1: ");
		base1 = leia.nextDouble();
		System.out.println("Digite a medida da altura do retangulo 2: ");
		altura2 = leia.nextDouble();
		System.out.println("Digite a medida da base do retangulo 2: ");
		base2 = leia.nextDouble();

		double area1 = altura1 * base1;
		double area2 = altura2 * base2;

		if (area1 > area2) {
			System.out.print("O retângulo 1 tem a maior área");
		} else {
			System.out.print("O retângulo 2 tem a maior área");
		}

	}
}
