package chap01;

public class EX01 {

	public static void main(String[] args) {
		//기본형 boolean빼고 나머지는 서로 형변환 가능
		//자동: 작은 사이즈를 큰사이즈에 대입
		//수동: 큰 ---->작은
		
		char c = 'A'; //변수 선언과 초기화
		int i = c;
		byte b= (byte)128;////byte는127까지밖에 출력됨 앞에 강제적 형변환해야
		
		
		System.out.println(c);
		System.out.println(i); //A의 유니코드 값인 정수 타입으로 출력된다
		System.out.println(b);
		
		int x,y;
		x = y = 3;
		System.out.println(x);
		System.out.println(y);
		
		
		

	}

}
