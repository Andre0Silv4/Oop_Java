package br.org.catolicasc;

import br.org.catolicasc.cliente.Cliente;
import br.org.catolicasc.conta.Conta;

public class Programa{

	public static void main(String[] args){
		
		Conta c1 = new Conta(12345, new Cliente("Andre"));
		c1.deposita(550);
		
		System.out.println("Cliente: " + c1.getTitular().getNome());
		System.out.println("Saldo: " + c1.getSaldo());
		boolean sacou = c1.saca(100);
		if(sacou) {
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Erro ao realizar saque!");
		}
		System.out.println("Saldo: " + c1.getSaldo());
	

		Conta c2 = new Conta(222, new Cliente("Junior"));
		c2.deposita(3000);
		c2.transfere(c1, 50);
		
		System.out.println("Saldo do André: " + c1.getSaldo());
		System.out.println("Saldo do Junior: " + c2.getSaldo());
		
		System.out.println("Total de contas: : " + Conta.totalContas ());
	}

}
