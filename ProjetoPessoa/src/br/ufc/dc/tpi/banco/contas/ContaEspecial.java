package br.ufc.dc.tpi.banco.contas;

//toda vez que algum valor é creditado na ContaEspecial, ela recebe um bônus
public class ContaEspecial extends ContaCorrente {
	
	private double bonus;
	
	public ContaEspecial(String numero) {
		super(numero);
		bonus = 0;
	}
	
	public void renderBonus() {
		super.creditar(bonus);
		bonus = 0;
	}
	
	public void creditar(double valor) {
		bonus += valor * 0.01;
		super.creditar(valor);
	}
	
	public double bonus() {
		return bonus;
	}
	
}
