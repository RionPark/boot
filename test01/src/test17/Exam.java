package test17;

public class Exam extends AbstractDataBase{

	Exam() throws Exception{
		super("dbcon.properties1");
	}
	public static void main(String[] args) {
		System.out.println("���α׷� ����!!");
		try {
			AbstractDataBase adb = new Exam();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		System.out.println("���α׷� ����!!");
	}

}
