package br.org.catolicasc.funcionarios;

public class ProgramaFuncionarios {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setCpf("555.555.555-55");
		g1.setNome("Manoel");
		g1.setSalario(15000);
		g1.setSenha(12345);
	
		Funcionario f1 = new Funcionario();
		f1.setSalario(10000);
		
		RelatorioDeBonificacoes rb = new RelatorioDeBonificacoes();
		rb.registra(f1);
		rb.registra(g1);
		rb.imprimeRelatorio();
		
	}
}
