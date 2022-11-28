package lab3;

import java.util.ArrayList;
import java.util.Collection;

public class Banco {

	private String nome;

	private int numero;

	private String logotipo;

	private Collection<ContaBancaria> contasBancarias;

	public Banco(String nomeBanco, int numeroBanco, String logoUrl) {
		this.nome = nomeBanco;
		this.numero = numeroBanco;
		this.logotipo = logoUrl;
		
		this.contasBancarias = new ArrayList<ContaBancaria>();
	}

	public void abrirConta(String nomeTitular, String numeroConta) {
		ContaBancaria conta = new ContaBancaria(nomeTitular, numeroConta);
		this.contasBancarias.add(conta);
	}

	public void depositar(double quantia, String numeroConta) {
		ContaBancaria busca = null;
		
		for (ContaBancaria conta : this.contasBancarias) {
			if (conta.consultarNumero().equals(numeroConta)) {
				busca = conta;
			}
		}
		
		if (busca == null) {
			System.out.println("Conta bancária não encontrada.");
		} else {
			busca.depositar(quantia);
		}
	}

	public void sacar(double quantia, String numeroConta) {
		ContaBancaria busca = null;
		
		for (ContaBancaria conta : this.contasBancarias) {
			if (conta.consultarNumero().equals(numeroConta)) {
				busca = conta;
			}
		}
		
		if (busca == null) {
			System.out.println("Conta bancária não encontrada.");
		} else {
			busca.sacar(quantia);
		}
	}

	public double consultarSaldo(String numeroConta) {
		ContaBancaria busca = null;
		
		for (ContaBancaria conta : this.contasBancarias) {
			if (conta.consultarNumero().equals(numeroConta)) {
				busca = conta;
			}
		}
		
		if (busca == null) {
			System.out.println("Conta bancária não encontrada.");
			return 0.0;
		} else {
			return busca.consultarSaldo();
		}
	}

	public double consultarTotalAtivos() {
		double soma = 0.0;
		
		for (ContaBancaria conta : this.contasBancarias) {
			soma += conta.consultarSaldo();
		}
		
		return soma;
	}

	public String consultarNomeBanco() {
		return this.nome;
	}
	
	public int consultarNumeroBanco() {
		return this.numero;
	}
	
	public String getLogoUrl() {
		return this.logotipo;
	}
}
