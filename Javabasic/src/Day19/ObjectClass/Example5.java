package Day19.ObjectClass;
class Print{
	int a=10;
	@Override
	public int hashCode() {
		return 101;
	}
	@Override
	public String toString() {
		return "I am Print class toString()";
	}
}
public class Example5 {
	static int last_roll=100;
    int roll_no;
    Example5(){
    	roll_no=last_roll;//100
    	last_roll++;//101
    }
	public static void main(String[] args) {
		Example5 e1=new Example5();
		System.out.println("e1: toString of Example4 class: "+e1);
		System.out.println("e1.hashCode:  of Example4 class: "+e1.hashCode());
		
		Example5 e2=new Example5();
		System.out.println("e2: toString of Example4 class: "+e2);
		System.out.println("e2.hashCode:  of Example4 class: "+e2.hashCode());
		System.out.println("e1 & e2 compare: "+e1.equals(e2));
		Example5 e3=e2;
		System.out.println("e3 & e2 compare: "+e3.equals(e2));
		
		Print p1=new Print();
		System.out.println("p1: toString of Print class: "+p1);
		System.out.println("p1.hashCode:  of Print class: "+p1.hashCode());
		Print p2=new Print();
		System.out.println("p2: toString of Print class: "+p2);
		System.out.println("p2.hashCode:  of Print class: "+p2.hashCode());
		System.out.println("comparing Print class object p1 & p2 with overriden equals(): "+p1.equals(p2));
		
	}

}
