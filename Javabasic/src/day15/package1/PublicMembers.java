package day15.package1;

public class PublicMembers {
	public static int num=675;
    public int accnum=12345;
    public void displayAccnum() {
      System.out.println("Account Number : "+accnum);
    	
    }
	public static void main(String[] args) {
		PublicMembers p1=new PublicMembers();
		System.out.println(p1.accnum);
		p1.displayAccnum();
	}

}
class AccessPublicMembers{
	public static void main(String[] args) {
		PublicMembers p1=new PublicMembers();
		System.out.println(p1.accnum);
		p1.displayAccnum();
		System.out.println(PublicMembers.num);
	}
}