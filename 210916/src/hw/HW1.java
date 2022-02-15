package hw;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary =0;
		int position =0;
		double tax=0;
		double result=0;
		
		
		System.out.println("직급을 입력하세요");
		position= Integer.parseInt(sc.nextLine());
		System.out.println("본봉을 입력하세요");
		salary = Integer.parseInt(sc.nextLine());
				
		if ((position == 7) || (position == 8)) {
			tax=0.08;
			result=salary-(salary*tax);
		}		
		else if ((position == 5 ) || (position == 6)) {
			tax=0.12;
			result=salary-(salary*tax);
		}
		else {System.out.println("잘못입력하셧습니다");}
		
		System.out.println("직급 : "+position+"급");
		System.out.println("본봉 : "+salary);
		System.out.println("실수령액"+"(세율"+tax*100+"%)"+" : "+(int)result);
	}
}
