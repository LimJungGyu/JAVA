package chap02;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day =0;
		String result = "";
		
	
		System.out.println("1~7�� �Է��ϼ���(ex:1-->������)");
		day = Integer.parseInt(sc.nextLine());
		
		switch(day) {
			case 1:
				result="������";
				break;
			case 2:
				result="ȭ����";
				break;
			case 3:
				result="������";
				break;
			case 4:
				result="�����";
				break;
			case 5:
				result="�ݿ���";
				break;
			case 6:
				result="�����";
				break;
			case 7:
				result="�Ͽ���";
				break;
			default:
				result="�߸��Է��ϼ˽��ϴ�.";
		}
		System.out.println(result);
	}

}
