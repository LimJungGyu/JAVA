package chap5;

public class EnumTest {

	public static void main(String[] args) {
		int kind;
		kind = 10;
		
		Kind k;
		k =Kind.DIAMOND;
		
		int value =1000;
		Value v;
		v= Value.THREE;
		
		System.out.println(k);
		System.out.println(v.ordinal());
		
	}

}
