package classes;

public class Produto {
	private String nomeProduto;
    private double precoKg;
    private double kgDoado;
    
	public Produto(String nomeProduto, double precoKg, double kgDoado) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoKg = precoKg;
		this.kgDoado = kgDoado;
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
	
	public double getKgDoado() {
		return kgDoado;
	}
	public void setKgDoado(double kgDoado) {
		this.kgDoado = kgDoado;
	}
    
    
}
