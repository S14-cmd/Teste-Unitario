package br.com.testeunitario.teste;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import br.com.testeunitario.model.Retangulo;

@RunWith(Parameterized.class)
public class RetanguloTestException {
	
	private int base;
	private int altura;
	private int area;
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][]{
			{10,26,260},
			{50,30,1500}
		});
	}
	
	public RetanguloTestException(int base, int altura, int area) {
		this.base = base;
		this.altura = altura;
		this.area = area;
	}

	@Test
	public void areaTestParam() {
		Retangulo ret = new Retangulo(base,altura);

		int resultado = ret.calculaArea();
		
		assertEquals(area, resultado);
		
	}
	
	@Ignore
	public void areaTest() {
		Retangulo ret;
		
		ret = new Retangulo(7,7);
		
		int resultado = ret.calculaArea();
		
		assertEquals(49, resultado);
		
	}	

}
