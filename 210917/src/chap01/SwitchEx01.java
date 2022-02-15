package chap01;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int month = 0;
		String result ="";
		
		System.out.println("1~12을 입력하세요(ex:3,4,5-->봄)");
		month = Integer.parseInt(sc.nextLine());
		
		if ((month>=3 && month<= 5)){result ="봄";}
		else if ((month>=6 && month<= 8)){result ="여름";}
		else if ((month>=9 && month<= 11)){result ="가을";}
		else if((month==12||month==1||month==2)){result ="겨울";}
		else	{result="잘못입력하셧습니다.";}
		
		System.out.println(result);
	}
		
		

	}


