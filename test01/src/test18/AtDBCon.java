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
			String errorMsg = "file : '" + filePath + "' 없음!";
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
	//데이터 입력용 추상메서드
	public abstract int insert();
	//데이터 조회용 추상메서드
	public abstract List<Map<String,String>> select();
	//데이터 수정용 추상메서드
	public abstract int update();
	//데이터 삭제용 추상메서드
	public abstract int delete();
}