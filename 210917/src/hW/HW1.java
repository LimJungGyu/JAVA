package hW;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input =0;
		int cnt=0;
		int sum=0;
		int avg=0;
		
		do {
			System.out.println("0보다 큰 정수를 입력하세요"+(10-cnt)+"번 남았습니다");
			
			input = Integer.parseInt(sc.nextLine());
				cnt++;
				sum+=input;
				avg=sum/cnt;	
			
			
		}while(cnt<10);
		System.out.println("합계:"+sum+"평균:"+avg);
			
		
			
	}

}
