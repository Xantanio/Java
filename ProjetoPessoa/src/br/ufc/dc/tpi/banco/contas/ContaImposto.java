package br.ufc.dc.tpi.banco.contas;

//implementa seu próprio método debitar(double valor). Herda de ContaAbstrata
public class ContaImposto extends ContaAbstrata {
	
	public ContaImposto(String numero) {
		super(numero);
	}
	
	public void debitar(double valor) {
		saldo = saldo - (valor + (valor * 0.001));
	}
	
}
