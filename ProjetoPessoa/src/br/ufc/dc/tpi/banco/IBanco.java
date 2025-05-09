package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.ContaAbstrata;

//modelo de interface de qualquer banco o sistema
public interface IBanco {
	
	public double saldoTotal();
	public int numeroContas();
	public void printInfo();
	public void cadastrar(ContaAbstrata conta);
	public void creditar(String numero, double valor);
	public void debitar(String numero, double valor);
	public double saldo(String numero);
	public void transferir(String numero, String destino, double valor);
	public void renderJuros(String numero);
	public void renderBonus(String numero);
	
}
