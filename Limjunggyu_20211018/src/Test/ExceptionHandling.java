package Test;

public class ExceptionHandling extends Exception{
	int error;
	
	public ExceptionHandling(int choice){
		super("�߸��Է��ϼ˽��ϴ�");
		error = choice;
		}
	public void showWrongChoice() {
		System.out.println(error+"�� �ش��ϴ� �޴��� ���������ʽ��ϴ�");
		
		
	}
}

