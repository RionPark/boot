package test15;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	static void insertCarList(List<Car> carList) {
		for(int i=1;i<=10;i++) {
			Car c = new Car();
			c.setAmount(i+1000);
			c.setCarName("ÀÚµ¿Â÷" + i);
			c.setYear("201" + i);
			carList.add(c);
		}
	}
	static void printCarList(List<Car> carList) {
		for(Car c : carList) {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		insertCarList(carList);
		printCarList(carList);
	}
}
