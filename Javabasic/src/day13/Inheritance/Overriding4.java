package day13.Inheritance;
class ABC{
	void MyMethod() {
		System.out.println("method of ABC class");
	}
}
 class Overriding4 extends ABC{
	public void MyMethod() {
		    super.MyMethod();
			System.out.println("method of Overriding4 class");
		}

	public static void main(String[] args) {
		 Overriding4 obj=new  Overriding4();
         obj.MyMethod();
	}

}
