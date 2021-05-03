programa
{
	
	funcao inicio()
	{
		/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
		 E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
		 A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.*/

		//variaveis
		cadeia codigo //código
		real horasTrabalhadas
		real salarioExcedente = 0.0
		
		
		const real horasBase = 50.0
		const real valorHora = 20.0 //A hora excedente de trabalho vale R$ 20,00.
		const real salarioBase = 500.0 //Como o operário ganha R$ 10,00/hora, e trabalha no mínimo 50

		//entradas
		escreva("Informe o seu código: ")
		leia(codigo)
		escreva("Informe a quantidade de horas trabalhadas: ")
		leia(horasTrabalhadas)
		
		//processamento
		se (horasTrabalhadas == 50){
			escreva(codigo, " : o seu salário total é R$ ", salarioBase, " e o salário excedente é R$ ", salarioExcedente)
		}
		senao{
			salarioExcedente = (horasTrabalhadas - horasBase) * valorHora
			real salarioTotal = salarioBase + salarioExcedente
			escreva(codigo, " : o seu salário total é R$ ", salarioTotal, " e o salário excedente é R$ ", salarioExcedente)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */