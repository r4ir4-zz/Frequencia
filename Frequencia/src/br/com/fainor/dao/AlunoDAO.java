package br.com.fainor.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fainor.model.Aluno;

public class AlunoDAO{
	
	public List<Aluno> todos(){
		
		List<Aluno> alunos = new ArrayList<>();
		
		alunos.add(new Aluno(1L,"Logan Wolverine", "2317465168432","32198465198"));	
		alunos.add(new Aluno(2L,"Juca da Silva", "26546523265168432","321984651989825"));	
		alunos.add(new Aluno(3L,"Big Joe", "2889933168432","32598465198"));	
		alunos.add(new Aluno(4L,"Silvina Pera", "23178823265168432","32198465698"));	
		return alunos;
	}
	
	public Aluno porId(Long id){
		for(Aluno aluno: todos()){
			if(aluno.getId()== id){
				return aluno;
			}
		}
		return null;
	}
}

