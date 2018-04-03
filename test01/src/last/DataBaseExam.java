package last;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseExam {

	Connection con;
	Scanner scan;
	DataBaseExam(){
		try {
			scan = new Scanner(System.in);
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/java";
			con = DriverManager.getConnection(url,"root","r1r2r3");
		}catch(Exception e) {
			
		}
	}
	
	void insertUser() {
		System.out.println("번호 : ");
		String num = scan.nextLine();
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("나이 : ");
		String age = scan.nextLine();
		System.out.println("주소 : ");
		String address = scan.nextLine();
		String sql = "insert into user_info ";
		sql += "values('" + num + "','" + name + "','" + age;
		sql += "','" + address +"')";
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result==1) {
				System.out.println("유저입력 성공");
			}else {
				System.out.println("유저입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void printUsers() {
		String sql = "select * from user_info";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print("num=" + rs.getString("num") +",");
				System.out.print("name=" + rs.getString("name") +",");
				System.out.print("age=" + rs.getString("age") +",");
				System.out.println("address=" + rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		DataBaseExam dbe = new DataBaseExam();
		System.out.println("1.신규유저입력, 2.유저리스트 출력");
		while(true) {
			System.out.println("원하는 번호를 입력해주세요");
			String cmd = dbe.scan.nextLine();
			if("1".equals(cmd)) {
				dbe.insertUser();
			}else if("2".equals(cmd)) {
				dbe.printUsers();
			}else {
				System.exit(0);
			}
		}
	}
}
