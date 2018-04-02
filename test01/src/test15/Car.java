package test15;

public class Car {
	private String carName;
	private String year;
	private int amount;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", year=" + year + ", amount=" + amount + "]";
	}
	
}
