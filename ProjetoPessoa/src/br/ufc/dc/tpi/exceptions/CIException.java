package br.ufc.dc.tpi.exceptions;

public class CIException extends Exception {

	private String numero;
	
	public CIException(String numero) {
		super("Conta inexistente!");
		this.numero = numero;
	}
	
	public String getNumeroContaInexistente() {
		return numero;
	}
	
}
