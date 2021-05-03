programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*Desenvolva um sistema em que:Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados*/

		//variáveis
		inteiro numero1, numero2, numero3, numero4

		//entradas
		 escreva("Digite o primeiro número: ")
		 leia (numero1)
		 escreva("Digite o segundo número: ")
		 leia (numero2)
		 escreva("Digite o terceiro número: ")
		 leia (numero3)
		 escreva("Digite o quarto número: ")
		 leia (numero4)

		//processamento
		inteiro quadrado1 = Matematica.potencia(numero1, 2)
		inteiro quadrado2 = Matematica.potencia(numero2, 2)
		inteiro quadrado3 = Matematica.potencia(numero3, 2)
		inteiro quadrado4 = Matematica.potencia(numero4, 2)

		se(quadrado3 >= 100){
			escreva("O quadrado do terceiro número é ", quadrado3)
		}
		senao{
			escreva ("O quadrado no número ", numero1, " é ", quadrado1,"\n")
			escreva ("O quadrado no número ", numero2, " é ", quadrado2,"\n")
			escreva ("O quadrado no número ", numero3, " é ", quadrado3,"\n")
			escreva ("O quadrado no número ", numero4, " é ", quadrado4)
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 456; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */