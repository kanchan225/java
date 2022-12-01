package day20.SystemClass;

public class FinalizeExample {

	public static void main(String[] args) {
		FinalizeExample f1=new FinalizeExample();
		System.out.println(f1.hashCode());
		
		//f1.finalize();
		f1=null;
		Object objh;
		System.gc();//explicitely calling garbage collector
		
		//FinalizeExample f2=new FinalizeExample();
		//System.out.println(f2.hashCode());
		
		System.out.println("Program Ends");
		
	}
    public void finalize() {
    	System.out.println("Hi, I am finalize method");
    }
}
