package chap4;

import java.util.ArrayList;


class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>();
		
		fruitBox.add(new Fruit());  //프룻박스에는 사과 포도 상속받았기때문에 다들어감
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); //같은 부모 상속 받아도 자식끼리는 안됨
//		appleBox.add(new Toy()); 에러 -에플 박스에 토이 못담음
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); 에러 -토이 박스에 에플 못담음
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}//메인끝
	

}
