package day10.thiskeyword;

public class ThisKeyword7 {
    int age;
    void call() {
    	System.out.println("I am call method");
    }
    void m(int age) {
    	System.out.println("local age :"+age);
    	System.out.println("Global age :" +this.age);
    	this.call(); //or call()
    	System.out.println("this keyword value is:"+this);
    }
	public static void main(String[] args) {
		ThisKeyword7 obj=new ThisKeyword7();
		System.out.println("object obj value is:"+obj);
		obj.m(25);
		

	}

}
