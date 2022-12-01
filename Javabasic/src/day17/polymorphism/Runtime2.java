package day17.polymorphism;
class Hillstations{
	void location() {
    System.out.println("Location is:");
	}
	void famousfor() {
	    System.out.println("Famous for:");
		}
}
class Manali extends Hillstations{
	void location() {
    System.out.println("Manali is in Himachal Pradesh");
	}
	void famousfor() {
	    System.out.println("It is Famous for Hadimba Temple and Adventure sports");
		}
}
class Mussoorie extends Hillstations{
	void location() {
    System.out.println("Mussoo is in Uttarakhand");
	}
	void famousfor() {
	    System.out.println("It is Famous for education institutions");
		}
}
class Gulmarg extends Hillstations{
	void location() {
    System.out.println("Manali is in J&K");
	}
	void famousfor() {
	    System.out.println("It is Famous for skiing");
		}
}

public class Runtime2 {

	public static void main(String[] args) {
		Hillstations h=new Hillstations();
		h.location();
		h.famousfor();
		Hillstations h1=new Manali();
		h1.location();
		h1.famousfor();
		Hillstations h2=new Mussoorie();
		h2.location();
		h2.famousfor();
		Hillstations h3=new Gulmarg();
		h3.location();
		h3.famousfor();

	}

}
