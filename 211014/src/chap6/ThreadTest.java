package chap6;

public class ThreadTest {

	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("����������");
		ShowThread st2 = new ShowThread("���۾�����");
		
		st1.start();//���� st1���ϰ�
		st2.start(); //st2�� �����ؾ������� �� ���ÿ� �����Ѵ�
		
		//st1.run();  //
		//st2.run();	
	}

}
