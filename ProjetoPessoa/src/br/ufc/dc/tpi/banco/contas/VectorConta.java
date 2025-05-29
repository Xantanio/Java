package br.ufc.dc.tpi.banco.contas;

import java.util.Vector;

<<<<<<< HEAD
=======
//vetor de contas
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
public class VectorConta implements IRepositorioConta{

	private Vector<ContaAbstrata> contas = new Vector<ContaAbstrata>();
	
	public ContaAbstrata[] listar() {
		return contas.toArray(new ContaAbstrata[0]);
	}
	
	public ContaAbstrata procurar(String numero) {
		int i = 0;
		boolean achou = false;
		while((!achou) && (i < contas.size())) {
			if(contas.get(i).numero == numero) {
				achou = true;
				break;
			} else {
				i++;
			}
		}
		
		if(achou == true) {
			return contas.get(i);
		} else {
			return null;
		}
	}

	public void inserir(ContaAbstrata conta) {
		contas.add(conta);
	}

	public void remover(String numero) {
		ContaAbstrata contaParaRemover = procurar(numero);
		if(contaParaRemover != null) {
			contas.remove(contaParaRemover);
		}
	}

	public int tamanho() {
		return contas.size();
	}

}
