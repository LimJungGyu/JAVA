package chap04;

import java.util.Arrays;

public class ArrayEx09 {

	public static void main(String[] args) {
		int[] code = {-4,-1,3,6,11};
		int[] arr = new int[10];
		
		//arr�迭�� code�迭�� ������ ������ �ʱ�ȭ �ϼ���.
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*5);  //0~4 ������ ��
			arr[i]= code[r];
		}
		System.out.println(Arrays.toString(arr));
	}

}
