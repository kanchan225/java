package day21.ScannerAndStringClass;
import java.util.Scanner;
public class ScannerClass1 {

	public static void main(String[] args) {
		String s="Hello, This is BasicJava";
		Scanner scan=new Scanner(s);
        //check if the scanner has a token;
		 System.out.println("Boolean Result: "+scan.hasNext());
		//print the string
		 //System.out.println("String: "+scan.next());
		 //System.out.println("String: "+scan.next());
		 System.out.println("String: "+scan.nextLine());
		 scan.close();
		 System.out.println("-----Enter Your Details-----");
		 Scanner in=new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name=in.next();
         System.out.println("Name: "+name);
         System.out.print("Enter your age: ");
         int i=in.nextInt();
         System.out.println("Age: "+i);
         System.out.print("Enter your salary: ");
         double salary=in.nextDouble();
         System.out.println("Salary: "+salary);
         in.close();
	}

}
