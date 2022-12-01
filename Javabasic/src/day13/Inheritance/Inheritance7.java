package day13.Inheritance;
class fruits{
	int fruitAge;
	fruits(){
		System.out.println("fruit class constructor");
		fruitAge=7;
	}
	public void taste() {
		System.out.println("fruit are sweet");
	}
}
class orange extends fruits{
	int fruitAge;
	orange(){
		System.out.println("orange class constructor");
		fruitAge=5;
	}
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("orange fruitage: "+fruitAge);
		System.out.println("fruits fruitage: "+super.fruitAge);
		taste(); //calling orange class taste method
		super.taste();//calling fruit class taste method
	}
}

public class Inheritance7 {

	public static void main(String[] args) {
		orange o=new orange();
		o.shape();
		

	}

}
