package chap7;

public class Marine extends GroundUnit {
	Marine(){
		super(40);
		hitPoint =MAX_HP;
	}
	@Override
	public String toString(){
		return "Marine";
	}

}
