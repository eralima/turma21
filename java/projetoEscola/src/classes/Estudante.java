package classes;

import java.util.Scanner;

public abstract class Estudante {
	//atributos
	private int matricula;
	private String cpf;
	private double pontos = 0.0;
	private boolean status;
	
	//construtores
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}

	//encapsulamento (getters and setters)
	public int getMatricula() {
		return matricula;
	}

	/*public void setMatricula(int matricula) {
		this.matricula = matricula;
	}*/

	public String getCpf() {
		return cpf;
	}

	/*public void setCpf(String cpf) {
		this.cpf = cpf;
	}*/

	public double getPontos() {
		return pontos;
	}

	/*public void setPontos(double pontos) {
		this.pontos = pontos;
	}*/

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//métodos
	//this.pontos indicam que são os pontos do atributo da classe Estudante
	public void adicionarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	
	public void tirarNota(double pontos) {
		Scanner leia = new Scanner(System.in);
		double pontoIncluido;
		if(pontos > this.pontos) {
			double excesso = (pontos - this.pontos);
			this.pontos = 0;
			
			do {
				System.out.printf("\nTotal atual: %.2f ", this.pontos);
				System.out.printf("\n    INCLUIA uma NOTA MAIOR OU IGUAL A %.1f\n", excesso);
				System.out.print("Informe o valor do movimento: ");
				pontoIncluido = leia.nextDouble();
			} while (pontoIncluido < excesso);
			
			adicionarNota((pontoIncluido - excesso));
		}
		else {
			this.pontos = this.pontos - pontos;
		}
	}

}
