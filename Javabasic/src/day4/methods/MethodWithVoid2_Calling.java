package day4.methods;

public class MethodWithVoid2_Calling {
	
	static void display() {
        System.out.println("i am display method");
	} 
	
	static void print(char c1) {
		System.out.println("i am print method and printing char as :"+c1);
	}
    static private void call(long num) {
    	System.out.println("i am call method and calling number is :"+num);
    }
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		//calling static method directly using another static method
		display();
		print('A');
		call(123);
		call('a');
		System.out.println("**************passing parameter using variable**************");
		int x=123;
		char c='A';
		print (c);
		call(x);
		

	}

}
