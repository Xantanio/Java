package br.ufc.dc.tpi.banco.contas;

<<<<<<< HEAD
=======
//repositório de contas. Aqui tiramos de banco a responsabilidade de armazenar contas. Agora qualquer estrutura que armazene alguma conta deverá herdar dessa interface
>>>>>>> 516f81b1a13cb43b70705e72c740f9aa703e2d8b
public interface IRepositorioConta {
	
	public ContaAbstrata[] listar();
	public ContaAbstrata procurar(String numero);
	public void inserir(ContaAbstrata conta);
	public void remover(String numero);
	public int tamanho();
	
}
