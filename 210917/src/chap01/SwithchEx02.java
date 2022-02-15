package chap01;

import java.util.Scanner;

public class SwithchEx02 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String grade ="";
			char opt='0';
			
			System.out.println("성적을 입력하세요(0~100)>>>");
			int score =Integer.parseInt(sc.nextLine());
			
			switch(score/10)
			{case 10: case 9:
			grade= "A";
			break;
			
			case 8:
			grade="B";
			break;
			
			case 7:
				grade="C";
				break;
				
			case 6:
				grade="D";
				break;
			default:
				grade="F";
				
			}	
			}
			
	}
		