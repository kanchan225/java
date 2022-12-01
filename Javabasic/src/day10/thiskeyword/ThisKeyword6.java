package day10.thiskeyword;

public class ThisKeyword6 {
    int variable=95;
	public static void main(String[] args) {
		ThisKeyword6 obj=new ThisKeyword6();
		obj.method(5);
		obj.method();
		System.out.println("Value of Instance variable : "+obj.variable);
	}
	void method(int variable) {
		System.out.println("Value of local variable : "+variable);
		variable=80;
		System.out.println("Value of local variable : "+variable);
		System.out.println("Value of Instance variable : "+this.variable);
		this.variable=variable;
		System.out.println("Value of local variable : "+variable);
		System.out.println("Value of instance variable : "+this.variable);
	}
	void method() {
		int variable=25;
		System.out.println("Value of local variable : "+variable);
		System.out.println("Value of Instance variable : "+this.variable);
		this.variable=variable;
		System.out.println("Value of local variable : "+variable);
		System.out.println("Value of instance variable : "+this.variable);
	}

}
