package chap04;

import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		int [] numArr = {3,1,4,2,0};
		
		for(int j=0; j<numArr.length-1;j++) {
			for(int i= 0; i<numArr.length-1;i++) {
				if(numArr[i]>numArr[i+1]) {
					int tmp = numArr[i];
					numArr[i]=numArr[i+1];
					numArr[i+1]=tmp;
					
					}
			}System.out.println(Arrays.toString(numArr));
		}
	}
}
