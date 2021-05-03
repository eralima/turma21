programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

		//variáveis
		inteiro matrizN1[4][6]
		inteiro matrizN2[4][6]
		inteiro matrizM1[4][6]
		inteiro matrizM2[4][6]

		escreva("A matriz N1 é:\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				matrizN1[linha][coluna] = Util.sorteia(1,9)
				escreva (matrizN1[linha][coluna], "\t ")
			}
			escreva ("\n")	
		}

		escreva("\nA matriz N2 é:\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				matrizN2[linha][coluna] = Util.sorteia(1,9)
				escreva (matrizN2[linha][coluna], "\t")
			}
			escreva ("\n")	
		}

		escreva("\nA matriz M1 é:\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
				matrizM1[linha][coluna] = matrizN1[linha][coluna] + matrizN2[linha][coluna]
				escreva (matrizM1[linha][coluna], "\t")	
			}
			escreva ("\n")	
		}
		
		escreva("\nA matriz M2 é:\n")
		para(inteiro linha = 0; linha < 4; linha++){	
			para(inteiro coluna = 0; coluna < 6; coluna++){
				//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
				matrizM2[linha][coluna] = matrizN1[linha][coluna] - matrizN2[linha][coluna]
				escreva (matrizM2[linha][coluna], "\t")	
			}
			escreva (" \n")	
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */