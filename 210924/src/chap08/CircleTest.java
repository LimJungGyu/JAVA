package chap08;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle s1 =new Circle(5);
		Circle s2 =new Circle(25);
		
		
		System.out.println("s1�� �ѷ���"+s1.calcRound());
		System.out.println("s1�� ���̴�"+s1.calcArea());
		
		System.out.println("s2�� �ѷ���"+s2.calcRound());
		System.out.println("s2�� ���̴�"+s2.calcArea());

	}

}
