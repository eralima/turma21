package procedural;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class ProjetoEscola {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		// variaveis
		char tipoEstudante;

		// variaveis globais do estudante
		double[] pontos = new double[10];
		char status;
		double notaAtual;

		do {
			System.out.println("\n\nEscola ED++");
			System.out.println(",um plus de ensino em sua vida");
			System.out.println("(1) BÁSICO\n(2) MÉDIO\n(3) GRADUAÇÃO\n(4) PÓS\n(5) MESTRADO\n(6) SAIR");
			System.out.print("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
			tipoEstudante = leia.next().charAt(0);

			switch (tipoEstudante) {
			case '1':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nENSINO BÁSICO");

				dadosEstudante();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);

				if (status == '1') {
					notaAtual = notas();

					// regras de negócios para estudante do ensino básico
					Calendar calendario = Calendar.getInstance();
					int diaAniversario;
					int diaAtual = calendario.get(Calendar.DAY_OF_MONTH);

					System.out.print("\nDigite o dia do seu aniversario: ");
					diaAniversario = leia.nextInt();

					if (diaAniversario == diaAtual) {
						notaAtual = (notaAtual * 0.10) + notaAtual;
						System.out.printf("\nO total de pontos do estudante é %.1f \n\n ", notaAtual);
					} else {
						System.out.printf("\nO total de pontos do estudante é %.1f \n\n ", notaAtual);
					}

				} else {
					System.out.println("\nA matrícula do aluno esta inativa!\n");
				}
				break;
			case '2':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nENSINO MÉDIO");

				dadosEstudante();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);
				
				int indice = 0;
				char[] movimentos = new char[10];
				notaAtual = 0.0;

				char continuar = 'S';
				double excesso = 0.0;
				
				if (status == '1') {
					while (continuar != 'N' && indice < 10) {
						System.out.printf("\nTotal atual: %.2f ", notaAtual);
						System.out.printf("\nMOVIMENTO %d - Digite I (inclusão de nota) ou R (retirada nota): ",
								(indice + 1));
						movimentos[indice] = leia.next().toUpperCase().charAt(0);
						System.out.print("Valor movimento: ");
						pontos[indice] = leia.nextDouble();
						
						if (movimentos[indice] == 'I') {
							notaAtual = notaAtual + pontos[indice];	
						} else if (movimentos[indice] == 'R') {
							if (pontos[indice] > notaAtual) {
								excesso = (pontos[indice] - notaAtual);
								notaAtual = 0;

								indice++;

								System.out.printf("\nTotal atual: %.2f ", notaAtual);
								System.out.printf("\nMOVIMENTO %d - INCLUIA uma nota MAIOR OU IGUAL A %.1f \n",
										(indice + 1), excesso);
								movimentos[indice] = 'I';
								System.out.print("Valor movimento: ");
								pontos[indice] = leia.nextDouble();

								notaAtual = notaAtual + pontos[indice] - excesso;
							} else {
								notaAtual = notaAtual - pontos[indice];
							}
						}
						indice++;
						System.out.print("Continuar? Digite S (Sim) ou N (Não): ");
						continuar = leia.next().toUpperCase().charAt(0);	
					}
					// regras de negócios para estudante do ensino médio
					char imprimirBoletim;
					int impressoesBoletim = 0;

					System.out.print("\nDeseja solicitar impressão do boletim? Digite S/N: ");
					imprimirBoletim = leia.next().toUpperCase().charAt(0);

					if (imprimirBoletim == 'S' && impressoesBoletim < 4) {
						System.out.printf("\nO total de pontos do estudante é %.1f \n", notaAtual);

						impressoesBoletim++;
						System.out.printf("\nBOLETIM\n");
						for (int i = 0; i < indice; i++) {
							if (movimentos[i] == 'I') {
								System.out.printf("Inclusão de nota: %.1f \n", pontos[i]);
							} else {
								System.out.printf("Retirada de nota: %.1f \n", pontos[i]);
							}
						}
					}
				} else {
					System.out.println("\nA matrícula do aluno esta inativa!\n");
				}

				break;
			case '3':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nGRADUAÇÃO");

				dadosEstudante();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);

				break;
			case '4':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nPÓS GRADUAÇÃO");

				dadosEstudante();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);

				break;
			case '5':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nMESTRADO");

				dadosEstudante();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);

				if (status == '1') {
					notaAtual = notas();

					char creditoMestrado;
					int pontoCredito = 0;

					System.out.print("\nVocê possui algum crédito? Digite S (Sim) ou N (Não): ");
					creditoMestrado = leia.next().toUpperCase().charAt(0);

					if (creditoMestrado == 'S') {
						System.out.print("Digite o valor do seu crédito entre 0 e 10: ");
						pontoCredito = leia.nextInt();
					}

					if (pontoCredito != 0) {
						notaAtual = pontoCredito + notaAtual;
						System.out.printf("\nO total de pontos do estudante é %.1f \n", notaAtual);
					} else {
						System.out.printf("\nO total de pontos do estudante é %.1f \n", notaAtual);
					}
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

	public static void dadosEstudante() {
		Scanner leia = new Scanner(System.in);

		int matricula;
		String cpf;

		System.out.print("\nMatrícula: ");
		matricula = leia.nextInt();
		System.out.print("CPF: ");
		cpf = leia.next();
	}

	public static double notas() {
		Scanner leia = new Scanner(System.in);

		int indice = 0;
		double[] pontos = new double[10];
		char[] movimentos = new char[10];
		double notaAtual = 0.0;

		char continuar = 'S';
		double excesso = 0.0;

		while (continuar != 'N' && indice < 10) {
			System.out.printf("\nTotal atual: %.2f ", notaAtual);
			System.out.printf("\nMOVIMENTO %d - Digite I (inclusão de nota) ou R (retirada nota): ", (indice + 1));
			movimentos[indice] = leia.next().toUpperCase().charAt(0);
			System.out.print("Valor movimento: ");
			pontos[indice] = leia.nextDouble();

			if (movimentos[indice] == 'I') {
				notaAtual = notaAtual + pontos[indice];
			} else if (movimentos[indice] == 'R') {
				if (pontos[indice] > notaAtual) {
					excesso = (pontos[indice] - notaAtual);
					notaAtual = 0;

					indice++;
					
					System.out.printf("\nTotal atual: %.2f ", notaAtual);
					System.out.printf("\nMOVIMENTO %d - INCLUIA uma nota MAIOR OU IGUAL A %.1f \n", (indice + 1), excesso);
					movimentos[indice] = 'I';
					System.out.print("Valor movimento: ");
					pontos[indice] = leia.nextDouble();

					notaAtual = notaAtual + pontos[indice] - excesso;
				} else {
					notaAtual = notaAtual - pontos[indice];
				}
			}
			indice++;
			System.out.print("Continuar? Digite S (Sim) ou N (Não): ");
			continuar = leia.next().toUpperCase().charAt(0);
		}
		return notaAtual;
	}
}

