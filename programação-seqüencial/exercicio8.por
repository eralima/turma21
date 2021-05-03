programa
{
	
	funcao inicio()
	{
		//variaveis
		real custoDeFabrica
		const real imposto = 0.45 //impostos
		const real percentagemDistribuidor = 0.28 //percentagem do distribuidor

		//entradas
		escreva ("Digite o valor do custo de fábrica do carro: ")
		leia (custoDeFabrica)

		//processamento
		real custoConsumidor = custoDeFabrica + (custoDeFabrica * imposto) + (custoDeFabrica * percentagemDistribuidor)

		//saída
		escreva ("O custo do carro para o consumidor é de R$" + custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */