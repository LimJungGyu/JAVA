package chap01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է�>>>");
		int age = Integer.parseInt(sc.nextLine());
		//���̰� 10~19���� �̸� 10�� �Դϴ�
		if (age>=10 && age <20) {
			System.out.println("10���Դϴ�");
		}
		else {System.out.println("����� 10�밡 �ƴմϴ�");
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		System.out.println(!b);
		
	}

}
