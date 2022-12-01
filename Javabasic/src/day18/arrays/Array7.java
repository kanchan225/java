package day18.arrays;
class Example {
	int age;
	double salary;
	Example(){
		System.out.println("Zero-Parameter");
	}
	Example(int a){
		System.out.println("int-Parameter");
	}
	Example(double a){
		System.out.println("double-Parameter");
	}
	void calling() {
		System.out.println("Calling of Example class, age: "+age);
		System.out.println("Calling of Example class, salary: "+salary);
	}
}
public class Array7 {

	public static void main(String[] args) {
		Example e1=new Example();
		Example e2=new Example(15);
		Example e3=new Example(22.5);
		e1.calling();
		e2.calling();
		e3.calling();
		
		int empId1=101, empId2=102, empId3=103; 
		int[] empId=new int[3];
		empId[0]=101;
		empId[1]=102;
		empId[2]=103;
		
		System.out.println("***********************************");
		//Example[] e=new Example[] {new Example(), new Example(15), new Example(22.5)};
		              //or
		//Example[] e= {new Example(), new Example(15), new Example(22.5)};
		              //or
		Example[] e=new Example[3];
		e[0]=new Example();    //e1
		e[1]=new Example(15);  //e2
		e[2]=new Example(25.36);//e3
		
        e[0].calling();//e1.calling();
        e[1].calling();//e2.calling();
        e[2].calling();//e3.calling();
	}

}
