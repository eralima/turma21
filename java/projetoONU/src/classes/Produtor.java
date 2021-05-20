package classes;

import java.util.ArrayList;

public class Produtor {
	private String nome;
	private String cpf;
	private char genero;
	private String telefone;
	private char tipoProduto;
	private ArrayList<Produtos> listaProdutos = new ArrayList <>();
	
	public Produtor(String nome, String cpf, char genero, String telefone, char tipoProduto) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.telefone = telefone;
		this.tipoProduto = tipoProduto;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipoProduto() {
		if(this.tipoProduto == '1') {
			return "Verdura";
		}
		if(this.tipoProduto == '2') {
			return "Frutas";
		}
		else {
			return "Carnes e lacticinios";
		}
	}

	public void setTipoProduto(char tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	
	public ArrayList<Produtos> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produtos> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public char getSexo() {
		return genero;
	}

	public void setSexo(char genero) {
		this.genero = genero;
	}

	public void cadastrarProdutos(String nomeProduto, double precoKg, int quantidadeProduto) {
		listaProdutos.add(new Produtos(nomeProduto, precoKg, quantidadeProduto));
	}

	@Override
	public String toString() {
		return this.nome + "      \t\t\t  " + getTipoProduto() ;	
	}
	
}
