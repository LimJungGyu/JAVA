package chap3;

public class PolyArgumenTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv t= new Tv();
		
		b.buy(t);
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Audio());
		b.summary();
		
		System.out.println("���� ��������"+b.money+"�����Դϴ�");
		System.out.println("���� ���ʽ�������"+b.bonusPoint+"���Դϴ�");

	}

}
