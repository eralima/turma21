package programacaoSequencial;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
		 * e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e 
		 * os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.*/
		
		//variáveis
		double custoDeFabrica;
		final double imposto = 0.45; //impostos
		final double percentagemDistribuidor = 0.28; //percentagem do distribuidor
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o valor do custo de fábrica do carro: ");
		custoDeFabrica = leia.nextDouble();
		
		//processamento
		double custoConsumidor = custoDeFabrica + (custoDeFabrica * imposto) + (custoDeFabrica * percentagemDistribuidor);
		
		//saídas
		System.out.println("O custo do carro para o consumidor é de R$" + custoConsumidor);
				
		leia.close();
	}

}
