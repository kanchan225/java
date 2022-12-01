package day3.globalvariables;

public class NonStaticGlobalVariableExample3 {
    int age;
    boolean result;
    char grade;
    float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Program starts");
    NonStaticGlobalVariableExample3 ref1 = new NonStaticGlobalVariableExample3();
    System.out.println("default non-staic variable age is :"+ref1.age);
    System.out.println("default non-staic variable result is :"+ref1.result);
    System.out.println("default non-staic variable grade is :"+ref1.grade);
    System.out.println("default non-staic variable roi is :"+ref1.roi);
    System.out.println("**************Updating non-static varible***********");
    ref1.age=30;
    ref1.result=true;
    ref1.grade='A';
    ref1.roi=5;
    System.out.println("Updated non-staic variable age is :"+ref1.age);
    System.out.println("Updated non-staic variable result is :"+ref1.result);
    System.out.println("Updated non-staic variable grade is :"+ref1.grade);
    System.out.println("Updated non-staic variable roi is :"+ref1.roi);
    System.out.println("*************New Instance Created*********************");
    NonStaticGlobalVariableExample3 ref2 = new NonStaticGlobalVariableExample3();
    System.out.println("default  with ref2 non-staic variable age is :"+ref2.age);
    System.out.println("default  with ref2 non-staic variable result is :"+ref2.result);
    System.out.println("default  with ref2 non-staic variable grade is :"+ref2.grade);
    System.out.println("default  with ref2 non-staic variable roi is :"+ref2.roi);
    ref1.age=ref2.age;
    System.out.println("default  with ref2 non-staic variable age is :"+ref1.age);
	}

}
