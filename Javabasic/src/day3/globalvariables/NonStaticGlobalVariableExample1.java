package day3.globalvariables;

public class NonStaticGlobalVariableExample1 {
	int age;
	boolean result;
	char grade;
	float roi;
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Program Starts");
    NonStaticGlobalVariableExample1 ref1;//object declaration
    ref1 = new NonStaticGlobalVariableExample1();//object creation or initialization
    System.out.println("default Non-static variable age :"+ref1.age);
    System.out.println("default Non-static variable result :"+ref1.result);
    System.out.println("default Non-static variable grade :"+ref1.grade);
    System.out.println("default Non-static variable roi:"+ref1.roi);
    System.out.println(ref1);
	}

}
