programa
{
	
	funcao inicio()
	{
		/*Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a área do triângulo.*/

		 //variaveis 
		 real base, altura

		 //entradas
		 escreva("Digite o valor da medida da base do triângulo: ")
		 leia (base)
		 escreva("Digite o valor da medida da altura do triângulo: ")
		 leia (altura)

		 //processamento
		 se(base > 0 e altura > 0){
		 	real area = (base * altura)/2
		 	escreva("A área do triângulo de base ", base, " e altura ", altura, " é ", area) 
		 }
		 senao{
		 	escreva ("Os valores da base e altura do triangulo devem ser valores positivos")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */