package br.com.fainor.model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	// private Long id;
	// private String nome;
	// private String cpf;
	// private String email;
	private String matricula;
	private List<Aula> aulas = new ArrayList<>();
	private String senha;



	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Professor(Long id, String nome, String cpf, String matricula) {
		super(id, nome, cpf);
		this.matricula = matricula;
		this.aulas = aulas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

}
