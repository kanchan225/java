package Day19.ObjectClass;
class Demo2{
	void display() {
		System.out.println("I am display() of class Demo2");
	}
}
public class Example3 extends Demo2{
    static int last_roll=100;
    int roll_no;
    Example3(){
    	roll_no=last_roll;//100
    	last_roll++;//101
    }
    @Override
    void display() {
		System.out.println("I am display() of class Example3");
	}
    @Override
    public int hashCode() {
		return roll_no;
	}
	public static void main(String[] args) {
		Example3 e=new Example3();
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println("hashCode() value from Example3 class : "+e.hashCode());
        e.display();
        
        Demo2 d=new Demo2();
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println("hashCode() value from Demo2 class : "+d.hashCode());
	}

}
