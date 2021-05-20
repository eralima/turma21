package classes;

import java.util.ArrayList;
import java.util.List;

public class Produtor {
	private String nome;
	private String cpf;
	private String telefone;
	private String endereço;
	private char tipoProduto;
	
	public Produtor(String nome, String cpf, String telefone, String endereço, List<Produto> produtos, char tipoProduto) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereço = endereço;
		this.produtos = produtos;
	}

	private List<Produto> produtos = new ArrayList <>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public List<Produto> getVerduras() {
		return produtos;
	}

	public void setVerduras(List<Produto> verduras) {
		this.produtos = verduras;
	}

	public char getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(char tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	public void cadastreProdutos(String nomeProduto, double precoKg, double kgDoado) {
		produtos.add(new Produto(nomeProduto, kgDoado, kgDoado));
	}
	
}
