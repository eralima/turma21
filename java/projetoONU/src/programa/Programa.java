package programa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import classes.Consumidor;
import classes.Produtor;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		char opcaoMenuGeral;
		
		ArrayList<Produtor> listaProdutores = new ArrayList <>();
		ArrayList<Consumidor> listaConsumidores = new ArrayList <>();

		listaProdutores.add(new Produtor("José", "000.000.000-00",'M', "(11)0000-0000", '1'));
		listaProdutores.add(new Produtor("Manoel", "111.111.111-11",'M', "(11)1111-1111", '3'));
		listaProdutores.add(new Produtor("Maria", "111.111.111-22", 'F', "(11)1111-1111", '2'));
		
		//produtos do produtor José
		listaProdutores.get(0).cadastrarProdutos("Alface", 2.50, 300);
		listaProdutores.get(0).cadastrarProdutos("Repolho", 2.00, 100);
		listaProdutores.get(1).cadastrarProdutos("Ovos", 4.85, 1000);
		
		do {
			System.out.println("\n----------------------------------BEM VINDE À ONG SUPPORT--------------------------------------------------");
			System.out.println("\n(1) CADASTRAR-SE\n(2) LOGIN\n(3) SAIR");
			System.out.print("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
			opcaoMenuGeral = ler.next().charAt(0);
			
			switch (opcaoMenuGeral) {
			case '1':
				System.out.println("\n\n------------------------------------------CADASTRA-SE----------------------------------------------------");
				System.out.println("\n(1) COMO PRODUTOR\n(2) COMO CONSUMIDOR");
				System.out.print("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
				char opcaoCadastro = ler.next().charAt(0);
				
				switch (opcaoCadastro) {
				case '1':
					System.out.print("\nInforme o seu nome: ");
					String nome =  ler.next();
					System.out.print("Informe o seu CPF: ");
					String cpf =  ler.next();
					System.out.print("Informe o gênero com o qual você se identifica. Digite M (masculino) ou F (feminino): ");
					char genero =  ler.next().toUpperCase().charAt(0);
					System.out.print("Informe o seu telefone: ");
					String telefone =  ler.next();
					System.out.print("Informe o tipo de produto que você produz. Digite 1 (verduras), 2 (frutas) ou 3 (carnes e lacticinios): ");
					char tipoProduto = ler.next().charAt(0);
					
					listaProdutores.add(new Produtor(nome, cpf, genero, telefone, tipoProduto));
					break;
				default:
					break;
				}
				break;
			case '2':
				System.out.println("\n\n------------------------------------------LOGIN---------------------------------------------------------");
				System.out.println("\n(1) COMO PRODUTOR\n(2) COMO CONSUMIDOR");
				System.out.print("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
				char opcaoLogin = ler.next().charAt(0);
				
				System.out.print("\nInforme o seu CPF: ");
				String cpf = ler.next();
				
				for(int i = 0; i < listaProdutores.size(); i++){
			        if (listaProdutores.get(i).getCpf().equals(cpf)){
			        	if(listaProdutores.get(i).getSexo() == 'M') {
			        		System.out.printf("\n----------------------------------BEM VINDO, SR. %s-----------------------------------------------------\n", listaProdutores.get(i).getNome().toUpperCase());
			        	}
			        	else {
			        		System.out.printf("\n----------------------------------BEM VINDA, SRA. %s----------------------------------------------------\n", listaProdutores.get(i).getNome().toUpperCase());
			        	}
			        	
			        	char opcaoMenuProdutor = ' ';
			        	
			        	do {
			        		System.out.println("\n(1) MEUS PRODUTOS\n(2) CADASTRAR PRODUTO\n(3) REMOVER PRODUTO\n(4) ALTERAR PREÇO\n(5) SAIR");
							System.out.print("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
							opcaoMenuProdutor = ler.next().charAt(0);	   
							
							switch (opcaoMenuProdutor) {
							case '1':
								System.out.printf("\n----------------------------------QUINTANDA DO SR %s------------------------------------------------\n\n", 
										listaProdutores.get(i).getNome().toUpperCase());
								System.out.println("ID \t PRODUTO \t\t PREÇO \t\t QUANTIDADE DE PRODUTO");
								for (int j = 0; j <listaProdutores.get(i).getListaProdutos().size() ; j++) {
									System.out.println((j + 1) + "\t  " + listaProdutores.get(i).getListaProdutos().get(j));
								}
								break;
							case '2':
								System.out.println("\n----------------------------------CADASTRO DE PRODUTOS------------------------------------------");
				        		char cadastrar = 'S';
				        		while (cadastrar == 'S' ) {
				        			System.out.print("\nInforme o nome do produto: ");
						        	String nomeProduto = ler.next();
						        	System.out.print("Informe preço do produto: ");
						        	double preco = ler.nextDouble();
						        	System.out.print("Informe a quantidade em estoque do produto: ");
						        	int quantidadeProduto = ler.nextInt();
						        	listaProdutores.get(i).cadastrarProdutos(nomeProduto, preco, quantidadeProduto);
						        	
						        	System.out.print("Deseja continuar cadastrando produtos? Digite S (sim) ou N (não): ");
						        	cadastrar = ler.next().toUpperCase().charAt(0);
								}
								break;
							case '3':
								System.out.println("\n----------------------------------REMOÇÃO DE PRODUTO-------------------------------------------\n");
								System.out.println("LISTA DE PRODUTOS");
								System.out.println("ID \t PRODUTO \t\t PREÇO \t\t QUANTIDADE DE PRODUTO");
								for (int j = 0; j <listaProdutores.get(i).getListaProdutos().size() ; j++) {
									System.out.println((j + 1) + "\t  " + listaProdutores.get(i).getListaProdutos().get(j));
								}
								System.out.print("\nInforme o id do produto que você deseja excluir da lista de produtos: ");
								int excluirProduto = ler.nextInt();
								
								listaProdutores.get(i).getListaProdutos().remove(excluirProduto - 1);
								break;
							case '4':
								System.out.println("\\n---------------------------ALTERAR PREÇO DE PRODUTO-------------------------------------------\n");
								System.out.println("LISTA DE PRODUTOS");
								System.out.println("ID \t PRODUTO \t\t PREÇO \t\t QUANTIDADE DE PRODUTO");
								for (int j = 0; j <listaProdutores.get(i).getListaProdutos().size() ; j++) {
									System.out.println((j + 1) + "\t  " + listaProdutores.get(i).getListaProdutos().get(j));
								}
								System.out.print("\nInforme o id do produto que você deseja alterar preço: ");
								int alterarPreco = ler.nextInt();
								System.out.print("\nInforme o novo preço do produto: ");
								double precoAlterado = ler.nextDouble();
								
								listaProdutores.get(i).getListaProdutos().get(alterarPreco - 1).setPrecoKg(precoAlterado);
								break;
								
							default:
								break;
							}	
						} while (opcaoMenuProdutor != '5');
			        }
			    }
				break;
			default:
				break;
			}	
		} while (opcaoMenuGeral != '3');
		
	
	
		
		
		/*System.out.print("Informe o id do produtor que você deseja ver os produtos: ");
		int idProdutor = ler.nextInt();
		
		System.out.printf("        \n\nQUITANDA DO %s \n\n", listaProdutores.get(idProdutor - 1).getNome().toUpperCase());
		System.out.println("ID \t PRODUTO \t\t PREÇO \t\t QUANTIDADE DE PRODUTO");
		for (int j = 0; j <listaProdutores.get(idProdutor - 1).getListaProdutos().size() ; j++) {
			System.out.println((j + 1) + "\t  " + listaProdutores.get(idProdutor - 1).getListaProdutos().get(j));
		}*/
	}
}
