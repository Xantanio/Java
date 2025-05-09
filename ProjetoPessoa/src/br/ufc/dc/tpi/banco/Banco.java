package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.ContaAbstrata;
import br.ufc.dc.tpi.banco.contas.ContaCorrente;
import br.ufc.dc.tpi.banco.contas.ContaPoupança;
import br.ufc.dc.tpi.banco.contas.ContaEspecial;
import br.ufc.dc.tpi.banco.contas.IRepositorioConta;

//essa classe cria o banco. Ele implementa a interface de banco IBanco. Além disso qualquer tipo de conta que implemente do repositorio IRepositorioConta pode ser passada como parâmetro do construtor
public class Banco implements IBanco{
	
	private IRepositorioConta contas;
	private ContaAbstrata[] listaContas;
	
	public Banco(IRepositorioConta contas) {
		this.contas = contas;
	}
	
	public double saldoTotal() {
		listaContas = contas.listar();
		double saldoTotal = 0;
		for(int i = 0; i < contas.tamanho(); i++) {
			saldoTotal += listaContas[i].saldo();
		}
		return saldoTotal;
	}
	
	public int numeroContas() {
		return contas.tamanho();
	}
	
	public void printInfo() {
		listaContas = contas.listar();
		for(int i = 0; i < contas.tamanho(); i++) {
			System.out.println(listaContas[i].numero() + " " + listaContas[i].saldo());
			System.out.println("------------------------");
		}
	}
	
	public void cadastrar(ContaAbstrata conta) {
		contas.inserir(conta);
	}
	
	public ContaAbstrata procurar(String numero) {
		return contas.procurar(numero);
	}
	
	public void creditar(String numero, double valor) {
		ContaAbstrata conta = procurar(numero);
		if(conta != null) {
			conta.creditar(valor);
		} else {
			System.out.println("A conta não foi encontrada no sistema!");
		}
	}
	
	public void debitar(String numero, double valor) {
		ContaAbstrata conta = procurar(numero);
		if(conta != null) {
			conta.debitar(valor);
		} else {
			System.out.println("A conta não foi encontrada no sistema!");
		}
	}
	
	public double saldo(String numero) {
		double saldo;
		ContaAbstrata conta = procurar(numero);
		if(conta != null) {
			saldo = conta.saldo();
		} else {
			System.out.println("A conta não foi encontrada no sistema!");
			saldo = -1;
		}
		return saldo;
	}
	
	public void transferir(String numero, String destino, double valor) {
		ContaAbstrata conta_remetente = procurar(numero);
		ContaAbstrata conta_destinatario = procurar(destino);
		if((conta_remetente != null) && (conta_destinatario != null)) {
			conta_remetente.debitar(valor);
			conta_destinatario.creditar(valor);
		} else {
			System.out.println("A conta não foi encontrada no sistema!");
		}
	}
	
	public void renderJuros(String numero) {
		double taxa = 0.01;
		ContaAbstrata conta = procurar(numero);
		if(conta != null && conta instanceof ContaPoupança) {
			((ContaPoupança) conta).renderJuros(taxa);
		} else {
			System.out.println("A conta poupança não foi encontrada no sistema!");
		}
	}
	
	public void renderBonus(String numero) {
		ContaAbstrata conta = procurar(numero);
		if(conta != null && conta instanceof ContaEspecial) {
			((ContaEspecial) conta).renderBonus();
		} else {
			System.out.println("A conta especial não foi encontrada no sistema!");
		}
	}
	
}
