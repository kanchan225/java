package day10.thiskeyword;
class Test{
	void m() {
    System.out.println("hello m");
	}
	void n() {
	    System.out.println("hello n");
	    //m();  or
	    this.m();
		}
}
public class ThisKeyword4 {
	   void method1() {
		   System.out.println("hello method1");  
	   }
	   void method2() {
		   System.out.println("hello method2"); 
		   //method2(); 0r
		   this.method1();
	   }

	public static void main(String[] args) {
		ThisKeyword4 obj=new ThisKeyword4();
		obj.method2();
		
		Test obj2=new Test();
		obj2.n();
		
	}

}
