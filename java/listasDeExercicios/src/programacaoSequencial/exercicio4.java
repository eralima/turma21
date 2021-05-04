package programacaoSequencial;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		//variáveis 
		float a;
		float b;
		float c;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o valor da variável a: ");
		a = leia.nextFloat();
		System.out.print("Digite o valor da variável b: ");
		b = leia.nextFloat();
		System.out.print("Digite o valor da variável c: ");
		c = leia.nextFloat();
		
		
		//processamento
		double r = Math.pow((a + b), 2);
		double s = Math.pow((b + c), 2);
		double d = ((r + s)/2);
		
		//saída
		System.out.print("Para os inteiros positivos " + a + ", " + b + " e " + c + " o valor de d é " + d + "\n");
		System.out.print("O valor de r é " + r + " e de s é " + s + "\n");
		System.out.print("O valor de d é " + d);
		
		leia.close();		
	}
}
