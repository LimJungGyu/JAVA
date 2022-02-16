package chap04;

public class CaptionTv extends Tv{
	int caption;
	
	void caption() {
		if (caption==1) System.out.println("한국어");
		else if (caption==2) System.out.println("english");
		else if (caption==3) System.out.println("japaness");
		else System.out.println("1=한국어.2=english,3=japaness");
		}
	}


