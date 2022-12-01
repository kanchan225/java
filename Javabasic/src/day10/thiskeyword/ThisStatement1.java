package day10.thiskeyword;

class A1 {
	A1(){
		this(25.35);
		System.out.println("hello zero");
	}
	A1(double d){
		this(25);
		System.out.println("hello double "+d);
	}
	A1(int x){
		System.out.println("hello int "+x);
	}	
}
public class ThisStatement1 {

	public static void main(String[] args) {
		 A1 a1=new A1();
//	      A1 a2=new A1(25.35);
//	      A1 a3=new A1(22);
             //or
		//A1 a =new A1();
	}

}
