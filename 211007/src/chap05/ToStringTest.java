package chap05;

import java.util.Date;   //현재시간 알려주는~

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		Date today = new Date();  //데이트에 컨트롤 쉬프트 오 해서 util data선택
		
		//스트링과 데이트 타입은 이미 오버라이딩 되어있기때문에 해쉬코드가 아닌 문자그대로 나옴
		System.out.println(str.toString());
		System.out.println(today.toString());
	}

}
