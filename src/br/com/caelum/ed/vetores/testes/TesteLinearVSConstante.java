package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;

import br.com.caelum.ed.vetores.Vetor;

// 4) Faça um teste para calcular o tempo gasto. 
// Este teste deve adicionar 100000 alunos.
// Execute e marque o tempo.

public class TesteLinearVSConstante {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		long inicio = System.currentTimeMillis();
		for (int i = 1; i < 100000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo em segundos = " + tempo);

	}

}

