package day10.thiskeyword;

public class ThisKeyword3 {
	int a;
	int b;
	ThisKeyword3(int a, int b) {
		System.out.println("local variable a: "+a);
		System.out.println("local variable b: "+b);
		System.out.println("Initial global variable a: "+this.a);
		System.out.println("Initial global variable b: "+this.b);
		this.a=a;
		this.b=b;
		System.out.println("updated global variable a: "+this.a);
		System.out.println("updated global variable b: "+this.b);
	}
	void display() {
		System.out.println("a = "+a + " b = "+b);
	}
	
	public static void main(String[] args) {
		ThisKeyword3 obj=new ThisKeyword3(15, 40);
		obj.display();
		System.out.println(obj.a+ " " +obj.b);

		ThisKeyword3 obj2=new ThisKeyword3(120, 240);
		obj2.display();
		System.out.println(obj2.a+ " " +obj2.b);

	}

}
