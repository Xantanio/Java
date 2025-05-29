package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.ContaAbstrata;
<<<<<<< HEAD
import br.ufc.dc.tpi.exceptions.CIException;
import br.ufc.dc.tpi.exceptions.SIException;
=======
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b

//modelo de interface de qualquer banco o sistema
public interface IBanco {
	
	public double saldoTotal();
	public int numeroContas();
	public void printInfo();
	public void cadastrar(ContaAbstrata conta);
<<<<<<< HEAD
	public void creditar(String numero, double valor) throws CIException;
	public void debitar(String numero, double valor) throws CIException, SIException;
=======
	public void creditar(String numero, double valor);
	public void debitar(String numero, double valor);
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
	public double saldo(String numero);
	public void transferir(String numero, String destino, double valor);
	public void renderJuros(String numero);
	public void renderBonus(String numero);
	
}
