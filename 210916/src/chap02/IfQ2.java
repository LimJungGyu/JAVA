package chap02;

import java.util.Scanner;

public class IfQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("판매대수를 입력하세요");
		int sell =Integer.parseInt(sc.nextLine());
		double benefit = 500000*0.073;
		if (benefit<=50000) {System.out.println("low");}
		else if (benefit>=50001 && benefit<100000) {System.out.println("mid");}
		else {System.out.println("high");}
}
}