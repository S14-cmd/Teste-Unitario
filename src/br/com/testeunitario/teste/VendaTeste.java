package br.com.testeunitario.teste;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;

import br.com.testeunitario.model.Cliente;
import br.com.testeunitario.model.ICredito;
import br.com.testeunitario.model.Venda;

public class VendaTeste {

	@Test
	public void testCheckout() {		
		Cliente cliente = new Cliente("123456789", "Samuel");
		ICredito creditoService = mock(ICredito.class);
		when(creditoService.getLimite(cliente.getCpf())).thenReturn(2500d);
		Venda venda = new Venda(cliente, 100, creditoService);
	
		boolean resultado = venda.checkout();
		
		assertTrue(resultado);	
	}
}