package chap5;

public class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f:box.getList()) {//향상된 for문
			tmp = tmp + f + ""; //인덱스 없음-순서없음 
		}
			return new Juice(tmp);
	}

}
