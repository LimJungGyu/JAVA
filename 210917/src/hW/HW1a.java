package hW;

import java.util.Arrays;
import java.util.Scanner;

public class HW1a {//////////////////�迭�� ���ѹ��

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[]arr= new int[10];
		int cnt = 0;
		int sum =0;
		int pnum =0;
		double avg = 0;
		
		do {
			System.out.println("������ �Է��ϼ���");
			System.out.println(10-cnt+"�� ���ҽ��ϴ�");
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
		System.out.println("����:"+sum);
		System.out.println("���:"+avg);
		System.out.println(Arrays.toString(arr));

	}

}
