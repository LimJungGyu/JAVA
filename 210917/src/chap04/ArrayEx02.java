package chap04;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] array1 =new int[10];
		int[] array2= {20,40,60,80,100};
		char[] array3= {'a','b','c','d'};
		
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		
		
		//1~10������ ������ ���� ����
		for(int i=0; i<array1.length;i++) {
			array1[i]=(int)(Math.random()*10)+1;
			
		}
		///���
		for(int i=0; i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		/////�迭�� Ȯ���ϴ¹�
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		
		
	}

}
