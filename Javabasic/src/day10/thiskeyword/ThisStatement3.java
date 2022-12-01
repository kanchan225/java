package day10.thiskeyword;

class Student1 {
	int rollno;
	float fee;
	Student1(int rollno){
		this.rollno=rollno;
	}
	Student1(int rollno, float fee){
		this(rollno);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+ " " +fee);
	}
}

public class ThisStatement3 {

	public static void main(String[] args) {
		Student1 s1=new Student1(110);
		System.out.println(s1.rollno+ " " +s1.fee);
		
		Student1 s2=new Student1(121, 6000f);
		System.out.println(s2.rollno+ " " +s2.fee);
		
		s1.display();
		s2.display();
	}

}
