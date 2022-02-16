package chap06;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		int[] arr2 = new int [arr.length];
		for (int i = 0; i<arr.length; i++) {
			arr2[i] =arr[i];
		}
		
		int[] arrClone = arr.clone();
		arrClone[0]=6;
		
		int[] arr3 = new int[arr.length];
		System.arraycopy(arr, 2, arr3, 0, 5);  //(어디껄,몇번째부터,어디에,몇번째부터,
		//원하는대로 복사 . 복제x
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arrClone));
	
	}

}
