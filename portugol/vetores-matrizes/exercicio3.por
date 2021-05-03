programa
{
	
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

		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("Digite os valores da matriz N1: ")
		 		leia (matrizN1[linha][coluna])	
			}
		}

		escreva("\n")
		
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("Digite os valores da matriz N2: ")
		 		leia (matrizN2[linha][coluna])	
			}
		}
		
		
		//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		//Laço para o calculo de cada elemento da matriz M1
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				matrizM1[linha][coluna] = matrizN1[linha][coluna] + matrizN2[linha][coluna]	
			}
		}

		//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		//Laço para o calculo de cada elemento da matriz M2
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				matrizM2[linha][coluna] = matrizN1[linha][coluna] - matrizN2[linha][coluna]	
			}
		}

		
		//Laço para escrever a matriz N1
		escreva("\nA matriz N1 é:\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				se(coluna < 1){
					escreva(matrizN1[linha][coluna], "  ")
				}
				senao{
					escreva(matrizN1[linha][coluna], "\n")
				}
			}
		}
		
		//Laço para escrever a matriz N2
		escreva("\nA matriz N2 é:\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				se(coluna < 1){
					escreva(matrizN2[linha][coluna], "  ")
				}
				senao{
					escreva(matrizN2[linha][coluna], "\n")
				}
			}
		}

		//Laço para escrever a matriz M1
		escreva("\nA matriz M1 é:\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				se(coluna < 1){
					escreva(matrizM1[linha][coluna], "  ")
				}
				senao{
					escreva(matrizM1[linha][coluna], "\n")
				}
			}
		}

		//Laço para escrever a matriz M2
		escreva("\nA matriz M1 é:\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				se(coluna < 1){
					escreva(matrizM2[linha][coluna], "  ")
				}
				senao{
					escreva(matrizM2[linha][coluna], "\n")
				}
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */