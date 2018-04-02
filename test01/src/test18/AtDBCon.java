package test18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.mariadb.jdbc.Driver;

public abstract class AtDBCon {
	protected Connection con;
	private String url;
	private String id;
	private String pwd;
	private String driver;
	public AtDBCon(String filePath) throws IOException{
		InputStream is;
		is = getClass().getClassLoader().getResourceAsStream(filePath);

		Properties prop = new Properties();
		if (is != null) {
			prop.load(is);
			url = prop.getProperty("db.url");
			id = prop.getProperty("db.id");
			pwd = prop.getProperty("db.pwd");
			driver = prop.getProperty("db.driver");
			connectionDB();
		} else {
			String errorMsg = "file : '" + filePath + "' ����!";
			throw new FileNotFoundException(errorMsg);
		}
	}
	
	private void connectionDB() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	//������ �Է¿� �߻�޼���
	public abstract int insert();
	//������ ��ȸ�� �߻�޼���
	public abstract List<Map<String,String>> select();
	//������ ������ �߻�޼���
	public abstract int update();
	//������ ������ �߻�޼���
	public abstract int delete();
}