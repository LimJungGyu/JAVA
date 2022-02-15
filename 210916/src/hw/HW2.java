package hw;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 0;
		int hour=0;
		double payment=0;
		double discount=0;
		System.out.println("구입한 물건값을 입력하세요");
		price = Integer.parseInt(sc.nextLine());
		System.out.println("구입한 시간을 24시로 입력하세요");
		hour = Integer.parseInt(sc.nextLine());
		
		if ((hour>0)||(hour<12)) {discount=0.05;
				payment=price-(price*discount);
		}
		else {discount=0.025;
		payment=price-(price*discount);
		}
		System.out.println("구입시간"+hour+"시");
		System.out.println("총구입금액"+price+"원");
		System.out.println("실제구입금액"+(int)payment+"원");
	}

}
