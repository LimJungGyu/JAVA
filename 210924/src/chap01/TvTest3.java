package chap01;

public class TvTest3 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
			
		}

		System.out.println(tvArr[0].channel);
		System.out.println(tvArr[1].channel);
		System.out.println(tvArr[2].channel);
		
		for(int i= 0; i<tvArr.length;i++) {
			tvArr[i].channelUp();
		}
		System.out.println(tvArr[0].channel);
		System.out.println(tvArr[1].channel);
		System.out.println(tvArr[2].channel);
		
	}

}
