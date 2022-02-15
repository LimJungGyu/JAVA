package hW;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input =0;
		int cnt=0;
		int sum=0;
		
		do {
			System.out.println("숫자를 입력하세요"+(10-cnt)+"번 남았습니다");
			input =Integer.parseInt(sc.nextLine());
			cnt++;
			if(cnt%2==0){
				input=-input;
			}else if (cnt%2==1) {
				input=input;
			}
			sum+=input;
		}while(cnt<10);
		System.out.println(sum);

	}

}
