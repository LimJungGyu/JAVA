package chap01;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력123456-1000000");
		String jumin = sc.nextLine();
		char gender = jumin.charAt(7);
		String result = "";
		
		switch(gender) {
		case '1': result="2000년 이전 출생 남자입니다.";
		break;
		case '2': result="2000년 이전 출생 여자입니다.";
		break;
		case '3': result="2000년 이후 출생 남자입니다.";
		break;
		case '4': result="2000년 이후 출생 여자입니다.";
		break;
		default:  result="잘못 입력하셧습니다.";
		}
		System.out.println(result);
		
	}

}
