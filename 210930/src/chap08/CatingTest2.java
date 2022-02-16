package chap08;

public class CatingTest2 {

	public static void main(String[] args) {
		Car car = new FireEngine();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		if(car instanceof FireEngine) { 
		fe = (FireEngine)car; //11번줄 컴파일은 ok,실행시 에러가 발생
			fe.drive();
			car2 = fe;
			car2.drive();
		}
	}

}
