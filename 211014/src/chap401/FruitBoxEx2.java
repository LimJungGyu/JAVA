package chap401;

public class FruitBoxEx2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); Ÿ�Ժ���ġ
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); ����.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); �ڽ�Ÿ�Ծƴ� ����
		grapeBox.add(new Grape());
		toyBox.add(new Toy());
		
		

		System.out.println("fruit box-"+ fruitBox);
		System.out.println("apple box-"+ appleBox);
		System.out.println("grape box-"+ grapeBox);
		System.out.println(toyBox);
		
	}

}
