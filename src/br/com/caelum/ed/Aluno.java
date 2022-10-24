package br.com.caelum.ed;

public class Aluno {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public boolean setNome ( String nome ) {
		this.nome = nome;
		return false;
	}
	
	public String toString() {
		return this.nome;
	}
	
	public boolean equals(Object o ) {
		Aluno outro = (Aluno) o;
		return this.setNome(outro.nome);
	}
	
}

