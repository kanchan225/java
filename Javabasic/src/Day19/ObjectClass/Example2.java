package Day19.ObjectClass;
class Demo1{
	void display() {
		System.out.println("I am display()...");
	}
}
public class Example2 extends Demo1{
    static int last_roll=100;
    int roll_no;
    Example2(){
    	roll_no=last_roll;
    	last_roll++;
    }
    
	public static void main(String[] args) {
		Example2 e =new Example2();
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println(e.hashCode());//it convert hexadecimal address into decimal and return the value
		
		Demo1 d=new Demo1();
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.hashCode());
        
	}

}
