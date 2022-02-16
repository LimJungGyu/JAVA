package chap04;

import java.util.Arrays;

public class ArrayEx09 {

	public static void main(String[] args) {
		int[] code = {-4,-1,3,6,11};
		int[] arr = new int[10];
		
		//arr배열을 code배열의 임의의 값으로 초기화 하세요.
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*5);  //0~4 임의의 수
			arr[i]= code[r];
		}
		System.out.println(Arrays.toString(arr));
	}

}
