package br.ufc.dc.tpi.banco.contas;

//é filha de ContaCorrente. Essa conta tem o método renderJuros(double taxa), que aumenta o saldo da conta de acordo com a taxa de juros
public class ContaPoupança extends ContaCorrente {
	
	public ContaPoupança(String numero) {
		super(numero);
	}
	
	public void renderJuros(double taxa) {
		creditar(saldo() * taxa);
	}
}
