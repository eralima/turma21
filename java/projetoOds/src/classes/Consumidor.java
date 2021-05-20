package classes;

public class Consumidor {
	private String telefone;
	private String endereco;
	private String email;
	
	public Consumidor(String telefone, String endereco, String email) {
		super();
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
