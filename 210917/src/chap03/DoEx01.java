package chap03;

import java.util.Scanner;

public class DoEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int answer = 0;
		int cnt= 0;
		//1~100을원함 //Math.random은 0부터 0.9999999까지의 수를 반환
			answer=(int)(Math.random()*100)+1;
		
			do {
				cnt++;
			System.out.println(" 수를 입력하세요");
			input = Integer.parseInt(sc.nextLine());
			
			if(input>answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else if (input <answer) {
				System.out.println(" 더 큰 수를 입력하세요");
			}
		}while(input!=answer);
		System.out.println("정답입니다");
		System.out.println("횟수:"+cnt);
	}


}