package classes;

public class Cachorro extends Animal{
	//construtor
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	//m�todos da classe Cachorro
	public void correr() {
		System.out.println("\n\nO cachorro est� correndo...");
	}
	
	@Override
	public void emitirSom() {
		System.out.printf("Au Au! Au Au! Au Au!");
	}

}
