package chap03;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);//이렇게 세팅해놓으면 기본값 null이 아니라
	}								// this 안의 값이 들어간다
	
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(Car c){                //인스턴스 복사 
		color=c.color;
		gearType = c.gearType;
		door = c.door;
	}
	String showCarInfo() {
		return "color: "+color+"\ngeartype :"+gearType+"\ndoor:"+door;
	}

}
