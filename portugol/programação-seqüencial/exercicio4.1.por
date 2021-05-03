programa
{
	inclua biblioteca Matematica 
	funcao inicio()
	{
		//variáveis 
		inteiro a
		inteiro b
		inteiro c

		//entradas
		escreva ("Digite o valor da variável a: ")
		leia (a)
		escreva ("Digite o valor da variável b: ")
		leia (b)
		escreva ("Digite o valor da variável c: ")
		leia (c)
	
		//processamento
		real r = Matematica.potencia((a + b), 2)
		real s = Matematica.potencia((b + c), 2)
		real d = (r + s)/2

		//saída
		escreva ("Para os inteiros positivos " + a + ", " + b + " e " + c + " o valor de d é " + d + "\n")
		escreva ("O valor de r é " + r + " e de s é " + s + "\n")
		escreva ("O valor de d é " + d)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */