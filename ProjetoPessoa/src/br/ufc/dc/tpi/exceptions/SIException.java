package br.ufc.dc.tpi.exceptions;

public class SIException extends Exception {

	private String numero;
	private double saldo;
	
	public SIException(String numero, double saldo) {
		super("Saldo insuficiente!");
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getContaSaldoInsuficiente() {
		return numero;
	}
	
	public double getSaldoSaldoInsuficiente() {
		return saldo;
	}
	
}
