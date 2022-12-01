package day3.globalvariables;

public class Demo {
    static int b=20;
    int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int c=25;	
     Demo d1= new Demo();
     System.out.println(d1.a);//10
     System.out.println(d1.b);//20
     System.out.println(c);
     d1.a=100;
     b=200;
     System.out.println(d1.a);//100
     System.out.println(b); //200
     
     Demo d2= new Demo();
     System.out.println(d2.a);//10
     System.out.println(d2.b);//200
     System.out.println(c);
	}
     static void name() {
    	 int c1=15;
    	// c=30;
     }
}
