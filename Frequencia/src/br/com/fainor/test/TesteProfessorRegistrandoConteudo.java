package br.com.fainor.test;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fainor.model.Aula;
import br.com.fainor.model.Professor;
import br.com.fainor.model.Sala;
import br.com.fainor.model.TipoSala;
import br.com.fainor.model.Turma;
import br.com.fainor.model.Turno;

public class TesteProfessorRegistrandoConteudo {

	public static void main(String[] args) {
		Professor takya = new Professor();//***********************************

		takya.setNome("Carlos Takya");
		takya.setCpf("027.923.352-28");
		takya.setEmail("takya@fainor.com.br");
		
		Turma fisica1 = new Turma();//*****************************************

		fisica1.setDescricao("F1");
		fisica1.setPeriodo("2016.2");
		fisica1.setTurno(Turno.MATUTINO);

		Sala labFisica = new Sala();//*****************************************
		labFisica.setDescricao("Lab Exp.");
		labFisica.setNumero("35");
		labFisica.setTipoSala(TipoSala.PRATICA);

		Aula aula1 = new Aula();//*********************************************
		aula1.setProfessor(takya);
		aula1.setTurma(fisica1);
		aula1.setSala(labFisica);
		aula1.setConteudo("Vetores");
		aula1.setDataAula(new Date());
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("O professor: " + aula1.getProfessor().getNome() + ", de CPF: " + aula1.getProfessor().getCpf() + 
				", ministrou a aula de: " + aula1.getConteudo() +", pelo dia " + df.format(aula1.getDataAula()) +
				", na sala " + aula1.getSala().getNumero() + "." ); 
	}

}
