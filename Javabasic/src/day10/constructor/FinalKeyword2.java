package day10.constructor;

public class FinalKeyword2 {

	final int speedlimit;
	
	FinalKeyword2() {
		speedlimit=70;
	   // System.out.println("SpeedLimit : " +speedlimit);
	}
	
	public static void main(String[] args) {
		FinalKeyword2 f1=new FinalKeyword2();
		System.out.println("SpeedLimit : " +f1.speedlimit);

	}

}
