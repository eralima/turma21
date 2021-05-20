package classes;

public class Produtos {
	private String nomeProduto;
	private double precoKg;
	private int quantidadeProduto;
	
	public Produtos(String nomeProduto, double precoKg, int quantidadeProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoKg = precoKg;
		this.quantidadeProduto = quantidadeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoKg() {
		return precoKg;
	}

	public void setPrecoKg(double precoKg) {
		this.precoKg = precoKg;
	}

	@Override
	public String toString() {
		return this.nomeProduto + "\t\t R$ " + this.precoKg + "\t\t   " + this.quantidadeProduto + " unidades";	
	}

	
	
}
