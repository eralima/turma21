package classes;

//com o final, essa classe não vai ter mais "nenhum filho"
public final class Terceiro extends Funcionario{
	private double adicional = 10.00;

	//construtor
	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora) {
		super(matricula, nome, horasTrabalhadas, valorHora);
	}
	
	@Override
	public void mostrarSalario() {
		System.out.printf("\nO salário é %.2f \n", ((super.getHorasTrabalhadas() * super.getValorHora()) + adicional));
	}
}
