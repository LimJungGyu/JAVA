package hW;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		int input = 0;
		int result = 0;
		int cnt =8;
		System.out.println("���ڸ� �Է��ϼ���.");
		input = Integer.parseInt(sc.nextLine());
		System.out.println("����� �Է�: "+input);
		System.out.println("** "+input+"�� **");
		do {
			result=(cnt)*input;
			System.out.println(cnt+" * "+input+" = "+result);
			cnt=cnt-2;
		}while(cnt>=2);
			

	}

}
