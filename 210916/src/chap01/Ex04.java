package chap01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int x=40, y=20;
		
		if(x<y) {
			System.out.println("x�� y���� �۴�");
		}
		else {
			System.out.println("x�� y���� ũ��");
		} 
		System.out.println("END");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���>>>");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("���̸� �Է��ϼ���>>>");
		int age = Integer.parseInt(sc.nextLine()); //nextline�� ���ڸ� Integer.parseInt�����ؼ� ����ȯ �ؾ��Ѵ�
		
		if (age>=20) {
			System.out.println(name + "���� �����Դϴ�");
			
		}
		else {System.out.println(name + "���� �̼����� �Դϴ�");
			
		}
		
		
		
		
		
		
	}

}
