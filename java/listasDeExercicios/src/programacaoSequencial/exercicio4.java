package programacaoSequencial;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		//vari�veis 
		float a;
		float b;
		float c;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o valor da vari�vel a: ");
		a = leia.nextFloat();
		System.out.print("Digite o valor da vari�vel b: ");
		b = leia.nextFloat();
		System.out.print("Digite o valor da vari�vel c: ");
		c = leia.nextFloat();
		
		
		//processamento
		double r = Math.pow((a + b), 2);
		double s = Math.pow((b + c), 2);
		double d = ((r + s)/2);
		
		//sa�da
		System.out.print("Para os inteiros positivos " + a + ", " + b + " e " + c + " o valor de d � " + d + "\n");
		System.out.print("O valor de r � " + r + " e de s � " + s + "\n");
		System.out.print("O valor de d � " + d);
		
		leia.close();		
	}
}
