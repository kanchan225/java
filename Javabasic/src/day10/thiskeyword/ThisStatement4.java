package day10.thiskeyword;

class Student2 {
	int rollno;
	float fee;
	Student2(int rollno){
		this.rollno=rollno;
	}
	Student2(int rollno, float fee){
		this(rollno);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+ " " +fee);
	}
}
public class ThisStatement4 {

	public static void main(String[] args) {
		Student2 s1=new Student2(121, 5000f);
		
		Student2 s2=new Student2(111);
		
		s1.display();
		s2.display();
		
	}

}
