package test09;

public class DrinkVM implements VendingMachine{
	String vmName;
	
	DrinkVM(String vmName){
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
