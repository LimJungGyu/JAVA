package chap01;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int month = 0;
		String result ="";
		
		System.out.println("1~12�� �Է��ϼ���(ex:3,4,5-->��)");
		month = Integer.parseInt(sc.nextLine());
		
		if ((month>=3 && month<= 5)){result ="��";}
		else if ((month>=6 && month<= 8)){result ="����";}
		else if ((month>=9 && month<= 11)){result ="����";}
		else if((month==12||month==1||month==2)){result ="�ܿ�";}
		else	{result="�߸��Է��ϼ˽��ϴ�.";}
		
		System.out.println(result);
	}
		
		

	}


