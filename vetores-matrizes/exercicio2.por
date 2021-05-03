programa
{
	
	funcao inicio()
	{
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.
		 */

		// variaveis
		inteiro lancamentoDado[10]
		inteiro somatoriaValores = 0
		
		inteiro maiorPontuacao = 0
		inteiro ocorrrenciaMaiorPontuacao = 0
		
	

		 para(inteiro indice = 0; indice < 10; indice++){
		 	escreva("Digite a o valor do dado no lançamento ", indice + 1, ": " )
		 	leia (lancamentoDado[indice])	
		 }
		 
		 escreva("\n")
		 para(inteiro indice = 0; indice < 10; indice++){
		 	escreva(" Os valores que sairam nos lançamentos foram: ", lancamentoDado[indice], "\n")
		 }

		 //Laço para fazer a somatoria dos valores obtidos nos lançamentos e qual foi a maior pontuação obtida nos lançamentos
		 para(inteiro indice = 0; indice < 10; indice++){
		 	somatoriaValores = somatoriaValores + lancamentoDado[indice]

		 	se(lancamentoDado[indice] >= maiorPontuacao){
		 		maiorPontuacao = lancamentoDado[indice] 
		 	}
		 }
		 
		 //Laço para descobrir quantas foram as ocorrências da maior pontuação
		  para(inteiro indice = 0; indice < 10; indice++){
		 	 se(lancamentoDado[indice] == maiorPontuacao ){
		 	 	ocorrrenciaMaiorPontuacao++
		 	 }
		 }

		 real mediaLancamentos = somatoriaValores/10
		 escreva("\n A média aritmética dos lançamentos foi de : ", mediaLancamentos, "\n")
		 escreva("\n A maior pontuação dos lançamentos foi ",maiorPontuacao, " e ocorreu ",ocorrrenciaMaiorPontuacao," vezes")	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */