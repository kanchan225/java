package day22.WrapperClass;

public class ExceptionHandling8 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside the try block");
			int data =25/5;
			//System.exit(0);
			System.out.println(data);
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println("Inside the finally block");
			int k=10/0;
			System.out.println("finally block is always executed");
		}
		System.out.println("Rest of the code");
	}

}
