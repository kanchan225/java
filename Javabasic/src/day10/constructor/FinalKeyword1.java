package day10.constructor;

public class FinalKeyword1 {
   final static int empId=101;
   final int salary=50000;
   
	public static void main(String[] args) {
		final int age=20;
	
		System.out.println("age: "+age);
		//age=25;----> not possible compilation error will be there
		System.out.println("age: "+age);
		
		System.out.println("SGV empId: "+empId);
		 //empId=151;
		
		FinalKeyword1 f1 = new FinalKeyword1();
		System.out.println("N-SGV salary: "+f1.salary);
		//f1.salary=90000;
	}

}
