programa
{
	funcao inicio()
	{
		//variaveis 
		inteiro tempoSegundos

		//entradas
		escreva ("Digite o tempo do evento em segundos: ")
		leia (tempoSegundos)
		
		//processamento
		//operação para calcular a quantidade de horas que tem nos segundos
		inteiro horas = tempoSegundos/3600
		//operação para calcular a quantidade de minutos que tem nos segundos
		inteiro minutos = (tempoSegundos%3600)/60
		//operação para calcular a quantidade de segundos 
		inteiro segundos = (tempoSegundos%3600)%60

		//saída
		escreva ("O evento de " + tempoSegundos + " durou " + horas + " h, " + minutos + " min e " + segundos + " s" )
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 631; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */