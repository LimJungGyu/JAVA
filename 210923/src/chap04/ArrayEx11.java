package chap04;

import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr = new int [10];
		
		for(int i = 0; i <numArr.length ; i++) {
			numArr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println();
		
		for(int j=0; j<numArr.length-1;j++) {
			boolean changed = false;
			
			for(int i= 0; i<numArr.length-1-j;i++) {
				if(numArr[i]>numArr[i+1]) {
					int tmp = numArr[i];
					numArr[i]=numArr[i+1];
					numArr[i+1]=tmp;
					changed = true;
				}
			}
			System.out.println(Arrays.toString(numArr));
			if(!changed) break;
		}
	}
}