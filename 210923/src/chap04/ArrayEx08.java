package chap04;

import java.util.Arrays;

public class ArrayEx08 {

	public static void main(String[] args) {
		int[] ball= new int [45];
		
		//공배열의 1~45 초기화
		for(int i=0; i<ball.length;i++) {
			ball[i] =i++;
			}
		//0~44 사이의 임의의 자릿수를 구한뒤 
		//배열의 0~5까지 숫자와 차례로 섞으시오
		for(int i=0; i<6;i++) {
			int r = (int)(Math.random()*45); //0~44
			int tmp =ball[i];
			ball[i]=ball[r];
			ball[r]=tmp;
			
			System.out.println(Arrays.toString(ball));
		}
		for(int i=0; i<6;i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}
			
	}

}
