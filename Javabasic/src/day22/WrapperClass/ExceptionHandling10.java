package day22.WrapperClass;
//Throwing Unchecked Exception
public class ExceptionHandling10 {
    //function to check if person is elligible to vote or not
	public static void validateAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not elligible to vote");
		}else {
			System.out.println("Person is elligible to vote");
		}
	}
	public static void main(String[] args) {
		// Without handling Exception:
	  // validateAge(13);
		
		//handling exception, calling the function
		try {
			validateAge(13);
		}catch(ArithmeticException e) {
		    System.out.println("Exception handled....");
		    System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
