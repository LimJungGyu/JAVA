package chap5;

public class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f:box.getList()) {//���� for��
			tmp = tmp + f + ""; //�ε��� ����-�������� 
		}
			return new Juice(tmp);
	}

}
