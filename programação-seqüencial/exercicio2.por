programa
{
	funcao inicio()
	{
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/
		
		//variaveis 
		inteiro idadeEmDias

		//entradas
		escreva ("Digite a sua idade em dias: ")
		leia (idadeEmDias)
		
		//processamento
		//operação para calcular a quantidade de anos que tem nos dias
		inteiro anos = idadeEmDias/365
		//operação para calcular a quantidade de meses que tem nos dias
		inteiro meses = (idadeEmDias%365)/30
		//operação para calcular a quantidade de dias 
		inteiro dias = (idadeEmDias%365)%30

		//saída
		escreva ("A sua idade de " + idadeEmDias + " é de " + anos + " anos, " + meses + " meses e " + dias + " dias" )
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */