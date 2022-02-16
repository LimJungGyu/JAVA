package chap04;

import java.util.HashSet;

public class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(true);
		set.add(new Boolean(true));
		set.add(new Person("David",10)); //중복처리 안됨
		set.add(new Person("David",10)); //둘이 해쉬코드값이 다름
		
		System.out.println(set);
	}

}