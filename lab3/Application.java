package lab3;

public class Application {
	public void run() {
		Banco bank = new Banco("FEG", 123, "https://www.feg.unesp.br");
		
		bank.abrirConta("Fulano de Tal", "1234-X");
		bank.abrirConta("Ciclano de Tal", "7894-X");
		
		System.out.println("Saldo da conta 1234-X: " + bank.consultarSaldo("1234-X"));
		System.out.println("Saldo da conta 7894-X: " + bank.consultarSaldo("7894-X"));
		
		bank.depositar(1200.5, "1234-X");
		bank.depositar(4532.11, "7894-X");
		
		System.out.println("Saldo da conta 1234-X: " + bank.consultarSaldo("1234-X"));
		System.out.println("Saldo da conta 7894-X: " + bank.consultarSaldo("7894-X"));
		
		System.out.println("Valor total dos ativos financeiros do banco: R$ " + bank.consultarTotalAtivos());
	}
}
