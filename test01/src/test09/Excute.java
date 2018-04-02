package test09;

public class Excute {
	
	public void buySomething(VendingMachine dvm) {
		dvm.insertProduct("코카콜라330ml");
		dvm.insertCoin(300);
		String item = dvm.getProduct();
		System.out.println("뽑은 제품은 " + item);
	}

	public static void main(String[] args) {
		VendingMachine vm = new FoodVM("음식");
		vm = new DrinkVM("음료수");
		Excute e = new Excute();
		e.buySomething(vm);
	}
}
