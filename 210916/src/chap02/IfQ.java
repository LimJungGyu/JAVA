package chap02;

import java.util.Scanner;

public class IfQ {

	public static void main(String[] args) {
		//�ʿ��� ������ ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڵ��� �ִ�ӵ��� �Է��ϼ���>>>");
		int speed =Integer.parseInt(sc.nextLine());
		int hours = 400/ speed;
		if (hours<=2) {System.out.println("high high speed");
					}
		else if (hours<=3) {System.out.println("high speed");
		}
		else {System.out.println("good speed");
		}
	}}


