package br.org.catolicasc.funcionarios;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
