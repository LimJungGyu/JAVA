package hW;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int input = 0;
		int cnt =0;
		int sum=0;
		int a =0;
		
		System.out.println("숫자를 입력하세요");
		input = Integer.parseInt(sc.nextLine());
		do {
			sum+=a;
			cnt++;
			a=cnt*3;
			
			
		}while(a<input);
		System.out.println(input+"을 넘었을때의 값: "+a);
		System.out.println(input+"을 넘었을때까지의 총합: "+sum);
		System.out.println(input+"을 넘었을때까지 몇 번째 3의배수인가: "+cnt);

	}

}
