package day13.Inheritance;
class fourwheeler{
	public void wheels() {
		System.out.println("I have 4 wheels");
	}		
}
class car extends fourwheeler{
	public void type() {
		System.out.println("I am car");
	}		
}
class maruti extends car{
	public void company() {
		System.out.println("I' am maruti");
	}		
}
public class Inheritance3 {

	public static void main(String[] args) {
		maruti m1= new maruti();
		m1.wheels();
		m1.type();
		m1.company();
		

	}

}
