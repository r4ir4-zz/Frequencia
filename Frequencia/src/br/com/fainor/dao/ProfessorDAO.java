package br.com.fainor.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fainor.model.Professor;

public class ProfessorDAO {

public List<Professor> todos(){
		
		List<Professor> professores = new ArrayList<>();
		
		professores.add(new Professor(1L,"Charles", "2317465168432","bob.@fainor.com.br"));	
		professores.add(new Professor(2L,"Takya", "26546523265168432","taky.@fainor.com.br"));	
		professores.add(new Professor(3L,"Munelar", "2889933168432","Mu.@fainor.com.br"));	
		professores.add(new Professor(4L,"Lucas", "23178823265168432","Lu.@fainor.com.br"));	
		return professores;
	}
	
	public Professor porId(Long id){
		for(Professor professor: todos()){
			if(professor.getId()== id){
				return professor;
			}
		}
		return null;
	}
}
