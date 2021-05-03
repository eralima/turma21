programa
{

	funcao inicio()
	{
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/
		
		//variaveis 
		inteiro idadeAnos
		inteiro idadeMeses
		inteiro idadeDias

		//entradas
		escreva ("Digite os anos da sua idade: ")
		leia (idadeAnos)
		escreva ("Digite os meses da sua idade: ")
		leia (idadeMeses)
		escreva ("Digite os dias da sua idade: ")
		leia (idadeDias)
		
		//processamento
		inteiro idadeEmDias = idadeDias + (idadeAnos * 365) + (idadeMeses * 30)
		

		//saída
		escreva ("A sua idade expressa em dias é " + idadeEmDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */