package day15.package1;
public class Modifiers {
    private int num1=10;
    int num2=20;
    protected int num3=30;
    public int num4=40;
	public static void main(String[] args) {
		Modifiers m1=new Modifiers();
		System.out.println("Private variable : "+m1.num1);
		System.out.println("Default variable : "+m1.num2);
		System.out.println("Protected variable : "+m1.num3);
		System.out.println("Public variable : "+m1.num4);

	}

}
class accessModifiers{
	public static void main(String[] args) {
		Modifiers m1=new Modifiers();
		//System.out.println("Private variable : "+m1.num1);
		System.out.println("Default variable : "+m1.num2);
		System.out.println("Protected variable : "+m1.num3);
		System.out.println("Public variable : "+m1.num4);

	}
}