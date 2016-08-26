package br.com.fainor.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fainor.dao.AlunoDAO;
import br.com.fainor.dao.ProfessorDAO;
import br.com.fainor.model.*;

public class TesteProfessorRegistrandoFaltaNosAlunos {
	public static void main(String[] args) throws ParseException {
		
		
		
		Sala labFisica = new Sala();//*****************************************
		labFisica.setDescricao("Lab Exp.");
		labFisica.setNumero("35");
		labFisica.setTipoSala(TipoSala.PRATICA);

		Aula aula1 = new Aula();//*********************************************
		//aula1.setProfessor(takya);
		//aula1.setTurma(fisica1);
		aula1.setSala(labFisica);
		aula1.setConteudo("Vetores");
		aula1.setDataAula(new Date());
		
		Disciplina fisica_1 = new Disciplina();//************************************
		fisica_1.setNome("Fisica experimental 1");
		fisica_1.setCodigo("COD32");
		//fisica_1.setProfessor(takya);
		
		AlunoDAO alunoDAO = new AlunoDAO();
		ProfessorDAO professorDAO = new ProfessorDAO();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Frequencia fisic = new Frequencia();//******************************************
		fisic.setAluno(alunoDAO.porId(1L));
		fisic.setDisciplina(fisica_1);
		fisic.setProfessor(professorDAO.porId(2L));
		fisic.setFaltou(false);
		fisic.setDataFrequencia(df.parse("14/05/2010"));
		
		//Mostrar na tela******************************************************
		System.out.println("O professor: " +fisic.getProfessor().getNome()+ ", de CPF: " + fisic.getProfessor().getCpf() + ", ministrou a aula de: " + fisic.getDisciplina().getNome() + ", de codigo: "+ fisic.getDisciplina().getCodigo() +", no dia "+ df.format(fisic.getDataFrequencia()) +", e deu falta no aluno: "+fisic.getAluno().getNome()); 
	}
}
