package br.ufc.dc.tpi.banco.contas;

<<<<<<< HEAD
=======
//é filha de ContaCorrente. Essa conta tem o método renderJuros(double taxa), que aumenta o saldo da conta de acordo com a taxa de juros
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
public class ContaPoupança extends ContaCorrente {
	
	public ContaPoupança(String numero) {
		super(numero);
	}
	
	public void renderJuros(double taxa) {
		creditar(saldo() * taxa);
	}
}
