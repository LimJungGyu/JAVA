package chap4;

import java.util.ArrayList;


class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>();
		
		fruitBox.add(new Fruit());  //����ڽ����� ��� ���� ��ӹ޾ұ⶧���� �ٵ�
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); //���� �θ� ��� �޾Ƶ� �ڽĳ����� �ȵ�
//		appleBox.add(new Toy()); ���� -���� �ڽ��� ���� ������
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); ���� -���� �ڽ��� ���� ������
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}//���γ�
	

}
