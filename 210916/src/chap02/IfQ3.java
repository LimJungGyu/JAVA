package chap02;

import java.util.Scanner;

public class IfQ3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = 0;
		double score = 0;
		String result ="";
		
		System.out.println("���̸� �Է��ϼ���>>>>");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("������ �Է��ϼ���>>>>");
		score = Double.parseDouble(sc.nextLine());
		
		if (age<30 && score>=3.5) {result="��õ ��� �Դϴ�";}
		else {result="��õ ����� �ƴմϴ�";}
	
		System.out.println(result);
	}

}
