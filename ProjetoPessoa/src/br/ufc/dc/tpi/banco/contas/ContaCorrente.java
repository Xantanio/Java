package br.ufc.dc.tpi.banco.contas;

<<<<<<< HEAD
//a ContaPoupança herda de ContaAbstrata e implementa o debitar de contas-corrente. Seus filhos são ContaEspecial e ContaImposto
=======
//a ContaPoupança herda de ContaAbstrata e implementa o debitar de contas-corrente. Seus filhos são ContaEspecial e ContaPoupança
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
public class ContaCorrente extends ContaAbstrata{

   public ContaCorrente(String numero) {
      super(numero);
   }

   public void debitar(double valor) {
      saldo -= valor;
   }

}
