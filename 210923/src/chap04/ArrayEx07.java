package chap04;

import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {
		//////////////////섞기
		
		int[] numArr = new int[10]; ////0으로 초기화됨
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i] =i;
			}
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100;i++) {
			//1.0~9 임의의 수를 구한다
			
			int a = (int)(Math.random()*10);
			//2.첫번째 수와 임의의 자리수를 바꾼다
			if(a<10) {
			int b = numArr[0];
			numArr[0]=numArr[a];
			numArr[a]=b;}
			System.out.println(Arrays.toString(numArr));
		}
		System.out.println(Arrays.toString(numArr));
	}

}
