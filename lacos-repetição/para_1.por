programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.*/

		 //variaveis 
		 inteiro habitantes = 3
		 inteiro numeroFilhos
		 inteiro salarioAte100 = 0

		 real salario
		 real maiorSalario = 0.0
		 real somatoriaSalarios = 0.0
		 real somatoriaFilhos = 0.0
		 
		 para (inteiro habitante = 1; habitante <= habitantes; habitante++){
		 	escreva ("Habitante ", habitante, " \n")
		 	escreva("Qual é o seu salário: ")
		 	leia (salario)
		 	escreva("Quantos filhos você tem: ")
		 	leia (numeroFilhos)

		 	//Somatória dos salários para calcular a média salarial
		 	somatoriaSalarios = somatoriaSalarios + salario
		 	//Somatória dos salários para calcular a média de filhos
		 	somatoriaFilhos = somatoriaFilhos + numeroFilhos

		 	//Maior salário
		 	se(salario > maiorSalario){
		 		maiorSalario = salario
		 	}

		 	//Quantidade de pessoas que recebem salário de até R$ 100,00
		 	se(salario <= 100.00){
		 		salarioAte100++
		 	}
		 	
		 }
		 real mediaSalarios = Matematica.arredondar((somatoriaSalarios/habitantes), 1)
		 inteiro mediaFilhos = somatoriaFilhos/habitantes

		 real percentualAte100 = (salarioAte100/habitantes)*100

		 escreva("A média de salário da população é R$ ", mediaSalarios, " \n")
		 escreva("A média de filhos da população é de ", mediaFilhos, " filhos \n")
		 escreva("O maior salário é de R$ ", maiorSalario,"\n")
		 escreva("O percentual de pessoas com salário ate R$ 100,00 é de ", percentualAte100, " %")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */