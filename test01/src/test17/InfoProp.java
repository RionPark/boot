package test17;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InfoProp {

	InfoProp(){
		String fileName = "info.properties";
		InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
		Properties prop = new Properties();
		try {
			prop.load(is);
			System.out.println("name=" + prop.getProperty("name"));
			System.out.println("address=" + prop.getProperty("address"));
			System.out.println("job=" + prop.getProperty("job"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new InfoProp();
	}
}
