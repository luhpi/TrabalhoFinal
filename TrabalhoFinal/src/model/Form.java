package model;


public class Form {
	
	public String curso;
	public String nome_sol;
	public String telefone;
	public String email;
	public String atividade;
	public String data_req;
	public String horario;
	public int alunos;
	public String equipamentos;
	public String sala;
	public String servidor;
	public String obs;
	public String data_res;
	
	public Form(String curso, String nome_sol, String telefone, String email, String atividade, String data_req,
			String horario, int alunos, String equipamentos, String sala, String servidor, String obs,
			String data_res) {
		super();
		this.curso = curso;
		this.nome_sol = nome_sol;
		this.telefone = telefone;
		this.email = email;
		this.atividade = atividade;
		this.data_req = data_req;
		this.horario = horario;
		this.alunos = alunos;
		this.equipamentos = equipamentos;
		this.sala = sala;
		this.servidor = servidor;
		this.obs = obs;
		this.data_res = data_res;
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

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public String getData_req() {
		return data_req;
	}

	public void setData_req(String data_req) {
		this.data_req = data_req;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

	public String getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(String equipamentos) {
		this.equipamentos = equipamentos;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getServidor() {
		return servidor;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getData_res() {
		return data_res;
	}

	public void setData_res(String data_res) {
		this.data_res = data_res;
	}
	
	

}
