package chap02;

import java.util.Scanner;

public class IfQa {

	public static void main(String[] args) {
	
	//�ʿ��� ������ ���� �� �ʱ�ȭ
	Scanner sc = new Scanner(System.in);
	
	final int DIST =400;
	int maxSpeed = 0;
	double time =0;
	String result ="";
	
	//�����Է�
	System.out.println("�ڵ��� �ִ�ӵ��� �Է��ϼ���>>>");
	maxSpeed =Integer.parseInt(sc.nextLine());
	//ó�� 1 �ð� =�Ÿ�/�ӵ�
	time = DIST/(double)maxSpeed;
	System.out.println(time);
			
	if (time<=2) {System.out.println("high high speed");
				}
	else if (time<=3) {System.out.println("high speed");
	}
	else if (time>=4){System.out.println("good speed");
	}
	//���
	System.out.println(result);}
	
}
