package day20.SystemClass;
class training{
	  training(){
		  System.out.println("Training class const");
	  }
	  void manualTesting() {
		  System.out.println("I am from manual Testing");
	  }
	  void automationTesting() {
		  System.out.println("I am from automation Testing");
	  }
}
public class SystemDemo2 {
    static training t1=new training();
	public static void main(String[] args) {
		 System.out.println("Program starts");
		 SystemDemo2.t1.manualTesting();
		 SystemDemo2.t1.automationTesting();
		//classname.staticRefVar.method 
		 training t2=new training();
		 t2.manualTesting();
		 t2.automationTesting();
		 System.out.println("Program ends");
   //classname.staticRefVar.method 
		 System.err.println("I am error, from systemDemo2 class ");
	}

}
