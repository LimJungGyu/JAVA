package chap04;

import java.util.Arrays;

public class ArrayEx08 {

	public static void main(String[] args) {
		int[] ball= new int [45];
		
		//���迭�� 1~45 �ʱ�ȭ
		for(int i=0; i<ball.length;i++) {
			ball[i] =i++;
			}
		//0~44 ������ ������ �ڸ����� ���ѵ� 
		//�迭�� 0~5���� ���ڿ� ���ʷ� �����ÿ�
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
