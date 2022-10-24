package br.com.caelum.ed.vetores.testes;

// 12) Utilize a classe Vetor que foi implementada nos exercícios anteriores
// e as classes da API do Java Vector ou ArrayList. 
// Para saber os métodos das classes da API, utilize a documentação do Java (http://java.sun.
// com/j2se/1.5.0/docs/api/index.html).

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Aluno> vetor = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		vetor.add(aluno1);
		vetor.add(aluno2);
		vetor.add(0, aluno3);
		
		int tamanho = vetor.size();
		
		if(tamanho != 3) {
			System.out.println("Erro: O tamanho da lista está errado");
		}
		
        if (!vetor.contains(aluno1)) {
            System.out.println("Erro: Não achou um aluno que deveria estar na lista");
        }
		
		vetor.remove(0);
		tamanho = vetor.size();
		
		if(tamanho != 2) {
			System.out.println("Erro: O tamanho da lista está errado");
		}
		
		if(vetor.contains(aluno3)) {
			System.out.println("Erro: Achou um aluno que não deveria estar na lista");
		}
		
	}

}
