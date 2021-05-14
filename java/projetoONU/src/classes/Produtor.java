package classes;

import java.util.ArrayList;
import java.util.List;

public class Produtor {
	private String nome;
	private String cpf;
	private String telefone;
	private String endere�o;
	private char tipoProduto;
	
	public Produtor(String nome, String cpf, String telefone, String endere�o, List<Produto> produtos, char tipoProduto) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
