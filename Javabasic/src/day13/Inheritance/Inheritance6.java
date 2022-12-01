package day13.Inheritance;
class Grandfather {
	Grandfather(){
		System.out.println("I am Class Grandfather Constructor");
	}
	void myHome() {
		System.out.println("I am home of Grandfather ");
	}
}
class Father extends Grandfather {
	Father(double d){
		System.out.println("I am Class father Constructor");
	}
	void myCar() {
		System.out.println("I am car of father ");
	}
}
class child extends Father {
	child(int i){
		super(12.34);
		System.out.println("I am Class child Constructor");
	}
	void myBike() {
		System.out.println("I am bike of child ");
	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		child c=new child(21);
		c.myHome();
		c.myCar();
		c.myBike();
		
		//creating an object or instance of child class and referred by its parent class
		Father f=c;//or Father f1 = new child(21);(home , car is accessible but bike will not be accessible to father)
		f.myHome();
		f.myCar();
		//f.myBike();
		Father f1=new child(21);
		f1.myHome();
		f1.myCar();
		//creating an object or instance of child class and referred by its parent class
		Grandfather g=c;//or Grandfather g = new child(21);(home is accessible but car, bike will not be accessible to Grandfather)
				g.myHome();
				//g.myCar();
		Grandfather g1 = new child(21);		
		//or		
        Grandfather g2=f;//or GrandFather g2=new Father(33.6);(home is accessible but car, bike will not be accessible to Grandfather)
        g2.myHome();
	}

}
