package chap03;

import java.util.Scanner;

public class DoEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int answer = 0;
		int cnt= 0;
		//1~100������ //Math.random�� 0���� 0.9999999������ ���� ��ȯ
			answer=(int)(Math.random()*100)+1;
		
			do {
				cnt++;
			System.out.println(" ���� �Է��ϼ���");
			input = Integer.parseInt(sc.nextLine());
			
			if(input>answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else if (input <answer) {
				System.out.println(" �� ū ���� �Է��ϼ���");
			}
		}while(input!=answer);
		System.out.println("�����Դϴ�");
		System.out.println("Ƚ��:"+cnt);
	}


}