package hw;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary =0;
		int position =0;
		double tax=0;
		double result=0;
		
		
		System.out.println("������ �Է��ϼ���");
		position= Integer.parseInt(sc.nextLine());
		System.out.println("������ �Է��ϼ���");
		salary = Integer.parseInt(sc.nextLine());
				
		if ((position == 7) || (position == 8)) {
			tax=0.08;
			result=salary-(salary*tax);
		}		
		else if ((position == 5 ) || (position == 6)) {
			tax=0.12;
			result=salary-(salary*tax);
		}
		else {System.out.println("�߸��Է��ϼ˽��ϴ�");}
		
		System.out.println("���� : "+position+"��");
		System.out.println("���� : "+salary);
		System.out.println("�Ǽ��ɾ�"+"(����"+tax*100+"%)"+" : "+(int)result);
	}
}
