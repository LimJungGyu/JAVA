package chap01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int x=40, y=20;
		
		if(x<y) {
			System.out.println("x는 y보다 작다");
		}
		else {
			System.out.println("x는 y보다 크다");
		} 
		System.out.println("END");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요>>>");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("나이를 입력하세요>>>");
		int age = Integer.parseInt(sc.nextLine()); //nextline은 문자만 Integer.parseInt를통해서 형변환 해야한다
		
		if (age>=20) {
			System.out.println(name + "님은 성인입니다");
			
		}
		else {System.out.println(name + "님은 미성년자 입니다");
			
		}
		
		
		
		
		
		
	}

}
