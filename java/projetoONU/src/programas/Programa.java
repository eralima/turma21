package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Consumidor;
import classes.ConsumidorFisico;
import classes.ONGs;
import classes.Produto;
import classes.Produtor;

public class Programa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		System.out.println("CADASTRO DE USUÁRIOS");
		System.out.println("Você quer se cadastrar como consumidor (1) ou produtor (2)");
		char opcao = leia.next().charAt(0);
		
		System.out.println("Você é um consumidor físico (1) ou uma ONG (2)");
		char opcaoConsumidor = leia.next().charAt(0);
		if (opcaoConsumidor == '1') {
		
		List<Consumidor> listaConsumidor = new ArrayList <>();
		
		System.out.print("Informe o seu telefone:");
		String telefone = leia.next();
		System.out.println("Informe o seu endereço: ");
		String endereco = leia.next(); 
		System.out.println("Informe o seu email: ");
		String email = leia.next();
		System.out.println("Informe o seu nome:");
		String nomeConsumidor = leia.next();
		System.out.println("Informe o seu CPF: ");
		String cpf = leia.next();
		
		if(opcao == '1') {
			listaConsumidor.add(new ConsumidorFisico(telefone, endereco, email, nomeConsumidor, cpf));
			
		} else {
			System.out.print("Informe o nome da instiruiçao : ");
			String nomeInstituicao = leia.next();
			System.out.print("Informe o seu cnpj: ");
			String cnpj = leia.next();
			listaConsumidor.add(new ONGs(telefone, endereco, email, nomeInstituicao, cnpj));
		}
		
		System.out.println("Gostaria de ver os nossos produtores cadastrados? Digite S (sim) ou N (não): ");
		char opcaoVer = leia.next().toUpperCase().charAt(0);
		if(opcaoVer == 'S') {
			List<Produto> verduras = new ArrayList <>();
			List<Produto> verduras1 = new ArrayList <>();
			List<Produto> verduras2 = new ArrayList <>();
			
			List<Produtor> produtores = new ArrayList <>();
			
			verduras.add(new Produto("Alface", 2.00, 2000));
			verduras.add(new Produto("Repolho", 2.00, 1000));
			verduras.add(new Produto("Agrião", 4.00, 1000));

			verduras1.add(new Produto("Maça", 3.00, 200));
			verduras1.add(new Produto("Laranja", 4.00, 500));
			verduras1.add(new Produto("Manga", 3.50, 50));
			
			verduras2.add(new Produto("Alface", 2.50, 200));
			verduras2.add(new Produto("Repolho", 3.50, 100));
			verduras2.add(new Produto("Agrião", 3.00, 50));

			produtores.add(new Produtor("José", "1111-00", "0000-0000" , "Rua das Rosas", verduras, '1'));
			produtores.add(new Produtor("Manuel", "1111-11", "1111-1111" , "Rua das Margarida", verduras1, '1'));
			produtores.add(new Produtor("Francisco", "1111-11", "1111-1111" , "Rua dos Girassóis", verduras2, '1'));
			
			for (Produtor produtor : produtores) {
				System.out.printf("\n\nQUITANDA DO SR(A) %s \n\n",produtor.getNome().toUpperCase());
				System.out.println("PRODUTO \t PREÇO \t      UNIDADES PARA DOAÇÃO");
				for (Produto produto : verduras) {
					System.out.printf("%s   \t",produto.getNomeProduto());
					System.out.printf(" %.2f   \t", produto.getPrecoKg());
					System.out.printf("%.1f unidades \n", produto.getKgDoado());
				}
				System.out.println();
			}
			
		}	
		}
	}
}
