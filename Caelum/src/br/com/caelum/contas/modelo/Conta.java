package br.com.caelum.contas.modelo;

public class Conta {
	
	protected String titular;
	protected double saldo;
	protected double limite;
	protected String agencia;
	protected int numero;
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	
	public void deposita (double valor){
		this.saldo += valor;
	}
	
	public void saca (double valor){
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino){
		this.saca(valor);
		destino.deposita(valor);
	}
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Conta";
	}
	
	
	

}
