programa
{

	funcao inicio()
	{
		//variaveis 
		inteiro coeficienteA
		inteiro coeficienteB
		inteiro coeficienteC
		inteiro coeficienteD
		inteiro coeficienteE
		inteiro coeficienteF

		//entradas
		escreva ("Digite o valor do coeficiente a do sistema linear: ")
		leia (coeficienteA)
		escreva ("Digite o valor do coeficiente b do sistema linear: ")
		leia (coeficienteB)
		escreva ("Digite o valor do coeficiente c do sistema linear: ")
		leia (coeficienteC)
		escreva ("Digite o valor do coeficiente d do sistema linear: ")
		leia (coeficienteD)
		escreva ("Digite o valor do coeficiente e do sistema linear: ")
		leia (coeficienteE)
		escreva ("Digite o valor do coeficiente f do sistema linear: ")
		leia (coeficienteF)
		
		//processamento
		real variavelX = ((coeficienteC * coeficienteE) - (coeficienteB * coeficienteF))/((coeficienteA * coeficienteE) - (coeficienteB * coeficienteD))
		real variavelY = ((coeficienteA * coeficienteF) - (coeficienteC * coeficienteD))/((coeficienteA * coeficienteE) - (coeficienteB * coeficienteD))

		//saída
		escreva ("Os valores que resolvem esse sistema linear são: x = " + variavelX + " e y = " + variavelY)
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */