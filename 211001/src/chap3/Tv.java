package chap3;

public class Tv extends Product {
	Tv(){
		//조상크래스의 생성자 Product(int price)를 호출한다
		super(100); //tv의 가격을 100만원으로 한다.
	}
	//object클래스의 toString()을 오버라이딩한다
	public String toString() {
		return "tv"; 
	}

}
