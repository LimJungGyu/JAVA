package chap02;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day =0;
		String result = "";
		
	
		System.out.println("1~7을 입력하세요(ex:1-->월요일)");
		day = Integer.parseInt(sc.nextLine());
		
		switch(day) {
			case 1:
				result="월요일";
				break;
			case 2:
				result="화요일";
				break;
			case 3:
				result="수요일";
				break;
			case 4:
				result="목요일";
				break;
			case 5:
				result="금요일";
				break;
			case 6:
				result="토요일";
				break;
			case 7:
				result="일요일";
				break;
			default:
				result="잘못입력하셧습니다.";
		}
		System.out.println(result);
	}

}
