package classes;

//a classe Estudante é a mãe (super) da classe EnsinoBasico
public class EnsinoBasico extends Estudante {
	//atributos
	private int diaAniversario;

	//construtor
	public EnsinoBasico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.setDiaAniversario(diaAniversario);
	}
	
	//encapsulamento (getters and setters)
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	// métodos
	public void bonusAniversario(int dia) {
		if(diaAniversario == dia) {
			super.adicionarNota(super.getPontos()*0.1);
		}
	}

}
