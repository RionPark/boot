package test09;

public class Excute {
	
	public void buySomething(VendingMachine dvm) {
		dvm.insertProduct("��ī�ݶ�330ml");
		dvm.insertCoin(300);
		String item = dvm.getProduct();
		System.out.println("���� ��ǰ�� " + item);
	}

	public static void main(String[] args) {
		VendingMachine vm = new FoodVM("����");
		vm = new DrinkVM("�����");
		Excute e = new Excute();
		e.buySomething(vm);
	}
}
