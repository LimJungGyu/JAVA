package chap02;

public class ForEx01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum=sum+i;
			System.out.println("i:"+i+" sum:"+sum);
		}
		System.out.println(sum);
		//////////////////////////////////////////////
		int sum1 = 0;
		for(int i=1; i<=10; i=i+2) { //¦���� ���� ���ϴ¹�
			sum1=sum1+i;
			System.out.println("i:"+i+" sum1:"+sum1);
		}
		System.out.println(sum1);
		
		//////////////////////////////////////������ 2��
		for (int i=1; i<10; i++) {
			System.out.println("2*"+i +"="+2*i);
		}
		//////////////////////////////////////////////////
		for (int i=2; i<10; i++) {
			for(int j=1;j<10; j++) {
				System.out.printf("%d*%d=%d%n",i,j,i*j);}}
		/////////////////////////////////////////�����
		for (int j=0; j<10; j++) {
		for (int i=0; i<10; i++) {
			System.out.print("*");
		}
		System.out.println();
	    }
		/////////////////////////////////////����� ���
		for (int i=1; i<=5; i=i+1) {
			for	(int j=1; j<=i; j++) {
			System.out.print("*");}
			System.out.println();}
		//////////////////////////////////////����� ����
		for (int i=1; i<=5; i=i+1) {
			for	(int j=5; j>=i; j--) {
			System.out.print("*");}
			System.out.println();}
			
		}
	
}
