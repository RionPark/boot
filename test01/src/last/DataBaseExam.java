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
		System.out.println("��ȣ : ");
		String num = scan.nextLine();
		System.out.println("�̸� : ");
		String name = scan.nextLine();
		System.out.println("���� : ");
		String age = scan.nextLine();
		System.out.println("�ּ� : ");
		String address = scan.nextLine();
		String sql = "insert into user_info ";
		sql += "values('" + num + "','" + name + "','" + age;
		sql += "','" + address +"')";
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result==1) {
				System.out.println("�����Է� ����");
			}else {
				System.out.println("�����Է� ����");
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
		System.out.println("1.�ű������Է�, 2.��������Ʈ ���");
		while(true) {
			System.out.println("���ϴ� ��ȣ�� �Է����ּ���");
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
