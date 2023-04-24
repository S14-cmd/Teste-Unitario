package br.com.testeunitario.control;

import br.com.testeunitario.teste.RetanguloTeste;

public class RetanguloMain {

	public static void main(String[] args) {
		RetanguloTeste teste = new RetanguloTeste();
		
		boolean resultadoArea;
		boolean resultadoPerimetro;
		
		resultadoArea = teste.testeCalcularArea();
		System.out.println("Area do Retangulo:" + "" +  resultadoArea);

		resultadoPerimetro = teste.testeCalcularPerimetro();
		System.out.println("Perimetro do Retangulo:" + "" +  resultadoPerimetro);
	}

}