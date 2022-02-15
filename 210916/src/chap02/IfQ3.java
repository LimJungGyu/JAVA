package chap02;

import java.util.Scanner;

public class IfQ3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = 0;
		double score = 0;
		String result ="";
		
		System.out.println("나이를 입력하세요>>>>");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("성적을 입력하세요>>>>");
		score = Double.parseDouble(sc.nextLine());
		
		if (age<30 && score>=3.5) {result="추천 대상 입니다";}
		else {result="추천 대상이 아닙니다";}
	
		System.out.println(result);
	}

}
