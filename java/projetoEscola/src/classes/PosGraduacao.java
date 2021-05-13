package classes;

public class PosGraduacao extends Estudante{
	private double credito;
	
	//construtor
	public PosGraduacao(int matricula, String cpf) {
		super(matricula, cpf);
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

}
