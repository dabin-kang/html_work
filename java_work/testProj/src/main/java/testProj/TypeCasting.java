package testProj;


class Car{
	void drice() {
		System.out.println("자동차");
	}
}

class Truck extends Car{
	void load() {
		System.out.println("짐 싣기");
	}
}





public class TypeCasting {

	public static void main(String[] args) {
		Car c = new Truck();
		c.drice();
		
	}

}
