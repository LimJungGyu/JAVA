package chap01;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է�123456-1000000");
		String jumin = sc.nextLine();
		char gender = jumin.charAt(7);
		String result = "";
		
		switch(gender) {
		case '1': result="2000�� ���� ��� �����Դϴ�.";
		break;
		case '2': result="2000�� ���� ��� �����Դϴ�.";
		break;
		case '3': result="2000�� ���� ��� �����Դϴ�.";
		break;
		case '4': result="2000�� ���� ��� �����Դϴ�.";
		break;
		default:  result="�߸� �Է��ϼ˽��ϴ�.";
		}
		System.out.println(result);
		
	}

}
