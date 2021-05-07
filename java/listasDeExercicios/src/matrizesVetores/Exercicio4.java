package matrizesVetores;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um
			menu de op��es:
			(1) somar as duas matrizes
			(2) subtrair a primeira matriz da segunda
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes
			Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
			da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
			pr�pria matriz.*/
		
		Random random = new Random();
		Scanner leia = new Scanner(System.in);

		//vari�veis
		char continuar;
		char opcaoMenu;
		
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] somarMatriz = new double[2][2];
		double[][] subtrairMatriz = new double[2][2];
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				matriz1[linha][coluna] = (random.nextDouble())*100;
				matriz2[linha][coluna] = (random.nextDouble())*100;
			}
		}
		
		//menu
		do {
			System.out.println("\nMENU");
			System.out.println("(1) somar as duas matrizes \n(2) subtrair a primeira matriz da segunda \n"
					+ "(3) adicionar uma constante as duas matrizes \n(4) imprimir as matrizes");
			System.out.print("Escolha uma das op��es do menu acima. Digite 1, 2, 3 ou 4: ");
			opcaoMenu = leia.next().charAt(0);
			
			switch (opcaoMenu) {
			case '1':
				System.out.println("\nA matriz resultante da soma das matrizes �: ");
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						somarMatriz[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
						System.out.printf("%.1f\t",somarMatriz[linha][coluna]);
					}
					System.out.println();
				}
			   break;
		     case '2':
		    	 System.out.println("\nA matriz resultante da subtra��o das matrizes �: ");
		    	 for (int linha = 0; linha < 2; linha++) {
						for (int coluna = 0; coluna < 2; coluna++) {
							subtrairMatriz[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
							System.out.printf("%.1f\t",subtrairMatriz[linha][coluna]);
						}
						System.out.println();
					}
		       break;
		     case '3':
		       double constante;
		       System.out.print("Informe o valor da constante: ");
		       constante = leia.nextDouble();
		       
		       System.out.printf("\nA matriz resultante da adi��o da constante a matriz 1 %.1f �: \n", constante);
		       for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matriz1[linha][coluna] = matriz1[linha][coluna] + constante;
						System.out.printf("%.1f\t",matriz1[linha][coluna]);
					}
					System.out.println();
				}
		       System.out.printf("\nA matriz resultante da adi��o da constante a matriz 2 %.1f �: \n", constante);
		       for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matriz2[linha][coluna] = matriz2[linha][coluna] + constante;
						System.out.printf("%.1f\t",matriz2[linha][coluna]);
					}
					System.out.println();
				}
		       break;
		     case '4':
		    	 System.out.println("\nA matriz 1 �: ");
		    	 for (int linha = 0; linha < 2; linha++) {
		 			for (int coluna = 0; coluna < 2; coluna++) {
		 				System.out.printf("%.1f\t",matriz1[linha][coluna]);
		 			}
		 			System.out.println();
		 		}
		    	 
		    	 System.out.println("\nA matriz 2 �: ");
		    	 for (int linha = 0; linha < 2; linha++) {
		 			for (int coluna = 0; coluna < 2; coluna++) {
		 				System.out.printf("%.1f\t",matriz2[linha][coluna]);
		 			}
		 			System.out.println();
		 		} 
		       break;
		     default:
		       System.out.println("Op��o digitada inv�lido");
		  }
			
			System.out.print("\nContinua? Digite S (Sim) ou N (N�o): ");
			continuar = leia.next().toUpperCase().charAt(0);
			
		} while (continuar == 'S');
		
		leia.close();
		
	}

}
