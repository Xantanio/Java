package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.ContaAbstrata;
import br.ufc.dc.tpi.banco.contas.ContaCorrente;
import br.ufc.dc.tpi.banco.contas.ContaEspecial;
import br.ufc.dc.tpi.banco.contas.ContaImposto;
import br.ufc.dc.tpi.banco.contas.ContaPoupança;
import br.ufc.dc.tpi.banco.contas.VectorConta;

import java.util.Scanner;

//classe main. Toda execução está aqui
public class Main {

	public static void main(String[] args) {
		
		//seleção de conta dinâmica
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha: [1]Padrão, [2]Poupança, [3]Especial");
		int opcao = scanner.nextInt();
		ContaAbstrata conta = null;
		if(opcao == 1) {
			conta = new ContaImposto("000001");
		} else if(opcao == 2) {
			conta = new ContaPoupança("000001");
		} else {
			conta = new ContaEspecial("000001");
		}
		
		//testagem das classes Banco e Conta
		/*Conta conta1 = new Conta("Janio");
		Conta conta2 = new Conta("Clara");
		VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		banco.printInfo();
		banco.procurar(conta1.numero());
		banco.creditar(conta1.numero(), 100000);
		banco.printInfo();
		banco.debitar(conta1.numero(), 10000);
		banco.printInfo();
		banco.transferir(conta1.numero(), conta2.numero(), 45000.0);
		banco.printInfo();*/
		
		//testagem da subclasse ContaPoupança
		/*ContaPoupança conta1 = new ContaPoupança("Janio");
		VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta1);
		banco.creditar("Janio", 1000);
		banco.printInfo();
		banco.renderJuros("Janio");
		banco.printInfo();*/
		
		//testagem da subclasse ContaPoupança
		/*VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta);
		banco.creditar("000001", 1000);
		banco.printInfo();
		if(conta instanceof ContaPoupança) {
			banco.renderJuros("000001");
		}
		banco.printInfo();*/
		
		//testagem da subclasse ContaEspecial
		/*Conta conta1 = new ContaEspecial("Janio");
		VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta1);
		banco.creditar("Janio", 1000);
		System.out.println("Bonus: " + ((ContaEspecial)conta1).bonus());
		banco.printInfo();
		banco.renderBonus("Janio");
		System.out.println("Bonus: " + ((ContaEspecial)conta1).bonus());
		banco.printInfo();*/
		
		//testagem da subclasse ContaImposto
		/*VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta);
		banco.creditar("000001", 1000);
		banco.printInfo();
		banco.debitar("000001", 900);
		banco.printInfo();*/
		
		//testagem da classe AuditorBanco
		VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta);
		banco.creditar("000001", 1000);
		banco.printInfo();
		AuditorBanco auditor = new AuditorBanco();
		auditor.auditar(banco);
	}

}
