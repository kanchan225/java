package day16.Encapsulation;

public class Encapsulation4 {

	public static void main(String[] args) {
		Encapsulation3 obj=new Encapsulation3();
		System.out.println("Account No : "+obj.getAcc_no());
		System.out.println("Amount : "+obj.getamount());
		obj.setAcc_no(1024567839L);
		obj.setamount(1500000.50f);
		System.out.println("Updated Account No : "+obj.getAcc_no());
		System.out.println("Updated Amount : "+obj.getamount());
	}

}
