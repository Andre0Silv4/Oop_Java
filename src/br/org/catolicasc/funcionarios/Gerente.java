package br.org.catolicasc.funcionarios;

public class Gerente extends Funcionario{
	
	private int senha;
	private int numeroDeFuncionarios;
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Usuario autenticado");
			return true;
		}else {
			System.out.println("senha invalida");
			return false;
		}
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
}
