programa
{
	
	funcao inicio()
	{
		/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
		 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
		 * João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
		 * Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

		 //variaveis
		 real pesoTomates
		 real excesso = 0.0
		 real multa = 0.0
		 const real valorMulta = 4.0

		//entradas
		escreva("Digite o peso dos tomates ")
		leia(pesoTomates)

		//preocessamento
		se (pesoTomates <= 50 ){
			escreva("O excesso de peso é ", excesso, " kg e você vai pagar R$ ", multa, " de multa")
		}
		senao{
			excesso = pesoTomates - 50
			multa = excesso * valorMulta
			escreva("O peso dos tomates ultrapassou ", excesso, " kg", " e você vai pagar R$ ", multa, " de multa")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 706; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */