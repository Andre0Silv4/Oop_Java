package br.org.catolicasc.funcionarios;

public class RelatorioDeBonificacoes {
	
	private double totalDeBonificacoes;
	
	public void registra(Funcionario f) {
		this.totalDeBonificacoes += f.getBonificacao();
	}
	
	public void imprimeRelatorio() {
		System.out.println("Total de bonificacoes: " + this.totalDeBonificacoes);
	}

}
