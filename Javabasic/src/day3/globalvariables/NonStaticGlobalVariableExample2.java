package day3.globalvariables;

public class NonStaticGlobalVariableExample2 {
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
    System.out.println("********Updating Non Static Variables************");
    ref1.age=26;
    ref1.result=true;
    ref1.grade='A';
    ref1.roi=6.5f;
    System.out.println("Updated Non-static variable age :"+ref1.age);
    System.out.println("Updated Non-static variable result :"+ref1.result);
    System.out.println("updated Non-static variable grade :"+ref1.grade);
    System.out.println("Updated Non-static variable roi:"+ref1.roi);
    
    
    
	}

}
