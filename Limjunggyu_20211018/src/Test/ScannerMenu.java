package Test;

import java.util.Scanner;

public class ScannerMenu {
	public static Scanner scan=new Scanner(System.in);
	
	public static void showMenu()
	{
		
		System.out.println("메뉴를 선택하세요");
		System.out.println("1 = 입력");
		System.out.println("2 = 조회");
		System.out.println("3 = 수정");
		System.out.println("4 = 삭제");
		System.out.println("5 = 리스트출력");
		System.out.println("6 = 종료");
		System.out.print("선택: ");
	}

}
