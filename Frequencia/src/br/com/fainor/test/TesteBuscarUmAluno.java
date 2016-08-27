package br.com.fainor.test;

import br.com.fainor.dao.AlunoDAO;

public class TestBuscaUmAluno {
	public static void main(String [] args){
	
		AlunoDAO dao = new AlunoDAO();
		System.out.println(dao.porId(2L).getNome());
	
	}
}
