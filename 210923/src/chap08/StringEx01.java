package chap08;

public class StringEx01 {

	public static void main(String[] args) {
		String name1 = "홍길동";              /////2가지 방법
		String name2= new String("홍길동"); ///이게 정석 new를 쓰면 주소를 기억하기때문에 불일치
		String name3 = "홍길동";        ////new를 안쓰면 이미썻던 단어면 주소를 일치시켜기억한다
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1.equals(name3)); ////스트링에 한해서는 이렇게 비교
		

	}

}
