package br.com.fainor.model;

import java.util.Date;

public class Frequencia {
	private Long id;
	private Aluno aluno;
	private Disciplina disciplina;
	private Date dataFrequencia;
	private Boolean faltou;
	private Professor professor;
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Date getDataFrequencia() {
		return dataFrequencia;
	}

	public void setDataFrequencia(Date dataFrequencia) {
		this.dataFrequencia = dataFrequencia;
	}

	public Boolean getFaltou() {
		return faltou;
	}

	public void setFaltou(Boolean faltou) {
		this.faltou = faltou;
	}
}
