package br.com.testeunitario.model;

import java.util.ArrayList;

public class Pilha {

	int limite = 5;
	
	ArrayList<Livro> pilha = new ArrayList<>();
	
	public void push(Livro livro) {
		if(pilha.size() >= limite) {
			throw new ArrayStoreException();
		}
		
		if(!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O")) {
			System.out.println("Permitido somente livros que se iniciem com as letras: A e O!!!" 
					+ "\n  - Nao foi possivel adicionar: " + livro.getTitulo());
		}
		
		pilha.add(livro);
	}
	
	
	public Livro pop() {
		Livro livro = pilha.get(pilha.size()-1);
		
		pilha.remove(pilha.size()-1);
		
		return livro;
	}
	
	
	public int count() {
		return pilha.size();
	}
	
}
