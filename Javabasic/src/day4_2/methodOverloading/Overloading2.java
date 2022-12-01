package day4_2.methodOverloading;

public class Overloading2 {
    public void square(){
    	System.out.println("Zero parameterized method called");
    }
    double res;
    public void square(float num){
    	res=num*num;
    	System.out.println("float parameterized method called : "+res);
    }
    public void square(int num){
    	res=num*num;
    	System.out.println("int parameterized method called : "+res);
    }
	public static void main(String[] args) {
		Overloading2 obj=new Overloading2();
        obj.square();
        obj.square(25);
        obj.square(12.5f);
        //obj.square(12.5);
        
	}

}
