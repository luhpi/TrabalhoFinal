ackage model;


public class Apoio {
	
	
	
	public String equipamentos;
	public String sala;
	public String servidor;
	public String obs;
	public String data_res_ini;
  public String data_res_fin;
	
	public Apoio(String equipamentos, String sala, String servidor, String obs, String data_res_ini, String String data_res_fin) {
		super();
		this.atividade = atividade;
		this.data_req_ini = data_req_ini;
 		this.data_req_fin = data_req_fin;
		this.horario = horario;
		this.alunos = alunos;
		this.equipamentos = equipamentos;
		this.sala = sala;
		this.servidor = servidor;
		this.obs = obs;
		this.data_res = data_res;
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

	public String getData_res_ini() {
		return data_res_ini;
	}

	public void setData_res_ini(String data_res_ini) {
		this.data_res_ini = data_res_ini;
	}
	public String getData_res_fin() {
		return data_res_fin;
	}

	public void setData_res_fin(String data_res_fin) {
		this.data_res_fin = data_res_fin;
  }
	

}
