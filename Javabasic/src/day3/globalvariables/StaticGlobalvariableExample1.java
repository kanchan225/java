package day3.globalvariables;

public class StaticGlobalvariableExample1 {
   //static global variable
	static int age;
	static boolean result;
	static char grade;
	static float roi;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("default value of age is :"+age);
		System.out.println("default value of result is :"+result);
		System.out.println("default value of grade is :"+grade);
		System.out.println("default value of roi is :"+roi);
		System.out.println("******************************************");
		//initialization of static global variable
		age=26;
		result=true;
		grade='A';
		roi=5.5f;
		System.out.println("Updated value of age is :"+age);
		System.out.println("Updated value of result is :"+result);
		System.out.println("Updated value of grade is :"+grade);
		System.out.println("Updated value of roi is :"+roi);		
		System.out.println("******************************************");
	}

}
