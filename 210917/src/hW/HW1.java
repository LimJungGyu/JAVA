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
			System.out.println("0���� ū ������ �Է��ϼ���"+(10-cnt)+"�� ���ҽ��ϴ�");
			
			input = Integer.parseInt(sc.nextLine());
				cnt++;
				sum+=input;
				avg=sum/cnt;	
			
			
		}while(cnt<10);
		System.out.println("�հ�:"+sum+"���:"+avg);
			
		
			
	}

}
