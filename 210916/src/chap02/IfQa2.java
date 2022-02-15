package chap02;

import java.util.Scanner;

public class IfQa2 {

	public static void main(String[] args) {
		//변수 선언
		Scanner sc = new Scanner(System.in);
		final int CM =500000;
		final double RATE =0.073;
		int num = 0;
		double total =0;
		String result ="";
		
		//input
		System.out.println("판매 대수를 입력하세요>>>>");
		num = Integer.parseInt(sc.nextLine());
		
		//처리
		total = CM *RATE*num;
		System.out.println(total);
		
		if(total <=50000) {
			result="LOW";
		}else if(total >50000 &&
				total <10000) {
			result="MID";
		}else if(total >=100000) {
			result="HIGH";
		}
		//결과출력
		System.out.println(result);
	}

}
