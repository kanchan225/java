package day17.typeCasting;
class Member{
	long phone;
	void chat() {
		System.out.println("chatting in whatsapp group with "+phone);
	}
}
class Admin extends Member{
	void addNumber() {
		System.out.println("Adding a new user number in whatsapp group "+phone);
	}
}
public class DerivedCasting2 {

	public static void main(String[] args) {
		Member m1=new Admin();//up-casting
		m1.phone=9876543458l;
		m1.chat();
		Admin a1=(Admin) m1;// down-casting to access specific property of subclass member
        a1.addNumber();
        a1.chat();
//        Admin a2=(Admin) new Member();
//        a2.addNumber();
//        a2.chat();
      //  Admin a2= m1; direct downcasting, invalid or not possible
      //  Admin a1=new Member();
	}

}
