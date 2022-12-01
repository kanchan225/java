package day15.package1;

 class PrivateMembers {
	int salary=25000;
    private int accNum=10125;
    private void displayAccNum() {
    	System.out.println("Account Number: "+accNum);
    }
	public static void main(String[] args) {
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
class AccessPrivateMembers {
   
    
	public static void main(String[] args) {
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.salary);
		//System.out.println(p1.accNum);
		//p1.displayAccNum();
	}

}
