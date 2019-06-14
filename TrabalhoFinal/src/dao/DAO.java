package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	private String name = null;
	private Connection con = null;
	
	//Create
	public String createDAO(int code, String name){
		con = ConMySQL.getConnectionMySQL();
		String sql = "INSERT INTO usuarios VALUES (?, ?)";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setInt(1, code);
			prepS.setString(2, name);
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
	public String readDAO(int code){
		con = ConMySQL.getConnectionMySQL();
		String sql = "SELECT * FROM usuarios WHERE id=?";
		
		PreparedStatement prepS;
		try {
			prepS = con.prepareStatement(sql);
			prepS.setInt(1, code);
			ResultSet res = prepS.executeQuery();
			while(res.next()){
				name = res.getString(2);
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
		return name;
	}
	
	//Update
	public void updateDAO(int code, String name){
		con = ConMySQL.getConnectionMySQL();
		String sql = "UPDATE usuarios SET nome=? WHERE id=?";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setString(1, name);
			prepS.setInt(2, code);
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
	
	//Delete
	public void deleteDAO(int code){
		con = ConMySQL.getConnectionMySQL();
		String sql = "DELETE FROM usuarios WHERE id=?";
		
		PreparedStatement prepS;
		try {
			prepS = con.prepareStatement(sql);
			prepS.setInt(1, code);
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
