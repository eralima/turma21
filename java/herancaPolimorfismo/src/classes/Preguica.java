package classes;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);	
	}
	
	//métodos da classe Cachorro
	public void subirArvore() {
		System.out.println("\n\nA preguiça esta subindo a árvore...");
	}
	
	public void emitirSom() {
		System.out.printf("A gente vai vive! A gente vai morrer!");
	}


}
