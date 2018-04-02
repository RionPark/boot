package test17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GenerateFile {

	public static void main(String[] args) {
		File file = new File("infoabc.txt");
		try {
			OutputStream os = new FileOutputStream(file);
			String test = "write!!!!test!!!!한글도 되?";
			os.write(test.getBytes());
			os.flush();
			os.close();
			System.out.println("text.txt.파일이 완성 되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
