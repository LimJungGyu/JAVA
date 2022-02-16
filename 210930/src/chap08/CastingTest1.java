package chap08;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car =null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;   //car = (Car)fe;에서 형변환이 생략된 형태다
		//car.water(); ---------------컴파일 에러 car(부모)타입의 참조변수로는 
									               //water()(자식고유기능)를 직접 호출할수없다
		
		fe2 = (FireEngine)car;//다운캐스팅 fe2자손타입() <--car조상타입() 못밀어넣기때문에 형변환 필요
		fe2.water();
	}

}
