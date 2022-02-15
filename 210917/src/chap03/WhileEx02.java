package chap03;

public class WhileEx02 {

	public static void main(String[] args) {
		
			int sum=0;
			int i = 0;
			
			while(true) {
				sum=sum +i;
				i++;
				System.out.println(sum);
				if(sum>1000)
					break;
			}
			System.out.println("end");
		}

	}


