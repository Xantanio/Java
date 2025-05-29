package br.ufc.dc.tpi.banco.contas;

<<<<<<< HEAD
//classe abstrata de onde as classes Conta... herdam suas funcionalidades. Seus filhos são as classes ContaCorrente e ContaPoupança
=======
//classe abstrata de onde as classes Conta... herdam suas funcionalidades. Seus filhos são as classes ContaCorrente e ContaImposto
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
public abstract class ContaAbstrata {

	   protected String numero;
	   protected double saldo;

	   public ContaAbstrata(String numero) {
	      this.numero = numero;
	      saldo = 0.0;
	   }

	   public boolean verificar(ContaCorrente conta) {
	      if (numero().equals(conta.numero())) {
	         System.out.println("O numero das contas é igual! Tente inserir outro número.");
	         return true;
	      } else {
	         return false;
	      }
	   }

	   public void creditar(double valor) {
	      saldo += valor;
	   }

	   public abstract void debitar(double valor);

	   public String numero() {
	      return numero;
	   }

	   public double saldo() {
	      return saldo;
	   }	

}
