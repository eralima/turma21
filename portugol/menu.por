programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		caracter opcao

		faca {
			escreva("\nDigite o codigo de sua opção \n")
			escreva("\n1-Basico\n2-Medio\n3-Graduação\n4-Sair :")
			leia(opcao)
			se (opcao =='1'){
				limpa()
				escreva("\nENSINO BASICO")
				Util.aguarde(1000)
			}
			senao se (opcao =='2'){
				limpa()
				escreva("\nENSINO MÉDIO")
				Util.aguarde(1000)
			
			}
			senao se (opcao =='3'){
				limpa()
				escreva("\nGRADUAÇÃO")
				Util.aguarde(1000)
			
			}
		} enquanto (opcao!='4')

		escreva("Fim do programa!!")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 558; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */