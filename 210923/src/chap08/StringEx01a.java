package chap08;

public class StringEx01a {

	public static void main(String[] args) {
		String name1 = "abc";              //소문자
		String name2= new String("abc"); ///
		String name3 = "ABC";        ////대문자 비교
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		
		System.out.println(name1.equalsIgnoreCase(name3)); 
		//이퀄스 이그노어 케이스를 통해 대소문자 구분 하지 않기
		

	}

}
