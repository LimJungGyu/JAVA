package hW;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		int input = 0;
		int result = 0;
		int cnt =8;
		System.out.println("숫자를 입력하세요.");
		input = Integer.parseInt(sc.nextLine());
		System.out.println("사용자 입력: "+input);
		System.out.println("** "+input+"단 **");
		do {
			result=(cnt)*input;
			System.out.println(cnt+" * "+input+" = "+result);
			cnt=cnt-2;
		}while(cnt>=2);
			

	}

}
