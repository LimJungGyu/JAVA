package hw;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int position =0;
		int wage=0;
		int hour=0;
		int time=0;
		double overpaid=1.0;
		double result=0;
		
		System.out.println("사원의 등급을 입력하세요");
		position= Integer.parseInt(sc.nextLine());
		System.out.println("1주 근무시간을 입력하세요");
		hour= Integer.parseInt(sc.nextLine());
		
		if ((position==7)||(position==8)) {	
			if(hour>40) {overpaid=1.5; time=hour;}
			else if(hour<40) {time=40;}
			wage=15000;
			result=wage*time*overpaid;
		}
		else if ((position==5)||(position==6)) {	
			if(hour>40) {overpaid=1.5; time=hour;}
			else if(hour<40) {time=40;}
			wage=20000;
			result=wage*time*overpaid;
		}			
		else {System.out.println("잘못 입력하셧습니다");}
		System.out.println("직급: "+position+"급");
		System.out.println("근무시간:"+hour+"시간");
		System.out.println("주 급여:"+(int)result+"원");
	
				
			
		
			
		
		
	
	}
}
