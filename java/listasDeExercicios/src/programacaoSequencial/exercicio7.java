package programacaoSequencial;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		//variáveis
		int coeficienteA;
		int coeficienteB;
		int coeficienteC;
		int coeficienteD;
		int coeficienteE;
		int coeficienteF;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o valor do coeficiente a do sistema linear: ");
		coeficienteA = leia.nextInt();
		System.out.print("Digite o valor do coeficiente b do sistema linear: ");
		coeficienteB = leia.nextInt();
		System.out.print("Digite o valor do coeficiente c do sistema linear: ");
		coeficienteC = leia.nextInt();
		System.out.print("Digite o valor do coeficiente d do sistema linear: ");
		coeficienteD = leia.nextInt();
		System.out.print("Digite o valor do coeficiente e do sistema linear: ");
		coeficienteE = leia.nextInt();
		System.out.print("Digite o valor do coeficiente f do sistema linear: ");
		coeficienteF = leia.nextInt();
		
		//processamento
		float variavelX = ((coeficienteC * coeficienteE) - (coeficienteB * coeficienteF))/((coeficienteA * coeficienteE) - (coeficienteB * coeficienteD));
		float variavelY = ((coeficienteA * coeficienteF) - (coeficienteC * coeficienteD))/((coeficienteA * coeficienteE) - (coeficienteB * coeficienteD));
		
		//saídas
		System.out.print("Os valores que resolvem esse sistema linear são: x = " + variavelX + " e y = " + variavelY);
		
		leia.close();
	}
}
