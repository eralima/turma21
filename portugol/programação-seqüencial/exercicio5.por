programa
{
	funcao inicio()
	{
		//variáveis 
		real nota1
		real nota2
		real nota3

		//entradas
		escreva ("Digite a sua nota 1: ")
		leia (nota1)
		escreva ("Digite a sua nota 2: ")
		leia (nota2)
		escreva ("Digite a sua nota 3: ")
		leia (nota3)
	
		//processamento
		real mediaFinal = (2 * nota1 + 3 * nota2 + 5 * nota3)/10
		
		//saída
		escreva ("A sua média final é " + mediaFinal)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 85; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */