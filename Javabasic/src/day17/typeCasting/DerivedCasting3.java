package day17.typeCasting;
class JD{
	public void printme1() {
		System.out.println("JournalDev print method");
	}
	void disp() {
		System.out.println("JournalDev disp method");
	}
}
class Java extends JD{
	public void printme2() {
		System.out.println("Java print method");
	}
	void disp() {
		System.out.println("Java disp method");
	}
}
class Android extends Java{
	public void printme3() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
public class DerivedCasting3 {

	public static void main(String[] args) {
	JD j1=new Android();
	j1.printme1();
	j1.disp();
	//j1.printme3();
    System.out.println("*********Downcasting to java**********");
    Java j2=(Java) j1;
    j2.printme1();
    j2.printme2();
	j2.disp();
	System.out.println("*********Downcasting to Android**********");
    Android a1=(Android) j1;
    a1.printme1();
    a1.printme2();
    a1.printme3();
	a1.disp();
	}

}
