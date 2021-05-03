programa
{
	
	funcao inicio()
	{
		/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se 
		 encontram no conjunto dos números de 1 até 500.*/

		 //variáveis
		 inteiro somatoria = 0

		 para (inteiro numero = 1; numero <=500; numero++){
		 	se(numero%3 == 0 e numero%2 != 0){
		 		somatoria = somatoria + numero
		 	}
		 }

		 escreva ("A somatória de todos os números ímpares múltiplos de três entre de 1 e 500 é " + somatoria)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */