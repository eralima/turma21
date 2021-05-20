package classes;

public class ConsumidorFisico extends Consumidor{
	private String nomeConsumidor;
	private String cpf;
	
	public ConsumidorFisico(String telefone, String endereco, String email, String nomeConsumidor, String cpf) {
		super(telefone, endereco, email);
		this.nomeConsumidor = nomeConsumidor;
		this.cpf = cpf;
	}

	public String getNomeConsumidor() {
		return nomeConsumidor;
	}

	
	public void setNomeConsumidor(String nomeConsumidor) {
		this.nomeConsumidor = nomeConsumidor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
