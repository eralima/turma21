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
			System.out.println("(1) B�SICO\n(2) M�DIO\n(3) GRADUA��O\n(4) P�S\n(5) MESTRADO\n(6) SAIR");
			System.out.print("\nDIGITE O C�DIGO DA OP��O SELECIONADA: ");
			tipoEstudante = leia.next().charAt(0);

			switch (tipoEstudante) {
			case '1':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nENSINO B�SICO");

				dadosEstudante();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);

				if (status == '1') {
					notaAtual = notas();

					// regras de neg�cios para estudante do ensino b�sico
					Calendar calendario = Calendar.getInstance();
					int diaAniversario;
					int diaAtual = calendario.get(Calendar.DAY_OF_MONTH);

					System.out.print("\nDigite o dia do seu aniversario: ");
					diaAniversario = leia.nextInt();

					if (diaAniversario == diaAtual) {
						notaAtual = (notaAtual * 0.10) + notaAtual;
						System.out.printf("\nO total de pontos do estudante � %.1f \n\n ", notaAtual);
					} else {
						System.out.printf("\nO total de pontos do estudante � %.1f \n\n ", notaAtual);
					}

				} else {
					System.out.println("\nA matr�cula do aluno esta inativa!\n");
				}
				break;
			case '2':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nENSINO M�DIO");

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
						System.out.printf("\nMOVIMENTO %d - Digite I (inclus�o de nota) ou R (retirada nota): ",
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
						System.out.print("Continuar? Digite S (Sim) ou N (N�o): ");
						continuar = leia.next().toUpperCase().charAt(0);	
					}
					// regras de neg�cios para estudante do ensino m�dio
					char imprimirBoletim;
					int impressoesBoletim = 0;

					System.out.print("\nDeseja solicitar impress�o do boletim? Digite S/N: ");
					imprimirBoletim = leia.next().toUpperCase().charAt(0);

					if (imprimirBoletim == 'S' && impressoesBoletim < 4) {
						System.out.printf("\nO total de pontos do estudante � %.1f \n", notaAtual);

						impressoesBoletim++;
						System.out.printf("\nBOLETIM\n");
						for (int i = 0; i < indice; i++) {
							if (movimentos[i] == 'I') {
								System.out.printf("Inclus�o de nota: %.1f \n", pontos[i]);
							} else {
								System.out.printf("Retirada de nota: %.1f \n", pontos[i]);
							}
						}
					}
				} else {
					System.out.println("\nA matr�cula do aluno esta inativa!\n");
				}

				break;
			case '3':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nGRADUA��O");

				dadosEstudante();

				System.out.print("Status: Digite 1 (Ativa) ou 2 (Inativa): ");
				status = leia.next().charAt(0);

				break;
			case '4':
				System.out.println("\n\nEscola ED++");
				System.out.println(",um plus de ensino em sua vida");
				System.out.println("\nP�S GRADUA��O");

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

					System.out.print("\nVoc� possui algum cr�dito? Digite S (Sim) ou N (N�o): ");
					creditoMestrado = leia.next().toUpperCase().charAt(0);

					if (creditoMestrado == 'S') {
						System.out.print("Digite o valor do seu cr�dito entre 0 e 10: ");
						pontoCredito = leia.nextInt();
					}

					if (pontoCredito != 0) {
						notaAtual = pontoCredito + notaAtual;
						System.out.printf("\nO total de pontos do estudante � %.1f \n", notaAtual);
					} else {
						System.out.printf("\nO total de pontos do estudante � %.1f \n", notaAtual);
					}
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

	public static void dadosEstudante() {
		Scanner leia = new Scanner(System.in);

		int matricula;
		String cpf;

		System.out.print("\nMatr�cula: ");
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
			System.out.printf("\nMOVIMENTO %d - Digite I (inclus�o de nota) ou R (retirada nota): ", (indice + 1));
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
			System.out.print("Continuar? Digite S (Sim) ou N (N�o): ");
			continuar = leia.next().toUpperCase().charAt(0);
		}
		return notaAtual;
	}
}

