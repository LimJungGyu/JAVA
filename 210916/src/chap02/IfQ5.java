package chap02;

import java.util.Scanner;

public class IfQ5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sex = "" ;
		int		score = 0;
		String result = "";
	    
		System.out.println("�����̸� ���� �����̸� ���� �� �Է��ϼ���");
	    sex = (sc.nextLine());
	    System.out.println("���ͼ����� �Է��ϼ���");
	    score = Integer.parseInt(sc.nextLine());
	    
	    if ((sex.equals("����") && score>=800)||(sex.equals("����") && score>=700)){
	    	result="�װ� �¹��� ���� �ڰ� �������Դϴ�";
	    }
	    else {result="�װ� �¹��� ���� �ڰ� �Ұ������Դϴ�";}
	    
	    System.out.println(result);	
		
		

	}

}
