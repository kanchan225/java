package day13.Inheritance;
class fruit{
    fruit(){
		System.out.println("fruit class constructor");
	}
	public void taste() {
		System.out.println("fruits are sweet");
	}
}
class apple extends fruit{
	apple(){
		super();// if we don't write this then java compiler will write by default super() statement
		System.out.println("apple class constructor");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		apple obj=new apple(); //object of child class
		obj.taste();
		obj.shape();

	}

}
