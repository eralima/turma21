package entidades;

public class Pessoa {
	//atributos
	public String nome;
	public int anoNascimento;
	public char genero;
	public char estado;
	public boolean vivo;
	
	public void idadeAproximada() {
		System.out.printf("A idade aproximada é de %d anos \n",(2021 - anoNascimento));
	}
	
	public void vivoMorto(char vivoMorto) {
		if(vivoMorto == '1') {
			vivo = true;
			System.out.println("Seu amigo está vivo!");
		}
		else {
			vivo = false;
			System.out.println("Seu amigo não está vivo..");	
		}
		
	}
	
	public void genero (char genero) {
		if(genero == 'M') {
			System.out.println("Seu amigo se identifica com o gênero masculino!");
		}
		else if (genero == 'F'){
			System.out.println("Seu amigo se identifica com o gênero feminino!");	
		}
		else {
			System.out.println("Seu amigo se identifica com outro gênero!");	
		}
		
	}
	
}
