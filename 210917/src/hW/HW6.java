package hW;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		String result = "";
		
		do {
			System.out.println("가장 좋아하는 월은(종료:0)");
			input = Integer.parseInt(sc.nextLine());
			
			if ((input>=3 && input<= 5)){result ="봄";}
			else if ((input>=6 && input<= 8)){result ="여름";}
			else if ((input>=9 && input<= 11)){result ="가을";}
			else if((input==12||input==1||input==2)){result ="겨울";}
			else	{result="잘못입력하셧습니다.";}
			System.out.println("****** "+input+"월 ******");
			System.out.println(input+"월은 "+result+"에 해당됩니다");
			
		}while(input!=0);
		System.out.println("종료");

	}

}
