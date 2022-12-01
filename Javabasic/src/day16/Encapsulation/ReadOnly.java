package day16.Encapsulation;
class student {
	private int pincode=441225;
	//getter method allow to use private data from outside the class
	public int getPincode() {  //getter for pincode
		return pincode;
	}
}
public class ReadOnly {

	public static void main(String[] args) {
		student s1=new student();
	    // System.out.println(s1.pincode);
		 System.out.println(s1.getPincode());
	}

}
