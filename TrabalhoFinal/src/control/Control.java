package control;
import view.View;
import model.Apoio;
import model.Solicitante;
import model.Atividade;
import dao.DAO;

public class Control {

    public DAO dao;
    public View tela;

    public Control(DAO dao, View tela){
        this.dao = dao;
        this.tela = tela;
        // buttons go here    
    }

    public boolean logar(String usuario, String senha){
        boolean apoio;
        try{
            apoio = dao.readUser(nome, senha);   
        }catch(Exception e){
            // cant find usuario so dialog box
        }
    }

    public boolean salvarAtividade(String atividade, String data_req_ini, String data_req_fin){
        try{
            dao.createAtividade(atividade, data_req_ini, data_req_fin);
        }catch(exception e){
            //cant save dialog box
        }
    }

    public boolean salvarSolicitante(String curso, String nome, String telefone, String email){
        try{
            dao.createSolicitante(curso, nome, telefone, email);
        }catch(Exception e){
            //cant save dialog box
        }
    }

    public boolean salvarapoio(String sala, String servidor, String obs, String data_res_ini, String data_res_fin){
        try{
            dao.createApoio(sala, servidor, obs, data_res_ini, data_res_fin);
        }catch(exception e){
            //cant save dialog box
        }
    }
}
