package test09;

public class FoodVM implements VendingMachine{
	String vmName;
	
	FoodVM(String vmName){
		this.vmName = vmName;
	}
	private String product; 
	public void insertCoin(int coin) {
		System.out.println(vmName + "���Ǳ⿡ " + coin + "���� �����ϴ�.");
	}
	public String getProduct() {
		return product;
	}
	public void insertProduct(String product) {
		this.product = product;
	}

}
