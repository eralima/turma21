package programacaoSequencial;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
		 * e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e 
		 * os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.*/
		
		//vari�veis
		double custoDeFabrica;
		final double imposto = 0.45; //impostos
		final double percentagemDistribuidor = 0.28; //percentagem do distribuidor
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o valor do custo de f�brica do carro: ");
		custoDeFabrica = leia.nextDouble();
		
		//processamento
		double custoConsumidor = custoDeFabrica + (custoDeFabrica * imposto) + (custoDeFabrica * percentagemDistribuidor);
		
		//sa�das
		System.out.println("O custo do carro para o consumidor � de R$" + custoConsumidor);
				
		leia.close();
	}

}
