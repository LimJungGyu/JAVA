package hw;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 0;
		int hour=0;
		double payment=0;
		double discount=0;
		System.out.println("������ ���ǰ��� �Է��ϼ���");
		price = Integer.parseInt(sc.nextLine());
		System.out.println("������ �ð��� 24�÷� �Է��ϼ���");
		hour = Integer.parseInt(sc.nextLine());
		
		if ((hour>0)||(hour<12)) {discount=0.05;
				payment=price-(price*discount);
		}
		else {discount=0.025;
		payment=price-(price*discount);
		}
		System.out.println("���Խð�"+hour+"��");
		System.out.println("�ѱ��Աݾ�"+price+"��");
		System.out.println("�������Աݾ�"+(int)payment+"��");
	}

}
