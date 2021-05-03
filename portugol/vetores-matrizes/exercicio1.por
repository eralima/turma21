programa
{
	
	funcao inicio()
	{
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 */

		 //variaveis
		 real pontuacao[5]
		 real maiorPontuacao = 0.0

		 para(inteiro indice = 0; indice < 5; indice++){
		 	escreva("Digite a pontuação da atividade: ")
		 	leia (pontuacao[indice])	
		 }
		 para(inteiro indice = 0; indice < 5; indice++){
		 	escreva("As pontuações da atividade foram: ", pontuacao[indice], "\n")
		 }

		 para(inteiro indice = 0; indice < 5; indice++){
		 	se (pontuacao[indice] >= maiorPontuacao){
		 		maiorPontuacao = pontuacao[indice]
		 	}
		 }
		 escreva("A maior pontuação foi ", maiorPontuacao)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */