package chap04;

import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {
		//////////////////����
		
		int[] numArr = new int[10]; ////0���� �ʱ�ȭ��
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i] =i;
			}
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100;i++) {
			//1.0~9 ������ ���� ���Ѵ�
			
			int a = (int)(Math.random()*10);
			//2.ù��° ���� ������ �ڸ����� �ٲ۴�
			if(a<10) {
			int b = numArr[0];
			numArr[0]=numArr[a];
			numArr[a]=b;}
			System.out.println(Arrays.toString(numArr));
		}
		System.out.println(Arrays.toString(numArr));
	}

}
