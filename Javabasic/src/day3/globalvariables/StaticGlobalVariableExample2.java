package day3.globalvariables;

public class StaticGlobalVariableExample2 {
	static int age;
	static boolean result;
	static char grade;
	static float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("default value age of is:"+StaticGlobalVariableExample2.age);
    System.out.println("default value of result is:"+StaticGlobalVariableExample2.result);
    System.out.println("default value of grade is:"+StaticGlobalVariableExample2.grade);
    System.out.println("default value of roi is:"+StaticGlobalVariableExample2.roi);
    System.out.println("***************************************************************");
    StaticGlobalVariableExample2.age=26;
    StaticGlobalVariableExample2.result=false;
    StaticGlobalVariableExample2.grade='A';
    StaticGlobalVariableExample2.roi=6;
    System.out.println("Updated value age of is:"+age);
    System.out.println("Updated value of result is:"+StaticGlobalVariableExample2.result);
    System.out.println("Updated value of grade is:"+StaticGlobalVariableExample2.grade);
    System.out.println("Updated value of roi is:"+StaticGlobalVariableExample2.roi);
    
	}

}
