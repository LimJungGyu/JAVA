package hW;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		String result = "";
		
		do {
			System.out.println("���� �����ϴ� ����(����:0)");
			input = Integer.parseInt(sc.nextLine());
			
			if ((input>=3 && input<= 5)){result ="��";}
			else if ((input>=6 && input<= 8)){result ="����";}
			else if ((input>=9 && input<= 11)){result ="����";}
			else if((input==12||input==1||input==2)){result ="�ܿ�";}
			else	{result="�߸��Է��ϼ˽��ϴ�.";}
			System.out.println("****** "+input+"�� ******");
			System.out.println(input+"���� "+result+"�� �ش�˴ϴ�");
			
		}while(input!=0);
		System.out.println("����");

	}

}
