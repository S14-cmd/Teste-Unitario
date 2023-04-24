package br.com.testeunitario.control;

import br.com.testeunitario.teste.PilhaTeste;

public class PilhaMain {

	public static void main(String[] args) {

		PilhaTeste teste = new PilhaTeste();
		
		boolean limite = teste.testLimite();
		System.out.println("\n Respeito ao limite: " + limite + "\n");
	
		
		boolean pop = teste.testPop();
		System.out.println("\n Retira o ultimo livro: " + pop + "\n");
		
		boolean nome = teste.testNome();
		System.out.println("\n Respeita padrao de nome: " + nome);
	
	}

}
