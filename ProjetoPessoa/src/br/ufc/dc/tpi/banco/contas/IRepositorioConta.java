package br.ufc.dc.tpi.banco.contas;

//repositório de contas. Aqui tiramos de banco a responsabilidade de armazenar contas. Agora qualquer estrutura que armazene alguma conta deverá herdar dessa interface
public interface IRepositorioConta {
	
	public ContaAbstrata[] listar();
	public ContaAbstrata procurar(String numero);
	public void inserir(ContaAbstrata conta);
	public void remover(String numero);
	public int tamanho();
	
}
