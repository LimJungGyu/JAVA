package chap3;

public class ThreadWaitEx1 {

	public static void main(String[] args)throws Exception{
		Table table = new Table(); //���������尡 �����ϴ� ��ü
		new Thread(new Cook(table),"COOK1").start();
		new Thread(new Customer(table,"donut"),"CUST1").start();
		new Thread(new Customer(table,"burger"),"CUST2").start();

		Thread.sleep(1000); //0.5 �� �� ���� �����Ų��
		System.exit(0);//���α׷� ��ü�� ����(��� �����尡 �����)
	}

}
