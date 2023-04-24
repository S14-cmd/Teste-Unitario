package br.com.testeunitario.model;

public class Venda {

	private Cliente cliente;
	private double valor;
	private ICredito creditoService;
	
	public Venda(Cliente cliente, double valor, ICredito creditoService) {
		this.cliente = cliente;
		this.valor = valor;
		this.creditoService = creditoService;
	}
	
	public boolean checkout() {
		double limite;
		limite = creditoService.getLimite(cliente.getCpf());
		
		if(limite > valor) {
			return false;		
		}
		
		return true;		
	}
	
}