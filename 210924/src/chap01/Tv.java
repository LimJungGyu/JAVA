package chap01;

public class Tv {
	String color; //=null      //////////�ν��Ͻ����� (��������:Grobal)
	boolean power; //=false
	int channel; //=0
	static int size;       ////////Ŭ��������,����ƽ����,��������,�������� (�����̱⵵��)
	
	//����Ÿ�� �޼ҵ��̸�(String name, int age)(�Ű�����) {ó���� �ڵ�}
	void power() {
		power=!power; //toggle ����(�ݴ����)
	}
	void channelUp() {
		int cnt = 0; /////////�������� (Local)
		channel++;
	}
	void channelDown() {
		int cnt = 0; ///////////���� ���������� �ߺ��ƴϴ�
		channel--;
	}
	
}
