package model;


public class Atividade{
	
	
	public String atividade;
	public String data_req;
	public String horario;
	public int alunos;

  public Form(String curso, String nome_sol, String telefone, String email, String atividade, String data_req,
			String horario, int alunos) {
		super();
		this.atividade = atividade;
		this.data_req = data_req_ini;
    this.data_req = data_req_fin;
		this.horario = horario;
		this.alunos = alunos;
    }

  public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public String getData_req_ini() {
		return data_req_ini;
	}

	public void setData_req_ini(String data_req_ini) {
		this.data_req_ini = data_req_ini;
	}

  public String getData_req_fin() {
		return data_req_fin;
	}

	public void setData_req_fin(String data_req_fin) {
		this.data_req_fin = data_req_fin;
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
}