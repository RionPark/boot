package test19;
//https://github.com/RionPark/boot/tree/master/test01/src
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test18.AtDBCon;

public class MariaCon extends AtDBCon{
	MariaCon() throws IOException {
		super("dbcon.properties");
	}
	
	public static void main(String[] args) {
		try {
			MariaCon mc = new MariaCon();
			List<Map<String, String>> list  = mc.select();
			for(Map<String, String> map : list) {
				String name = map.get("name");
				if("�ְ���".equals(name)) {
					map.put("name", "�̰���");
					int result = mc.update(map);
					System.out.println("���� �Ǽ� : " + result);
				}
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public int insert(Map<String,String> map) {
		return 0;
	}

	@Override
	public List<Map<String, String>> select() {
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from user_info";
			ResultSet rs = stmt.executeQuery(sql);
			List<Map<String, String>> list;
			list = new ArrayList<Map<String, String>>();
			while(rs.next()) {
				Map<String,String> userMap = new HashMap<String,String>();
				userMap.put("name", rs.getString("name"));
				userMap.put("num", rs.getString("num"));
				userMap.put("age", rs.getString("age"));
				userMap.put("address", rs.getString("address"));
				list.add(userMap);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Map<String,String> map) {
		String sql = "update user_info\r\n" + 
				"set name='" + map.get("name") +"'\r\n" + 
				"where num=" + map.get("num");
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Map<String,String> map) {
		return 0;
	}
}
