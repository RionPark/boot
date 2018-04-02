package test17;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropExam {
	PropExam(){
		String fileName = "config.properties";
		Class ca = this.getClass();
		ClassLoader cl = ca.getClassLoader();
		InputStream is = cl.getResourceAsStream(fileName);
		
		Properties prop = new Properties();
		try {
			prop.load(is);
			String url = prop.getProperty("db.url");
			String id = prop.getProperty("db.id");
			String pwd = prop.getProperty("db.pwd");
			String driver = prop.getProperty("db.driver");
			Connection con = null;
			try {
				Class.forName(driver);
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new PropExam();
	}
}
