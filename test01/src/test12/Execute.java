package test12;

import java.util.ArrayList;

public class Execute {

	public static void main(String[] args) {
		Dog d1 = new Dog("미미",1,"불독");
		Dog d2 = new Dog("리리",5,"불독");
		Dog d3 = new Dog("동동",3,"불독");
		Dog d4 = new Dog("마리",7,"불독");
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(d1);
		dogList.add(d2);
		dogList.add(d3);
		dogList.add(d4);
	}
}
