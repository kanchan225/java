package day15.package1;

public class ProtectedMembers {
	protected int accnum=12345;
	protected void displayAccnum() {
		System.out.println("Account Number : "+accnum);
	}
    public static void main(String[] args) {
    	ProtectedMembers p1=new ProtectedMembers();
    	System.out.println(p1.accnum);
    	p1.displayAccnum();
	}
}

class AccessProtectedMembers{
	 public static void main(String[] args) {
	    	ProtectedMembers p1=new ProtectedMembers();
	    	System.out.println(p1.accnum);
	    	p1.displayAccnum();
		}
}
