package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	private String name = null;
	private Connection con = null;
	
	//Create
	public String createUser(String name, String senha, boolean apoio){
		con = ConMySQL.getConnectionMySQL();
		String sql = "INSERT INTO usuarios VALUES (?, ?, ?)";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setString(1, name);
			prepS.setString(2, senha);
            prepS.setBoolean(3, apoio);
            prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return name;
	}


	public String createSolicitante(String curso, String nome, String telefone, String email){
		con = ConMySQL.getConnectionMySQL();
		String sql = "INSERT INTO solicitante VALUES (?, ?, ?, ?)";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setString(1, curso);
			prepS.setString(2, nome);
            prepS.setString(3, telefone);
            prepS.setString(4, email);
			prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return name;
	}


	public String createAtividade(String atividade, String data_req_ini, String data_req_fin){
		con = ConMySQL.getConnectionMySQL();
		String sql = "INSERT INTO atividade VALUES (?, ?, ?)";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setString(1, atividade);
			prepS.setString(2, data_req_ini);
            prepS.setString(3, data_req_fin);
			prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return name;
	}

	public String createApoio(String sala, String servidor, String obs, String data_res_ini, String data_res_fin){
		con = ConMySQL.getConnectionMySQL();
		String sql = "INSERT INTO usuarios VALUES (?, ?, ?, ?)";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setString(1, servidor);
			prepS.setString(2, obs);
            prepS.setString(3, data_res_ini);
            prepS.setString(4, data_res_fin);
			prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return name;
	}

	//Read
	public boolean readUser(String nome, String senha){
		con = ConMySQL.getConnectionMySQL();
		String sql = "SELECT * FROM usuarios WHERE nome=? and senha=?";
		boolean apoio;

		PreparedStatement prepS;
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, nome);
            prepS.setString(2, senha);
			ResultSet res = prepS.executeQuery();
			while(res.next()){
				boolean = res.getBoolean(3);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return apoio;
	}
	
	//Update
	public void updateUser(String name, String senha){
		con = ConMySQL.getConnectionMySQL();
		String sql = "UPDATE usuarios SET senha=? WHERE nome=?";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setString(1, senha);
			prepS.setString(2, name);
			prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			trych character will show up one by one in Intimacy Level order on your birthday page. By clicking the rainbow speech bubble, you can hear and receive their "User's Birthday Celebration" Voice Clip.
By clicking onto the stage screen, you can see a randomized assortment of 5 students and 8 cakes with no regard to intimate level or other settings.
 {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//Delete
	public void deleteUser(String nome, String senha){
		con = ConMySQL.getConnectionMySQL();
		String sql = "DELETE FROM usuarios WHERE nome=? and senha=?";
		
		PreparedStatement prepS;
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, nome);
            prepS.setString(2, senha);
			prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
