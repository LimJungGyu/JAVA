package chap02;

import java.util.Scanner;

public class IfQ4 {

	public static void main(String[] args) {
	
		
	Scanner sc =new Scanner(System.in);
	
	int a=0;
	int b=0;
	String result = "";
	
	System.out.println("숫자 입력하세요>>>>");
	a = Integer.parseInt(sc.nextLine());
	System.out.println("숫자 입력하세요>>>>");
	b = Integer.parseInt(sc.nextLine());
	
	if((a%2==0 && b%2==0) || (a%2==1 && b%2==1)) {result="모두 짝수거나 모두 홀수 입니다";}
	
	System.out.println(result);
	}

}
