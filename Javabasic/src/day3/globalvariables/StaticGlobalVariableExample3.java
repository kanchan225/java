package day3.globalvariables;

public class StaticGlobalVariableExample3 {
	static int age=25;
	static boolean result;
	static char grade='A';
	static float roi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Value of age is :"+StaticGlobalVariableExample3.age);
    System.out.println("Default Value of result is :"+StaticGlobalVariableExample3.result);
    System.out.println("Value of grade is :"+StaticGlobalVariableExample3.grade);
    System.out.println("Default Value of roi is :"+StaticGlobalVariableExample3.roi);
    System.out.println("************************************************************");
    age=35;
    result=true;
    grade='B';
    roi=5.5f;
    System.out.println("Updated value of age is :"+age);
    System.out.println("Updated value of result is :"+result);
    System.out.println("Updated value of grade is :"+grade);
    System.out.println("Updated value of roi is :"+roi);
	}

}
