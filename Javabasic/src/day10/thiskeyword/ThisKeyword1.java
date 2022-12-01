package day10.thiskeyword;

class student {
	int rollno;
	float fee;
	student(int rollno, float fee) {
		rollno= rollno;
		this.fee=fee; //global variable name=local variable name
	}
	void display() {
    System.out.println(rollno+ " " +fee);
	}
}
public class ThisKeyword1 {
    static int age=30;
	public static void main(String[] args) {
		int age=30;
		 System.out.println("age ="+age);
		 System.out.println("SGV age ="+ThisKeyword1.age);	
		 
		 student s1=new student(121, 6000f);
		 s1.display();
		 student s2=new student(151, 8000f);
		 s2.display();
		
		 
	}

}
