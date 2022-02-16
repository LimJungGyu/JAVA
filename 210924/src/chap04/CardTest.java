package chap04;

public class CardTest {

	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number =7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		c1.width= 50;///////////c1만 바꿔도 c2도 바뀜 스태틱변수는 따로가아니다
		c1.height=80;
		
		System.out.println("c1은 "+ c1.kind + ","+c1.number
				+ "이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c1은 "+ c2.kind + ","+c2.number
				+ "이며, 크기는 ("+c2.width+","+c2.height+")");
	
	}

}
