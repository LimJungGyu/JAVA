package chap04;

public class ArrayEx06 {
////�ִ밪 �ּҰ� ���ϱ�
	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		int max=0,min=0;
		max=min=score[0];
		
		for(int i=0;i<score.length;i++) {
			if(max<score[i]) max=score[i];
			if(min>score[i]) min=score[i];
			
		}
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�"+min);

}
}