package chap06;

public class StringEx1 {

	public static void main(String[] args) {
		///��Ʈ���� ����µ� 2���� ��� "",new string�� �ִµ�
		//""�� ����� ���ڿ� ���ͷ��� ����ǰ� �� ��ü�� �� �ּҸ� ������
		//�̹� ������ �� �ּҸ� ���� ��ü�� ������ ��������� �ϳ��� ���ͷ��� ����
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1==str2?" + (str1 ==str2));
		System.out.println("str1.eqauls(str2)?"+str1.equals(str2));
		System.out.println();
		
		////new string���� ����� new�����ڿ� ���� �޸��Ҵ� �̷����
		///�׻� ���ο� string�ν��Ͻ��� ������ ��������� ������ ���ͷ� ����
		//�׷��Ƿ� ��񱳿����ڷ� ���ϸ� �ּҰ��� �ٸ��⶧���� �ٸ��ٰ� ������
		//equals�� ���ϸ� string�� ��� ���ͷ��� �ڵ���ȯ�Ͽ� ���ϱ⶧���� ���ٶ�� ����
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3 = \"abc\";");
		System.out.println("String str4 = \"abc\";");
		
		System.out.println("str3==str4?" + (str3 ==str4));
		System.out.println("str3.eqauls(str4)?"+str3.equals(str4));
		System.out.println();
		
	}

}
