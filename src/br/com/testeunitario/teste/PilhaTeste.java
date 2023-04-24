package br.com.testeunitario.teste;

import br.com.testeunitario.model.Livro;
import br.com.testeunitario.model.Pilha;

public class PilhaTeste {

	
	//Verifica se retira o último livro da pilha
	public boolean testPop() {
		Pilha pilha = new Pilha();
		Livro livro = new Livro("O Pequeno Principe");
		pilha.push(livro);
	
		livro = new Livro("A Pequena Sereia");
		pilha.push(livro);
		
		livro = new Livro("O Magico de Oz");
		pilha.push(livro);
		
		String resultadoEsperado = "O Pequeno Principe";
		
		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}
	
	//Verifica se ele adiciona além da quantidade limite
	public boolean testLimite(){
		Pilha pilhaLimite = new Pilha();
		
		Livro livro = new Livro("O Pequeno Principe");
		Livro livro2 = new Livro("A Pequena Sereia");
		Livro livro3 = new Livro("O Magico de Oz");
		Livro livro4 = new Livro("A Branca de Neve");
		Livro livro5 = new Livro("A Caverna do Dragao");
		Livro livro6 = new Livro("A Casa Monstro");
		Livro livro7 = new Livro("O Menino de Pijama Listrado");
		
		pilhaLimite.push(livro);
		pilhaLimite.push(livro2);
		pilhaLimite.push(livro3);
		pilhaLimite.push(livro4);
		pilhaLimite.push(livro5);
		pilhaLimite.push(livro6);
		pilhaLimite.push(livro7);
		
		String resultadoEsperado = "A Caverna do Dragao";
		
		return pilhaLimite.pop().getTitulo().equals(resultadoEsperado);
	}
	
	//Verifica se Titulos estao de acordo com o padrão
	public boolean testNome() {
		Pilha pilhaNome = new Pilha();
		
		Livro livro = new Livro("O Pequeno Principe");
		pilhaNome.push(livro);
		
		Livro livro2 = new Livro("A Pequena Sereia");
		pilhaNome.push(livro2);

		Livro livro3 = new Livro("A Bela e a Fera");
		pilhaNome.push(livro3);

		Livro livro4 = new Livro("A Branca de Neve");
		pilhaNome.push(livro4);

		Livro livro5 = new Livro("Harry Potter");
		pilhaNome.push(livro5);

		String resultadoEsperado = "A Branca de Neve";
		
		return pilhaNome.pop().getTitulo().equals(resultadoEsperado);
	}
	
}
