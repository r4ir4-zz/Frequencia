package br.com.fainor.test;

import br.com.fainor.dao.AlunoDAO;
import br.com.fainor.model.Aluno;

public class TesteListagemDeAlunos {

	public static void main(String[] args) {
		AlunoDAO dao = new AlunoDAO();
		for(Aluno aluno: dao.todos()){
			System.out.println("Aluno: "+ aluno.getNome()+"-RA: "+ aluno.getRa());
		}

	}

}
