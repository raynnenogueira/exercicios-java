package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;

import br.com.caelum.ed.vetores.Vetor;

//2) Escreva os testes unitários vistos neste capítulo. 
//Coloque os testes
//no pacote br.com.caelum.ed.vetores.testes.

public class TesteContemAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(a2));
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		
		System.out.println(lista.contem(aluno));

	}

}
