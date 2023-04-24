package br.com.testeunitario.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.testeunitario.model.Calculadora;

class CalculadoraTeste {

	@Test
	public void testSomar() {

		Calculadora cal = new Calculadora();
		
		int resultadoEsperado = 10;
		
		int resultado = cal.somar(6, 4);
		
		assertTrue(resultado == resultadoEsperado);
	}
	
	@Test
	public void testSomarAssetEquals() {
		
		Calculadora cal = new Calculadora();
		
		int resultado = cal.somar(20, 9);
		
		assertEquals(29, resultado);
	}

}
