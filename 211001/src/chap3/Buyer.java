package chap3;

public class Buyer {   //고객,물건을 사는사람
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스점수
	Product[] item = new Product[10];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다");
			return;
		}
		
		money -=p.price; //가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;  //제품의 보너스 점수를 추가한다
		item[i++]=p;    //i++이라도 i먼저하고 ++하는
		System.out.println(p+"을/를 구입하셧습니다");
	}
	void summary() {
		int sum = 0 ;
		String itemList="";
		for(int i = 0; i<item. length; i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList +=item[i]+",";
		}
		System.out.println("구입하신 물품의 총금액은"+sum+"만원입니다");
		System.out.println("현재 보너스점수는"+"입니다");
		System.out.println("구입하신 제품은"+itemList+"입니다");
	}

}
