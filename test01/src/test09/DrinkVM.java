package test09;

public class DrinkVM implements VendingMachine{
	String vmName;
	
	DrinkVM(String vmName){
		this.vmName = vmName;
	}
	private String product; 
	public void insertCoin(int coin) {
		System.out.println(vmName + "자판기에 " + coin + "원이 들어갔습니다.");
	}
	public String getProduct() {
		return product;
	}
	public void insertProduct(String product) {
		this.product = product;
	}
	
}
