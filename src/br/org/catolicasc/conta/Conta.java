package br.org.catolicasc.conta;

import br.org.catolicasc.cliente.Cliente;

 public class Conta{
	private static int totalContas;
	private int numero;
	private Cliente titular;
	private double saldo;
	
 public Conta(Cliente titular){
		totalContas++;
		System.out.println("Total de contas: " + totalContas);
		this.titular = titular;
	}
	
 public	Conta(int numero, Cliente titular){
		this(titular);
		this.numero = numero;
	}
	
 public	boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}else {
		this.saldo = this.saldo - valor;
		return true;
		}
	}
	
 public	void transfere(Conta destino, double valor) {
		if(this.saca(valor)) {
			destino.deposita(valor);
		}
	}
	
 public	void deposita(double valor){
		this.saldo +=valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente cliente) {
		this.titular= cliente;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int totalContas() {
		return totalContas;
	}
}
