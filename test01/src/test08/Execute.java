package test08;

public class Execute {
	public void info(Computer c) {
		c.info();
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.compName = "��ž";
		d.cpuName = "����";
		Execute e = new Execute();
		e.info(d);
		
		Laptop l = new Laptop();
		l.compName = "��Ʈ��";
		l.cpuName = "AMD";
		l.size = "13��ġ";
		e.info(l);
	}
}
