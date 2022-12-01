package day4.methods;

public class MethodWithVoid2_Calling2 {
	
    static void display() {
    	System.out.println("I am display method");
    }
    public static void print(char c1) {	
    	System.out.println("I am print method and printing char as:"+c1);
    }	
    static private void call(long num) {
    	System.out.println("I am call method and calling number is :"+num);
    }	
    	public static void main(String[] args) {
    	//calling method using classname
    	MethodWithVoid2_Calling2.display();	
    	MethodWithVoid2_Calling2.print('A');
    	MethodWithVoid2_Calling2.call(123);	
    	System.out.println("******Passing parameter using variable*******");
    	int x=123;// or int num=123
    	char c1='A';//or char grade='A'
    	MethodWithVoid2_Calling2.print(c1);
    	MethodWithVoid2_Calling2.call(x);	
		

	}

}
