package br.com.testeunitario.model;

public class Cliente {

	String cpf;
	String nome;
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}	
}