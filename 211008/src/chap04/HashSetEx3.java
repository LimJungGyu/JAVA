package chap04;

import java.util.HashSet;

public class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(true);
		set.add(new Boolean(true));
		set.add(new Person("David",10)); //�ߺ�ó�� �ȵ�
		set.add(new Person("David",10)); //���� �ؽ��ڵ尪�� �ٸ�
		
		System.out.println(set);
	}

}