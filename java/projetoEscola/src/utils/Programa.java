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
		
		// variáveis
		char tipoEstudante;
		
		// variáveis para atribuir os dados do estudante digitados pelo usuário
		int matricula;
		String cpf;
		char status;
		
		double pontos;
		char tipoMovimento;
		
			
		
		do {
			System.out.println("Escola ED++");
			System.out.println(",um plus de ensino em sua vida");
			System.out.println("(1) BÁSICO\n(2) MÉDIO\n(3) GRADUAÇÃO\n(4) PÓS\n(5) MESTRADO\n(6) SAIR");
			System.out.print("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
			tipoEstudante = leia.next().charAt(0);

			switch (tipoEstudante) {
			case '1':
				System.out.println("\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nENSINO BÁSICO");

				System.out.print("\nInforme o número de matrícula: ");
				matricula = leia.nextInt();
				System.out.print("Informe o número do CPF do aluno: ");
				cpf = leia.next();
				System.out.print("\nInforme o dia do seu aniversario: ");
				int diaAniversario = leia.nextInt();
				
				EnsinoBasico alunoBasico = new EnsinoBasico(matricula, cpf, diaAniversario);
				
				System.out.print("Informe o status da matrícula. Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				if(status == '1') {
					char continuar = 'S';
					int movimento = 1;
					while (continuar != 'N' && movimento < 11) {
						System.out.printf("\nTotal atual: %.2f ", alunoBasico.getPontos());
						System.out.printf("\nMOVIMENTO %d - Digite I (inclusão de nota) ou R (retirada nota): ", movimento);
						tipoMovimento = leia.next().toUpperCase().charAt(0);
						System.out.print("Valor movimento: ");
						
						pontos = leia.nextDouble();
						
						if (tipoMovimento == 'I') {
							alunoBasico.adicionarNota(pontos);
							
						} else if (tipoMovimento == 'R') {
							alunoBasico.tirarNota(pontos);
						}
						movimento++;
						System.out.print("Continuar? Digite S (Sim) ou N (Não): ");
						continuar = leia.next().toUpperCase().charAt(0);	
					}
					
				}
				else {
					System.out.println("\nA matrícula do aluno esta inativa!\n");
				}
				
				// regras de negócios para estudante do ensino básico
				int diaAtual = calendario.get(Calendar.DAY_OF_MONTH);
				alunoBasico.bonusAniversario(diaAtual);
				System.out.printf("\nO total de pontos do estudante é %.1f", alunoBasico.getPontos());
				
				break;
			case '2':
				System.out.println("\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nENSINO MÉDIO");

				System.out.print("\nInforme o número de matrícula: ");
				matricula = leia.nextInt();
				System.out.print("Informe o número do CPF do aluno: ");
				cpf = leia.next();
				
				EnsinoMedio alunoMedio = new EnsinoMedio(matricula, cpf);
				
				System.out.print("Informe o status da matrícula. Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				if(status == '1') {
					char continuar = 'S';
					int movimento = 1;
					while (continuar != 'N' && movimento < 11) {
						System.out.printf("\nTotal atual: %.2f ", alunoMedio.getPontos());
						System.out.printf("\nMOVIMENTO %d - Digite I (inclusão de nota) ou R (retirada nota): ", movimento);
						tipoMovimento = leia.next().toUpperCase().charAt(0);
						System.out.print("Valor movimento: ");
						pontos = leia.nextDouble();
						
						if (tipoMovimento == 'I') {
							alunoMedio.adicionarNota(pontos);
							
						} else if (tipoMovimento == 'R') {
							alunoMedio.tirarNota(pontos);
						}
						movimento++;
						System.out.print("Continuar? Digite S (Sim) ou N (Não): ");
						continuar = leia.next().toUpperCase().charAt(0);	
					}
					
				}
				else {
					System.out.println("\nA matrícula do aluno esta inativa!\n");
				}
				
				// regras de negócios para estudante do ensino médio
				System.out.println(alunoMedio.getContadorBoletim());
				System.out.print("\nDeseja solicitar impressão do boletim? Digite S/N: ");
				char imprimirBoletim = leia.next().toUpperCase().charAt(0);
				alunoMedio.pedirBoletim(imprimirBoletim);
				System.out.println(alunoMedio.getContadorBoletim());
				
				
				break;
			case '3':
				System.out.println("\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nGRADUAÇÃO");

				System.out.print("\nInforme o número de matrícula: ");
				matricula = leia.nextInt();
				System.out.print("Informe o número do CPF do aluno: ");
				cpf = leia.next();

				Graduacao alunoGraduacao = new Graduacao(matricula, cpf);
				
				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				if(status == '1') {
					char continuar = 'S';
					int movimento = 1;
					while (continuar != 'N' && movimento < 11) {
						System.out.printf("\nTotal atual: %.2f ", alunoGraduacao.getPontos());
						System.out.printf("\nMOVIMENTO %d - Digite I (inclusão de nota) ou R (retirada nota): ", movimento);
						tipoMovimento = leia.next().toUpperCase().charAt(0);
						System.out.print("Valor movimento: ");
						pontos = leia.nextDouble();
						
						if (tipoMovimento == 'I') {
							alunoGraduacao.adicionarNota(pontos);
							
						} else if (tipoMovimento == 'R') {
							alunoGraduacao.tirarNota(pontos);
						}
						movimento++;
						System.out.print("Continuar? Digite S (Sim) ou N (Não): ");
						continuar = leia.next().toUpperCase().charAt(0);	
					}
					System.out.printf("\nO total de pontos do estudante é %.1f \n", alunoGraduacao.getPontos());
				}
				else {
					System.out.println("\nA matrícula do aluno esta inativa!\n");
				}
				
				break;
			case '4':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nPÓS GRADUAÇÃO");

				System.out.print("\nMatrícula: ");
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

				System.out.print("\nMatrícula: ");
				matricula = leia.nextInt();
				System.out.print("CPF: ");
				cpf = leia.next();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				if(status == '1') {
					
				}
				else {
					System.out.println("\nA matrícula do aluno esta inativa!\n");
				}
				break;
			default:
				break;
			}

		} while (tipoEstudante != '6');
	}

}
