package utils;

import java.util.Calendar;
import java.util.Scanner;

import classes.EnsinoBasico;
import classes.EnsinoMedio;
import classes.Graduacao;

public class Programa {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Calendar calendario = Calendar.getInstance();
		
		// vari�veis
		char tipoEstudante;
		
		// vari�veis para atribuir os dados do estudante digitados pelo usu�rio
		int matricula;
		String cpf;
		char status;
		
		double pontos;
		char tipoMovimento;
		
			
		
		do {
			System.out.println("Escola ED++");
			System.out.println(",um plus de ensino em sua vida");
			System.out.println("(1) B�SICO\n(2) M�DIO\n(3) GRADUA��O\n(4) P�S\n(5) MESTRADO\n(6) SAIR");
			System.out.print("\nDIGITE O C�DIGO DA OP��O SELECIONADA: ");
			tipoEstudante = leia.next().charAt(0);

			switch (tipoEstudante) {
			case '1':
				System.out.println("\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nENSINO B�SICO");

				System.out.print("\nInforme o n�mero de matr�cula: ");
				matricula = leia.nextInt();
				System.out.print("Informe o n�mero do CPF do aluno: ");
				cpf = leia.next();
				System.out.print("\nInforme o dia do seu aniversario: ");
				int diaAniversario = leia.nextInt();
				
				EnsinoBasico alunoBasico = new EnsinoBasico(matricula, cpf, diaAniversario);
				
				System.out.print("Informe o status da matr�cula. Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				if(status == '1') {
					char continuar = 'S';
					int movimento = 1;
					while (continuar != 'N' && movimento < 11) {
						System.out.printf("\nTotal atual: %.2f ", alunoBasico.getPontos());
						System.out.printf("\nMOVIMENTO %d - Digite I (inclus�o de nota) ou R (retirada nota): ", movimento);
						tipoMovimento = leia.next().toUpperCase().charAt(0);
						System.out.print("Valor movimento: ");
						
						pontos = leia.nextDouble();
						
						if (tipoMovimento == 'I') {
							alunoBasico.adicionarNota(pontos);
							
						} else if (tipoMovimento == 'R') {
							alunoBasico.tirarNota(pontos);
						}
						movimento++;
						System.out.print("Continuar? Digite S (Sim) ou N (N�o): ");
						continuar = leia.next().toUpperCase().charAt(0);	
					}
					
				}
				else {
					System.out.println("\nA matr�cula do aluno esta inativa!\n");
				}
				
				// regras de neg�cios para estudante do ensino b�sico
				int diaAtual = calendario.get(Calendar.DAY_OF_MONTH);
				alunoBasico.bonusAniversario(diaAtual);
				System.out.printf("\nO total de pontos do estudante � %.1f", alunoBasico.getPontos());
				
				break;
			case '2':
				System.out.println("\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nENSINO M�DIO");

				System.out.print("\nInforme o n�mero de matr�cula: ");
				matricula = leia.nextInt();
				System.out.print("Informe o n�mero do CPF do aluno: ");
				cpf = leia.next();
				
				EnsinoMedio alunoMedio = new EnsinoMedio(matricula, cpf);
				
				System.out.print("Informe o status da matr�cula. Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				if(status == '1') {
					char continuar = 'S';
					int movimento = 1;
					while (continuar != 'N' && movimento < 11) {
						System.out.printf("\nTotal atual: %.2f ", alunoMedio.getPontos());
						System.out.printf("\nMOVIMENTO %d - Digite I (inclus�o de nota) ou R (retirada nota): ", movimento);
						tipoMovimento = leia.next().toUpperCase().charAt(0);
						System.out.print("Valor movimento: ");
						pontos = leia.nextDouble();
						
						if (tipoMovimento == 'I') {
							alunoMedio.adicionarNota(pontos);
							
						} else if (tipoMovimento == 'R') {
							alunoMedio.tirarNota(pontos);
						}
						movimento++;
						System.out.print("Continuar? Digite S (Sim) ou N (N�o): ");
						continuar = leia.next().toUpperCase().charAt(0);	
					}
					
				}
				else {
					System.out.println("\nA matr�cula do aluno esta inativa!\n");
				}
				
				// regras de neg�cios para estudante do ensino m�dio
				System.out.println(alunoMedio.getContadorBoletim());
				System.out.print("\nDeseja solicitar impress�o do boletim? Digite S/N: ");
				char imprimirBoletim = leia.next().toUpperCase().charAt(0);
				alunoMedio.pedirBoletim(imprimirBoletim);
				System.out.println(alunoMedio.getContadorBoletim());
				
				
				break;
			case '3':
				System.out.println("\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nGRADUA��O");

				System.out.print("\nInforme o n�mero de matr�cula: ");
				matricula = leia.nextInt();
				System.out.print("Informe o n�mero do CPF do aluno: ");
				cpf = leia.next();

				Graduacao alunoGraduacao = new Graduacao(matricula, cpf);
				
				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				if(status == '1') {
					char continuar = 'S';
					int movimento = 1;
					while (continuar != 'N' && movimento < 11) {
						System.out.printf("\nTotal atual: %.2f ", alunoGraduacao.getPontos());
						System.out.printf("\nMOVIMENTO %d - Digite I (inclus�o de nota) ou R (retirada nota): ", movimento);
						tipoMovimento = leia.next().toUpperCase().charAt(0);
						System.out.print("Valor movimento: ");
						pontos = leia.nextDouble();
						
						if (tipoMovimento == 'I') {
							alunoGraduacao.adicionarNota(pontos);
							
						} else if (tipoMovimento == 'R') {
							alunoGraduacao.tirarNota(pontos);
						}
						movimento++;
						System.out.print("Continuar? Digite S (Sim) ou N (N�o): ");
						continuar = leia.next().toUpperCase().charAt(0);	
					}
					System.out.printf("\nO total de pontos do estudante � %.1f \n", alunoGraduacao.getPontos());
				}
				else {
					System.out.println("\nA matr�cula do aluno esta inativa!\n");
				}
				
				break;
			case '4':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nP�S GRADUA��O");

				System.out.print("\nMatr�cula: ");
				matricula = leia.nextInt();
				System.out.print("CPF: ");
				cpf = leia.next();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				
				break;
			case '5':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nMESTRADO");

				System.out.print("\nMatr�cula: ");
				matricula = leia.nextInt();
				System.out.print("CPF: ");
				cpf = leia.next();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				if(status == '1') {
					
				}
				else {
					System.out.println("\nA matr�cula do aluno esta inativa!\n");
				}
				break;
			default:
				break;
			}

		} while (tipoEstudante != '6');
	}

}
