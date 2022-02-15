package chap01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력>>>");
		int age = Integer.parseInt(sc.nextLine());
		//나이가 10~19까지 이면 10대 입니다
		if (age>=10 && age <20) {
			System.out.println("10대입니다");
		}
		else {System.out.println("당신은 10대가 아닙니다");
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		System.out.println(!b);
		
	}

}
