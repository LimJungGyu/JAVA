package chap03;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);//�̷��� �����س����� �⺻�� null�� �ƴ϶�
	}								// this ���� ���� ����
	
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(Car c){                //�ν��Ͻ� ���� 
		color=c.color;
		gearType = c.gearType;
		door = c.door;
	}
	String showCarInfo() {
		return "color: "+color+"\ngeartype :"+gearType+"\ndoor:"+door;
	}

}
