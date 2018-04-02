package test07;

public class Execute {
	
	public static void printInfo(Animal[] animals) {
		for(int i=0;i<animals.length;i++) {
			animals[i].eat();
		}
	}
	
	public static void printInfo(Animal a, Dog d, Cat c) {
		a.eat();
		d.eat();
		c.eat();
	}
	public static void main(String[] args) {
		Animal a = new Cat("��","������",5);
		Animal a2 = new Dog("����","ī��",1);
		Animal a3 = new Animal();
		Animal a4 = new Lion("","",3);
		Animal[] animals = new Animal[3];
		animals[0] = a;
		animals[1] = a2;
		animals[2] = new Lion("���","ī��",1);
		printInfo(animals);
	}
}
