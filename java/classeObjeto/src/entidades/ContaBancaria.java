package entidades;

public class ContaBancaria {

	/*Crie uma classe conta bancaria e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto conta bancaria, defina
	as instancias deste objeto e apresente as informações deste objeto no
	console.*/
	
	//atributos
	private String titular;
	private String cpf;
	private String numeroConta;
	private double saldo = 1000.00;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		saldo = this.saldo + valor;	
	}
	
	public void sacar(double valor) {
		if(valor < saldo) {
			saldo = this.saldo - valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void verificarSaldo() {
		System.out.printf("Saldo: %f",saldo);
	}
}
