package chap02;

import java.util.Scanner;

public class SwitchQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		String result ="";
		
		System.out.println("1~12을 입력하세요(ex:3,4,5-->봄)");
		month = Integer.parseInt(sc.nextLine());
		
		switch(month) {
		case 3: case 4: case 5:
			result="봄";
			break;
		case 6: case 7: case 8:
			result="여름";
			break;
		case 9: case 10: case 11:
			result="가을";
			break;
		case 12: case 1: case 2:
			result="겨울";
			break;
		default:
			result="잘못입력하셧습니다.";
		}
		System.out.println(result);

	}

}
