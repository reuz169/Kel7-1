package tb;

import java.sql.*;

public class Koneksi {
	public static java.sql.Connection koneksi;
//	private static Connection koneksi;
	
	public static Connection koneksiSQL() throws SQLException{
	try {
		String url = "jdbc:mysql://localhost/tbbpl";
		String user = "root";
		String pass = "";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		koneksi = DriverManager.getConnection(url, user, pass);
		}catch(SQLException e){
			System.out.println("Koneksi Database gagal");
		}
	return koneksi;
	
	}
}
