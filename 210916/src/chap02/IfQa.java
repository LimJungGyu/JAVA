package chap02;

import java.util.Scanner;

public class IfQa {

	public static void main(String[] args) {
	
	//필요한 변수를 선언 및 초기화
	Scanner sc = new Scanner(System.in);
	
	final int DIST =400;
	int maxSpeed = 0;
	double time =0;
	String result ="";
	
	//정보입력
	System.out.println("자동차 최대속도를 입력하세요>>>");
	maxSpeed =Integer.parseInt(sc.nextLine());
	//처리 1 시간 =거리/속도
	time = DIST/(double)maxSpeed;
	System.out.println(time);
			
	if (time<=2) {System.out.println("high high speed");
				}
	else if (time<=3) {System.out.println("high speed");
	}
	else if (time>=4){System.out.println("good speed");
	}
	//결과
	System.out.println(result);}
	
}
