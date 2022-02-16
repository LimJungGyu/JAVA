package chap04;

public class CaptionTvA extends Tv {//파일 만들때 super~에 browser눌러서 tv치면 직접 치지 않아도 됨
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
