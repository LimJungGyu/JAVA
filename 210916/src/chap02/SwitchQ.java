package chap02;

import java.util.Scanner;

public class SwitchQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		String result ="";
		
		System.out.println("1~12�� �Է��ϼ���(ex:3,4,5-->��)");
		month = Integer.parseInt(sc.nextLine());
		
		switch(month) {
		case 3: case 4: case 5:
			result="��";
			break;
		case 6: case 7: case 8:
			result="����";
			break;
		case 9: case 10: case 11:
			result="����";
			break;
		case 12: case 1: case 2:
			result="�ܿ�";
			break;
		default:
			result="�߸��Է��ϼ˽��ϴ�.";
		}
		System.out.println(result);

	}

}
