package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConMySQL {

	private static String status = "2km";
	private static Connection conecc = null;
	
	public ConMySQL(){
		
	}
	
	public static Connection getConnectionMySQL(){
		
		String drivername = "com.mysql.jdbc.Driver";
		String servername = "localhost";	// Caminho do sevidor do BD
		String mydatabase = "reservasala";	// Nome do seu banco de dados
		String url = "jdbc:mysql://"+servername+":3306/"+mydatabase;
		String username = "root";	// Nome de um usuario de BD
		String password = "123456";	// Sua senha de acesso
		
		try {
			conecc = DriverManager.getConnection(url, username, password);
			
			if(conecc != null){
				status = "STATUS: Conectou!";
			}else{
				status = "STATUS: Nao ta indo";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conecc;
		
	}
	
	public static boolean fecharConexao(){
		
		try {
			ConMySQL.getConnectionMySQL().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getConnectionMySQL());
		System.out.println(ConMySQL.status);
		ConMySQL.getConnectionMySQL();
		ConMySQL.fecharConexao();
		
		try {
			System.out.println(conecc.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
