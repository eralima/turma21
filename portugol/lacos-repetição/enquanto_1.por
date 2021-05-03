programa
{
	
	funcao inicio()
	{
	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	apresente no final o total do somatório, a média e o total de valores lidos. O programa
	deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
	positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
	negativo. */

	//variáveis
	real numero = 0.0
	real somatoria = 0.0
	inteiro totalValores = 0

	enquanto(numero >= 0.0){
		escreva("Digite um número: ")
		leia(numero)

		se(numero >= 0.0){
			//Somatorio dos valores númericos lidos
			somatoria = somatoria + numero
			//Total de valores lidos
			totalValores++		
		}
	}
	real media = (somatoria/totalValores)
	escreva("Foram lidos ", totalValores, " valores\n")
	escreva ("A média dos valores lidos é ", media)
	
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 34; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */