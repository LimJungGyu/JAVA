package chap02;

import java.util.Scanner;

public class IfQ5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sex = "" ;
		int		score = 0;
		String result = "";
	    
		System.out.println("남성이면 남자 여성이면 여자 를 입력하세요");
	    sex = (sc.nextLine());
	    System.out.println("토익성적을 입력하세요");
	    score = Integer.parseInt(sc.nextLine());
	    
	    if ((sex.equals("남자") && score>=800)||(sex.equals("여자") && score>=700)){
	    	result="항공 승무원 지원 자격 가능자입니다";
	    }
	    else {result="항공 승무원 지원 자격 불가능자입니다";}
	    
	    System.out.println(result);	
		
		

	}

}
