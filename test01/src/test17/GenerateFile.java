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
			String test = "write!!!!test!!!!�ѱ۵� ��?";
			os.write(test.getBytes());
			os.flush();
			os.close();
			System.out.println("text.txt.������ �ϼ� �Ǿ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
