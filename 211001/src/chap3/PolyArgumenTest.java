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
		
		System.out.println("현재 남은돈은"+b.money+"만원입니다");
		System.out.println("현재 보너스점수는"+b.bonusPoint+"점입니다");

	}

}
