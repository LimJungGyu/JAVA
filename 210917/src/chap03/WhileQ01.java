package chap03;

import java.util.Scanner;

public class WhileQ01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input =0;
		int i =0;
		int a =0;
		
			System.out.println("수를 입력하세요");
			input =Integer.parseInt(sc.nextLine());
		do {	
			i++;
			a=a+i;		
		}
		while(input!=i);System.out.println(a);
		
	}
}
