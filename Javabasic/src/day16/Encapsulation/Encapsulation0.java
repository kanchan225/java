package day16.Encapsulation;
class student2{
	private int empId=1011;
	private double salary=75000;
	public int getempId() { //getter for empId
		return empId;
	}
	public double getsalary() { //getter for salary
		return salary;
	}
	
	public void setEmpId(int id) { //setter for empId
		empId=id;
	}
	public void setsalary(double salary) { //setter for salary
		this.salary=salary;
	}
}
public class Encapsulation0 {

	public static void main(String[] args) {
	student2 s1=new student2();
	System.out.println("Accessing private data member outside the class using getter concept");
	System.out.println("empId : "+s1.getempId());
	System.out.println("salary : "+s1.getsalary());
	System.out.println("***********Updating Private data*************");
	s1.setEmpId(105);
	s1.setsalary(90000);
	System.out.println("Updated empId : "+s1.getempId());
	System.out.println("Updated salary : "+s1.getsalary());
	System.out.println("******************************************************");
	student2 s2=new student2();
	System.out.println("Accessing private data member outside the class using getter concept");
	System.out.println("empId : "+s2.getempId());
	System.out.println("salary : "+s2.getsalary());
	
	}

}
