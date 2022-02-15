package hW;

public class HW2 {

	public static void main(String[] args) {
		int cnt =0;
		int sum =0;
		
		do {
			cnt++;
			sum=sum+cnt;
			if (cnt%10==0)
				System.out.println("1-"+cnt+": "+sum);
			
		}
		while(cnt<=100);
			

	}

}
