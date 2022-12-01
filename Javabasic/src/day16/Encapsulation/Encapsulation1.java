package day16.Encapsulation;
class student3{
	private static int rollNo;
	private double fees;
	private char grade;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		student3.rollNo = rollNo;
	}
	 double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public char getGrade() {
		return grade;
	}
	 void setGrade(char grade) {
		this.grade = grade;
	}
	
}
public class Encapsulation1 {

	public static void main(String[] args) {
		student3 s1=new student3();
		System.out.println("Roll Number : "+s1.getRollNo());
		System.out.println("Fees : "+s1.getFees());
		System.out.println("Grade : "+s1.getGrade());
		System.out.println("*****************************************");
		s1.setRollNo(22);
		s1.setFees(10000);
		s1.setGrade('A');
		System.out.println("Updated Roll Number : "+s1.getRollNo());
		System.out.println("Updated Fees : "+s1.getFees());
		System.out.println("Updated Grade : "+s1.getGrade());
		
	}

}
