package programacaoSequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		//vari�veis 
		double xPonto1;
		double yPonto1;
		double xPonto2;
		double yPonto2;
		
		Scanner leia = new Scanner(System.in);
		
		//Diminuir o n�mero de casas depois da v�gula 
		DecimalFormat decimal = new DecimalFormat();
		
		//entradas
		System.out.print("Digite o valor da coordenada x do ponto 1: ");
		xPonto1 = leia.nextDouble();
		System.out.print("Digite o valor da coordenada y do ponto 1: ");
		yPonto1 = leia.nextDouble();
		
		System.out.print("Digite o valor da coordenada x do ponto 2: ");
		xPonto2 = leia.nextDouble();
		System.out.print("Digite o valor da coordenada y do ponto 2: ");
		yPonto2 = leia.nextDouble();
		
		//processamento
		double distancia = Math.sqrt(Math.pow((xPonto2 - xPonto1), 2) + Math.pow((yPonto2 - yPonto1), 2) );
		
		//sa�da
		System.out.print("A dist�ncia entre os pontos � de " + decimal.format(distancia));
				
		leia.close();	
	}

}
