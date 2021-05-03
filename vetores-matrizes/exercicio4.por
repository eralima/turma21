programa
{
	
	funcao inicio()
	{
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em segui
		 * a, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		 */

		//variáveis
		inteiro  matriz [3][3]
		inteiro  somaMatriz = 0
		inteiro  somaDiagonal = 0

		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("Digite os valores da matriz: ")
		 		leia (matriz[linha][coluna])	
			}
		}

		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				somaMatriz = somaMatriz + matriz[linha][coluna]
			}
		}

		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				se(linha == coluna){
					somaDiagonal = somaDiagonal + matriz[linha][coluna]
				}
				
			}
		}

		//Laço para escrever a matriz M1
		escreva("\nA matriz 3X3 é:\n")
		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				se(coluna < 2){
					escreva(matriz[linha][coluna], "  ")
				}
				senao{
					escreva(matriz[linha][coluna], "\n")
				}
			}
		}

		escreva("\nA soma dos valores da matriz 3X3 é ", somaMatriz, "\n")
		escreva("\nA soma dos valores dos valores da primeira diagonal da matriz 3X3 é ", somaDiagonal)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */