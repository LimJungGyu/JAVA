package chap08;

public class Tv {
	String color ;  //�ν��Ͻ����� (��������:Grobal)
	boolean power;
	int channel;
	int size;   //Ŭ��������, ����ƽ����, ����, ��������
	
	
	// ����Ÿ�� �޼ҵ��̸�(String name, int age) {ó���� �ڵ�}
	void power() {
		power = !power;  //toggle
	}
	void channelUp() {
		int cnt = 0; //��������
		
		channel++;
	}
	void channelDown() {
	    int cnt = 10;   //�������� (Local)
		channel--;
	}
}
