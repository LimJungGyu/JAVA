package hW;

import java.util.Arrays;
import java.util.Scanner;

public class HW1a {//////////////////배열을 통한방법

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[]arr= new int[10];
		int cnt = 0;
		int sum =0;
		int pnum =0;
		double avg = 0;
		
		do {
			System.out.println("정수를 입력하세요");
			System.out.println(10-cnt+"번 남았습니다");
			arr[cnt]=Integer.parseInt(sc.nextLine());
			cnt++;
		}while(cnt<10);
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>0) {
				sum = sum + arr[i];
				pnum++;
			}
		}
		avg = sum/(double)pnum;
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);
		System.out.println(Arrays.toString(arr));

	}

}
