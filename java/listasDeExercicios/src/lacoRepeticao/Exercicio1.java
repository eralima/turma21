package lacoRepeticao;

public class Exercicio1 {
	public static void main(String[] args) {
		//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		System.out.println("Os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto igual a 5 s�o: ");
		for (int indice = 1000; indice < 2000 ; indice++) {
			if(indice%11 ==5) {
				
				System.out.print(indice + " ");
			}

		}
	}
}
