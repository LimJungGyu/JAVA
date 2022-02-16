package chap06;

public class StringEx1 {

	public static void main(String[] args) {
		///스트링은 만드는데 2가지 방법 "",new string이 있는데
		//""로 만들면 문자열 리터럴로 저장되고 각 객체가 그 주소를 저장함
		//이미 있으면 그 주소를 다음 객체도 가져감 결과적으로 하나의 리터럴을 공유
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1==str2?" + (str1 ==str2));
		System.out.println("str1.eqauls(str2)?"+str1.equals(str2));
		System.out.println();
		
		////new string으로 만들면 new연산자에 의해 메모리할당 이루어짐
		///항상 새로운 string인스턴스가 생성됨 결과적으로 각각의 리터럴 존재
		//그러므로 등가비교연산자로 비교하면 주소값이 다르기때문에 다르다고 나오고
		//equals를 통하면 string의 경우 리터럴로 자동변환하여 비교하기때문에 같다라고 나옴
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3 = \"abc\";");
		System.out.println("String str4 = \"abc\";");
		
		System.out.println("str3==str4?" + (str3 ==str4));
		System.out.println("str3.eqauls(str4)?"+str3.equals(str4));
		System.out.println();
		
	}

}
