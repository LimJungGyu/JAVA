package chap2;

public class Increment {
		int num=0;
		public  void increment() {
			synchronized(this){  //�Ӱ迵���� ���� �ɾ ���û��x
				num++;			//�ϳ��� �۾��ϱ⶧���� �ð��� ��������� �ٸ��۾��� ������ �����ʰ� ������� �۾�
				}
			}	
		public int getNum() {return num;}

}
