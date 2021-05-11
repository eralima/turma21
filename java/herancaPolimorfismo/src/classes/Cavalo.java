package classes;

public class Cavalo extends Animal{

	//construtor
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	//métodos da classe Cavalo
	public void correr() {
		System.out.printf("\nO cavalo %s esta correndo...", super.getNome());
	}
	
	public void emitirSom() {
		System.out.printf("\nHiin in in, Hiin in in");
	}
}
