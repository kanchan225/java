package day4.methods;

public class NSMethod_Void1 {
    int age ;
    public void display() {
    	System.out.println("I am display() of NSMethod_Void1 class and age value is :"+age);
    }
    public void display(int a) {
    	age=a;
    	System.out.println("I am display() of NSMethod_Void1 class and age value is :"+age);
    }
	public static void main(String[] args) {
		NSMethod_Void1 m1=new NSMethod_Void1();
		System.out.println("age:"+m1.age);
		m1.display();
		m1.display(25);
		System.out.println("age:"+m1.age);
		
		NSMethod_Void1 m2=new NSMethod_Void1();
		System.out.println("age:"+m2.age);
		m2.display(75);
		System.out.println("age:"+m2.age);
		m2.display();
		
	}

}
