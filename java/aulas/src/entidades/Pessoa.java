package entidades;

public class Pessoa {
	//atributos
	public String nome;
	public int anoNascimento;
	public char genero;
	public char estado;
	public boolean vivo;
	
	public void idadeAproximada() {
		System.out.printf("A idade aproximada � de %d anos \n",(2021 - anoNascimento));
	}
	
	public void vivoMorto(char vivoMorto) {
		if(vivoMorto == '1') {
			vivo = true;
			System.out.println("Seu amigo est� vivo!");
		}
		else {
			vivo = false;
			System.out.println("Seu amigo n�o est� vivo..");	
		}
		
	}
	
	public void genero (char genero) {
		if(genero == 'M') {
			System.out.println("Seu amigo se identifica com o g�nero masculino!");
		}
		else if (genero == 'F'){
			System.out.println("Seu amigo se identifica com o g�nero feminino!");	
		}
		else {
			System.out.println("Seu amigo se identifica com outro g�nero!");	
		}
		
	}
	
}
