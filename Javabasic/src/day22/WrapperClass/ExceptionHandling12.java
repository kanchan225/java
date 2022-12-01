package day22.WrapperClass;

public class ExceptionHandling12 {
	public static void validateAge(int age) throws UserDefinedException   {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new UserDefinedException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	public static void main(String[] args) throws UserDefinedException {
		System.out.println("I am main of ExceptionHandling12");	
		System.out.println("Hello");
		validateAge(15);
			
			System.out.println("Rest of the code..");
   }
}
