package chap04;

import java.util.Arrays;

public class ArrayEx12 {
       /////////각 자릿의 개수 몇개 (빈도수)
	public static void main(String[] args) {
		int[] numArr = new int [10];
		int[] counter = new int [10];
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i] = (int)(Math.random()*10);
			}
		
		for(int i=0; i<numArr.length;i++) {
			counter[numArr[i]]++;
		}
		
		System.out.println(Arrays.toString(numArr));
		System.out.println(Arrays.toString(counter));
		
		for(int i=0; i<counter.length;i++) {
			System.out.println(i+"의 개수 : "+ counter[i]);
		}
	}

}
