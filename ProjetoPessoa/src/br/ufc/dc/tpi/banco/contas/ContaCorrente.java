package br.ufc.dc.tpi.banco.contas;

//a ContaPoupança herda de ContaAbstrata e implementa o debitar de contas-corrente. Seus filhos são ContaEspecial e ContaPoupança
public class ContaCorrente extends ContaAbstrata{

   public ContaCorrente(String numero) {
      super(numero);
   }

   public void debitar(double valor) {
      saldo -= valor;
   }

}
