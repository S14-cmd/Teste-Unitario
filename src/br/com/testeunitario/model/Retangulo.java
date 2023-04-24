package br.com.testeunitario.model;

public class Retangulo {

	private int base;
	private int altura;

	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}


	public int calculaArea() {
		if(base == 0 || altura == 0) {
			throw new ArithmeticException();
		}
		return base*altura;

	}

	public int calculaPerimetro() {
		return (base*base) + (altura*altura);

	}
}