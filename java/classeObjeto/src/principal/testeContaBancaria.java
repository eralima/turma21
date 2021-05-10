package principal;

import java.util.Scanner;
import entidades.ContaBancaria;

public class testeContaBancaria {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		ContaBancaria conta = new  ContaBancaria();
		
		char tipoMovimentacao;
		
		System.out.print("Você deseja fazer alguma movimentação na sua conta? Digite 1 (depósito) ou 2 (saque): ");
		tipoMovimentacao = leia.next().charAt(0);
		System.out.print("Informe o valor: ");
		if (tipoMovimentacao == '1') {
			conta.deposito(leia.nextDouble());			
		} else if (tipoMovimentacao == '2') {
			conta.sacar(leia.nextDouble());
		}

	}

}
