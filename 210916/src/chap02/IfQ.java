package chap02;

import java.util.Scanner;

public class IfQ {

	public static void main(String[] args) {
		//필요한 변수를 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차 최대속도를 입력하세요>>>");
		int speed =Integer.parseInt(sc.nextLine());
		int hours = 400/ speed;
		if (hours<=2) {System.out.println("high high speed");
					}
		else if (hours<=3) {System.out.println("high speed");
		}
		else {System.out.println("good speed");
		}
	}}


