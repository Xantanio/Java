package br.ufc.dc.tpi.banco;


//essa classe verifica o rendimento medio do banco por cliente. Recebe como parâmetro um banco genérico
public class AuditorBanco {
	
	public void auditar(IBanco banco) {
		if((banco.saldoTotal() / banco.numeroContas()) > 500) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Não aprovado!");
		}
	}
	
}