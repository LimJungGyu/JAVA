package chap01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		Date today = new Date();  //date에 컨트롤 시프트오 utildate 선택
		Calendar cal = Calendar.getInstance();  
		
		System.out.println(today);
		
		System.out.println(cal);  //배열안에 정보들 들어있다 지역날짜시간등 메소드를 통해 정보 뽑아냄
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");//mm대문자로써야됨
		String d1 = sdf.format(today);//화면에 뿌릴때는 스트링으로 뿌려야됨
		System.out.println(d1);


	}
}
