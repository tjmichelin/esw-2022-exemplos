package lab3;

public class ContaBancaria {

	private String titular;

	private String conta;

	private double saldo;

	public ContaBancaria(String nomeTitular, String numeroConta) {
		this.titular = nomeTitular;
		this.conta = numeroConta;
	}

	public void depositar(double quantia) {
		if (quantia <= 0.0) {
			System.out.println("A quantia deve ser maior que 0");
			System.out.println("Operação não realizada.");
		} else {
			this.saldo += quantia;	
		}
	}

	public void sacar(double quantia) {
		if (quantia > this.saldo) {
			System.out.println("Saldo insuficiente.");
			System.out.println("Operação não realizada.");
		} else {
			this.saldo -= quantia;	
		}
	}

	public double consultarSaldo() {
		return this.saldo;
	}
	
	public String consultarNumero() {
		return this.conta;
	}
	
	public String consultarTitular() {
		return this.titular;
	}

	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer("Titular: ");
		buff.append(this.titular);
		buff.append("\n");
		buff.append("Número da conta: ");
		buff.append(this.conta);
		buff.append("\n");
		buff.append("Saldo: R$ ");
		buff.append(this.saldo);
		buff.append("\n");
		
		return buff.toString();
	}
}
