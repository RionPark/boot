package test09;

public class FoodVM implements VendingMachine{
	String vmName;
	
	FoodVM(String vmName){
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
