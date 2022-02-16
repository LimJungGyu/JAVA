package chap03;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("red","manual",2);
		Car c3 = new Car();
		Car c4 = new Car(c2);   //인스턴스 복사
		
	
		System.out.println(c1.showCarInfo());
		System.out.println(c2.showCarInfo());
		System.out.println(c3.showCarInfo());
		System.out.println(c4.showCarInfo());

	}

}
