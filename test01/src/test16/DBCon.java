package test16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {
	static String getCon() {
		return "무언가!!";
	}
	
	public static void main(String[] args) {
		
		Connection con = null;
		String url="jdbc:mysql://localhost:3306/java";
		String id="root";
		String pwd="r1r2r3";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select name from user_info");
			while(rs.next()) {
				String name = rs.getString("name");
				System.out.println(name);
			}
			rs = stmt.executeQuery("select * from user_info");
			while(rs.next()) {
				String name = rs.getString("name");
				System.out.println(name);
			}
			System.out.println("데이터베이스에 접속이 성공하였습니다.");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
