package lacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
			o número de pessoas calmas; 
			o número de mulheres nervosas; 
			o número de homens agressivos; 
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos; 
			o número de pessoas calmas com menos de 18 anos.*/
		
			Locale.setDefault(Locale.US); 
			Scanner leia = new Scanner (System.in);
			
			//variaveis
			int idade;
			char sexo;
			char caracteristica;
			
			int quantidadePessoas = 1;
			int pessoasCalmas = 0;
			int outrosCalmos = 0;
			int calmasMenos18 = 0;
			
			int mulheresNervosas = 0;
			int nervosasMais40 = 0;
			
			int homensAgressivos = 0;
		

			while (quantidadePessoas < 151) {
				
				//entradas
				System.out.printf("\nINDIVÍDUO %d \n",quantidadePessoas);
				
				System.out.print("Informe a sua idade: ");
				idade = leia.nextInt();
				System.out.print("Informe o seu sexo. Digite 1 (feminino), 2 (masculino) ou 3 (Outros): ");
				sexo = leia.next().charAt(0);
				System.out.print("Informe a sua característica psicológica. Digite 1 (calma), 2 (nervosa) ou 3(agressiva): ");
				caracteristica = leia.next().charAt(0);
				
				if (caracteristica == '1') {
					pessoasCalmas++;
					if (sexo == '3') {
						outrosCalmos++;
					}
					if(idade <= 18) {
						calmasMenos18++;
					}	
				}
				else if (caracteristica == '2') {
					if (sexo == '1') {
						mulheresNervosas++;
					}
					if(idade >= 40) {
						nervosasMais40++;
					}		
				}
				else {
					if(sexo == '2' && caracteristica == '3') {
						homensAgressivos++;
					}
				}
			
				quantidadePessoas++;
			}
			
			System.out.printf("\nO total de pessoas calmas foi de %d pessoas", pessoasCalmas);
			System.out.printf("\nO total de pessoas do sexo outros calmas foi de %d pessoas", outrosCalmos);
			System.out.printf("\nO total de pessoas calmas com menos de 18 anos foi de %d pessoas", calmasMenos18);
			
			System.out.printf("\nO total de mulheres nervosas foi de %d pessoas", mulheresNervosas);
			System.out.printf("\nO total de pessoas nervosas com mais de 40 anos foi de %d pessoas", nervosasMais40);
			
			System.out.printf("\nO total de homens agressivos foi de %d pessoas", homensAgressivos);
			
			leia.close();
	}	
}

