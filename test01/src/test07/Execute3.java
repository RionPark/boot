package test07;

public class Execute3 {
	public static void main(String[] args) {
		Food f1 = new Pizza();
		System.out.println(f1.FOOD_NAME);
		Food f2 = new Lamen();
		System.out.println(f2.FOOD_NAME);
		System.out.println(Food.FOOD_NAME);
	}
}
