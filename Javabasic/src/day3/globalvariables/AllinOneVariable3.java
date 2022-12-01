package day3.globalvariables;

public class AllinOneVariable3 {
    static float F,x,y;
    int num1, num2, res1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num3=25, num4=10;
     //object creation
     AllinOneVariable3 r1=new AllinOneVariable3();
     r1.res1=num3+num4;
     //addition of value of local variable by using non-static global variable
     System.out.println("number 3is:"+num3);
     System.out.println("number 4 is:"+num4);
     System.out.println("addition of num3 & num4="+r1.res1);
     System.out.println("*******************************************");
     F=92.5f; 
     x=(F-32); y=x*5;
     float res= y/9;
     System.out.println("fahereneheit temp is:" +F);
	 System.out.println("celcius temp is="+res);
     AllinOneVariable3.F=70;
	 res=(F-32)*(5/9);
	 System.out.println(" Updated fahereneheit temp is:" +F);
	 System.out.println(" Updated celcius temp is="+res);
	 res=(F-32)*(5.0f/9);
	 System.out.println(" Updated celcius temp is="+res);
	 System.out.println("*********************************************");
	 r1.num2=11; r1.res1=r1.num1%r1.num2;
	 System.out.println("non-static GV num1="+r1.num1); 
	 System.out.println("non-static GV num2="+r1.num2); 
	 System.out.println("mod of two number ="+r1.res1);
	 r1.num1=35;
	 int res2=r1.num1%r1.num2;
	 System.out.println(" Updated non-static GV num1="+r1.num1); 
	 System.out.println("non-static GV num2="+r1.num2); 
	 System.out.println("Updated mod of two number ="+res2);
	}

}
