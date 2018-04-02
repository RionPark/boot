package test17;

import java.io.InputStream;

public abstract class AbstractDataBase {
	public AbstractDataBase(String fileName) throws Exception {
		InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
		if(is==null) {
			throw new Exception(fileName + "이란 파일이 없습니다!!");
		}
	}
	
}
