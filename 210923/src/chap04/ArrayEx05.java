package chap04;

public class ArrayEx05 {

	public static void main(String[] args) {
		int sum = 0;
		float avg =0f;
		
		int[] score = {100,89,66,55,90};
		
		for(int i=0; i<score.length;i++) { /////score.length�� ���ǽ������ϸ� �迭�� �� �߰��ǵ� �������
			sum+=score[i];
			avg=sum/(float)score.length;
		}
		System.out.println(sum);
		System.out.println(avg);
			
	}

}
