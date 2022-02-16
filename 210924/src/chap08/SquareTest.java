package chap08;

public class SquareTest {

	public static void main(String[] args) {

		Square s1 =new Square(4,5);
		Square s2 =new Square(25,50);
		
		System.out.println("s1의 둘레는"+s1.calcRound());
		System.out.println("s1의 넓이는"+s1.calcArea());
		
		System.out.println("s2의 둘레는"+s2.calcRound());
		System.out.println("s2의 넓이는"+s2.calcArea());

	}

}
