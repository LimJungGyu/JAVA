package chap04;

public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		///주소값으로 비교하기때문에 다르다고 나옴
		////스트링의 equals를 생각하면 안된다. 스트링의 이퀄스는 스트링으로 변환시켜서 비교하기때문
		
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다");
		else
			System.out.println("v1과 v2는 다릅니다");
		v2=v1;
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다");
		else
			System.out.println("v1과 v2는 다릅니다");
	}
}
	


