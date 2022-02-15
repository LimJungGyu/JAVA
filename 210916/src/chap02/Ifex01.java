package chap02;

import java.util.Scanner;

public class Ifex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade ="";
		char opt='0';
		
		System.out.println("성적을 입력하세요(0~100)>>>");
		int score =Integer.parseInt(sc.nextLine());
		
		if(score>=90) {
			grade = "A";
			if(score>97) {
				opt='+';}
			else if(score<94) {
					opt='-';		
			}
		}
		else if(score>=80){
			grade ="B";
			if(score>87) {
				opt='+';}
			else if(score<84) {
				opt='-';		
		}
			}
		
		else if(score>=70){
			grade ="C";
			if(score>77) {
				opt='+';}
			else if(score<74) {
				opt='-';}
			}
		
		else if(score>=50){
			grade ="D";
			if(score>57) {
				opt='+';}
			else if(score<54) {
				opt='-';}
			} 
		else {
			grade ="F";
		}
		System.out.println("당신의 학점은 "+ grade+opt);
	}
}