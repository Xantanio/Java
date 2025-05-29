package br.ufc.dc.tpi.banco.contas;

<<<<<<< HEAD
=======
//implementa seu próprio método debitar(double valor). Herda de ContaAbstrata
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
public class ContaImposto extends ContaAbstrata {
	
	public ContaImposto(String numero) {
		super(numero);
	}
	
	public void debitar(double valor) {
		saldo = saldo - (valor + (valor * 0.001));
	}
	
}
