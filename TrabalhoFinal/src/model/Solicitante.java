package model;

public class Solicitante {

  public String curso;
	public String nome_sol;
	public String telefone;
	public String email;

  public Solicitante(String curso, String nome_sol, String telefone, String email) {
		super();
		this.curso = curso;
		this.nome_sol = nome_sol;
		this.telefone = telefone;
		this.email = email;
  }

  	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNome_sol() {
		return nome_sol;
	}

	public void setNome_sol(String nome_sol) {
		this.nome_sol = nome_sol;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}