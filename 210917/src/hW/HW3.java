package hW;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int input = 0;
		int cnt =0;
		int sum=0;
		int a =0;
		
		System.out.println("���ڸ� �Է��ϼ���");
		input = Integer.parseInt(sc.nextLine());
		do {
			sum+=a;
			cnt++;
			a=cnt*3;
			
			
		}while(a<input);
		System.out.println(input+"�� �Ѿ������� ��: "+a);
		System.out.println(input+"�� �Ѿ����������� ����: "+sum);
		System.out.println(input+"�� �Ѿ��������� �� ��° 3�ǹ���ΰ�: "+cnt);

	}

}
