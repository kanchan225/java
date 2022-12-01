package day22.WrapperClass;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Program starts from here...");
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=scn.nextInt();
		int[] empIds=new int[size];
		try {
			System.out.println("*******You are inside try block*********");
			System.out.println(empIds[3]);//ArrayIndexOutOfBoundsException
			System.out.println("*******Try block ends here********");
		} catch(Throwable e) {
			System.out.println("******Catch block starts from here*********");
			System.out.println("Exception object: "+e);
			System.out.println("Exception detail by printStackTrace: ");
			e.printStackTrace();
			System.out.println("With getMessage: "+e.getMessage());
			System.out.println("******Catch block ends here*********");
		}
		System.out.println("Program ends here...");
	}

}
