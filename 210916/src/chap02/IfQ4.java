package chap02;

import java.util.Scanner;

public class IfQ4 {

	public static void main(String[] args) {
	
		
	Scanner sc =new Scanner(System.in);
	
	int a=0;
	int b=0;
	String result = "";
	
	System.out.println("���� �Է��ϼ���>>>>");
	a = Integer.parseInt(sc.nextLine());
	System.out.println("���� �Է��ϼ���>>>>");
	b = Integer.parseInt(sc.nextLine());
	
	if((a%2==0 && b%2==0) || (a%2==1 && b%2==1)) {result="��� ¦���ų� ��� Ȧ�� �Դϴ�";}
	
	System.out.println(result);
	}

}
