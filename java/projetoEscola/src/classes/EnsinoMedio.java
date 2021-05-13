package classes;

public class EnsinoMedio extends Estudante{
	//atributos
	private int contadorBoletim = 0;
	
	//construtor
	public EnsinoMedio(int matricula, String cpf) {
		super(matricula, cpf);
	}

	//encapsulamento (getters and setters)
	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	//métodos
	public void pedirBoletim(char imprimirBoletim) {
		if(imprimirBoletim == 'S') {
			contadorBoletim = contadorBoletim + 1;
			setContadorBoletim(2);			
		}
	}

}
