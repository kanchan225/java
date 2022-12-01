package day22.WrapperClass;

public class ExceptionHandling7 {

	public static void main(String[] args) {
		System.out.println("Program starts from here...");
		try {
			int data=25/0;
			System.out.println(data);
		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Exception Handled...");
//		}
		catch(ArithmeticException e){
			System.out.println("Exception Handled... ");
			System.out.println(e);
		}
        finally { 
        	System.out.println("finally block is always  executed");
        }
		System.out.println("Rest of the code...");
	}

}
