package br.com.testeunitario.teste;

import br.com.testeunitario.model.Retangulo;

public class RetanguloTeste {

	Retangulo retangulo;
	
	public boolean testeCalcularArea() {
		retangulo = new Retangulo(200, 15);
		
		int resultEsperado = 300;
		
		int resultadoArea = retangulo.calculaArea();
		
		if(resultadoArea == resultEsperado) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean testeCalcularPerimetro() {
		retangulo = new Retangulo(7, 3);
		
		int resultEsperado = 34;
		
		int resultado = retangulo.calculaPerimetro();
		
		if(resultado == resultEsperado) {
			return true;
		}else {
			return false;
		}
	}


}
