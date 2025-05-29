package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.ContaAbstrata;
import br.ufc.dc.tpi.banco.contas.ContaCorrente;
import br.ufc.dc.tpi.banco.contas.ContaEspecial;
import br.ufc.dc.tpi.banco.contas.ContaImposto;
import br.ufc.dc.tpi.banco.contas.ContaPoupança;
import br.ufc.dc.tpi.banco.contas.VectorConta;
<<<<<<< HEAD
import br.ufc.dc.tpi.exceptions.CIException;
import br.ufc.dc.tpi.exceptions.SIException;
=======
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b

import java.util.Scanner;

//classe main. Toda execução está aqui
public class Main {

<<<<<<< HEAD
	public static void main(String[] args) throws CIException, SIException {
		
		//seleção de conta dinâmica
		Scanner scanner = new Scanner(System.in);
		ContaAbstrata conta = null;
		
		boolean parar = false;
		while(parar == false) {
			System.out.println("Escolha: [1]Padrão, [2]Poupança, [3]Especial");
			int tipo = scanner.nextInt();
			if(tipo == 1) {
				conta = new ContaImposto("000001");
				parar = true;
			} else if(tipo == 2) {
				conta = new ContaPoupança("000001");
				parar = true;
			} else if(tipo == 3) {
				conta = new ContaEspecial("000001");
				parar = true;
			} else {
				continue;
			}	
=======
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
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
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
<<<<<<< HEAD
		ContaAbstrata conta1 = new ContaEspecial("Janio");
=======
		/*Conta conta1 = new ContaEspecial("Janio");
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
		VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta1);
		banco.creditar("Janio", 1000);
		System.out.println("Bonus: " + ((ContaEspecial)conta1).bonus());
		banco.printInfo();
		banco.renderBonus("Janio");
		System.out.println("Bonus: " + ((ContaEspecial)conta1).bonus());
<<<<<<< HEAD
		banco.printInfo();
=======
		banco.printInfo();*/
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
		
		//testagem da subclasse ContaImposto
		/*VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta);
		banco.creditar("000001", 1000);
		banco.printInfo();
		banco.debitar("000001", 900);
		banco.printInfo();*/
		
		//testagem da classe AuditorBanco
<<<<<<< HEAD
		/*VectorConta vectorConta = new VectorConta();
=======
		VectorConta vectorConta = new VectorConta();
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta);
		banco.creditar("000001", 1000);
		banco.printInfo();
		AuditorBanco auditor = new AuditorBanco();
<<<<<<< HEAD
		auditor.auditar(banco);*/
		
		//testagem do tratamento usando exceções
		/*VectorConta vectorConta = new VectorConta();
		Banco banco = new Banco(vectorConta);
		banco.cadastrar(conta);
		try {
			banco.debitar(conta.numero(), 1000);	
		} catch(CIException e) {
			System.out.println(e.getMessage());
		} catch(SIException e) {
			System.out.println(e.getMessage());
		}*/
		
=======
		auditor.auditar(banco);
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
	}

}
