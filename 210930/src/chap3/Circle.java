package chap3;

public class Circle extends Shape{
	///��������ʰ� is a /has a �� �����ؼ� ��ӹ����� ����
	Point center;
	
	int r;
	
	Circle(){
		center =new Point(0,0);         //////�ϳ�
		r=100;
	
	}
	Circle(Point center, int r){         //////�� �� �����ؼ� ���
		this.center = center;
		this.r = r;
	}
	@Override
	void draw() {
		System.out.printf("[center=(%d,%d)],r=%d,color=%s]%n",center.x,center.y,r,color);
		
	}
	}
	
