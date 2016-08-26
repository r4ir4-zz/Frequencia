package br.com.fainor.model;

public class Aluno extends Pessoa { // heranca de classe Pessoa
	//private Long id;
	//private String nome;
	private String ra;

	



	public Aluno(Long id, String nome, String cpf, String ra) {
	super(id, nome, cpf);
	this.ra = ra;
}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	
	
	
}
