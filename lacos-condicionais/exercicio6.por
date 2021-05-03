programa
{
	
	funcao inicio()
	{
		/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos*/

		//variaveis
		inteiro idadeNadador 

		//entradas
		escreva("Digite a sua idade: ")
		leia(idadeNadador)

		//processamento
		se(idadeNadador >= 18){
			escreva ("A sua categoria é Adultos")
		}
		senao se (idadeNadador >= 5 e idadeNadador <= 11 ){
			se (idadeNadador <= 7 ){
				escreva ("A sua categoria é Infantil A")
			}
			senao{
				escreva ("A sua categoria é Infantil B")
			}
		}
		senao{
			se (idadeNadador <= 13 ){
				escreva ("A sua categoria é Juvenil A")
			}
			senao{
				escreva ("A sua categoria é Juvenil B")
			}
		
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */