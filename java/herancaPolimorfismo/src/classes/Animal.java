package classes;

//com o abstract não sera mais possível criar um objeto do tipo Animal na classe principal
public abstract class Animal {
	
	/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), 
	 * utilize os seus conhecimentos e distribua as características de forma que tudo o que for 
	 * comum a todos os animais fique na classe Animal:*/
	
	//atributos e encapsulamento
	private String nome;
	private int idade;
	
	//construtor
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	//encapsulamento (getters and setters)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//métodos
	public void emitirSom() {
		System.out.println("O animal esta emitindo um som ...");
	}
	
}
