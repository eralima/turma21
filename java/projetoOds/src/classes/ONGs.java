package classes;

public class ONGs extends Consumidor{
	private String nomeInstituicao;
	private String cnpj;
	private double descontoOng;
	

	
	public ONGs(String telefone, String endereco, String email, String nomeInstituicao, String cnpj) {
		super(telefone, endereco, email);
		this.nomeInstituicao = nomeInstituicao;
		this.cnpj = cnpj;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getDescontoOng() {
		return descontoOng;
	}

	public void setDescontoOng(double descontoOng) {
		this.descontoOng = descontoOng;
	}
	
}
