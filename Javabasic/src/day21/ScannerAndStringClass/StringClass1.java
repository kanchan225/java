package day21.ScannerAndStringClass;

public class StringClass1 {

	public static void main(String[] args) {
		StringClass1 c1=new StringClass1();
        System.out.println("c1: "+c1);
        //String class object creation
        //1.using literal
        String s1="Mumbai";//new object will be created in string constant pool
        String s2="Mumbai";//no object will be created as its a duplicate object, so s2 will points to s1 object
        String s3="Bangalore";////new object will be created in string constant pool
        System.out.println("s1: "+s1);//object value because toString() is overrided in String class
        System.out.println("s2: "+s2.toString());
        System.out.println("s3: "+s3);
        System.out.println("s1 char count: "+s1.length());
        System.out.println("s2 char count: "+s2.length());
        System.out.println("s3 char count: "+s3.length());
        System.out.println("s1 & s2 using equals(): "+s1.equals(s2));//compare s1 & s2 based on values
        System.out.println("s1 & s2 using '==' : "+(s1==s2));//compare s1 & s2 based on address
        System.out.println("s1 & s3 using equals(): "+s1.equals(s3));//compare s1 & s3 based on values
        System.out.println("s1 & s3 using '==' : "+(s1==s3));//compare s1 & s3 based on address
	    String s4=new String("Mumbai");//two objects --->1.in constant pool, 2.in non-constant pool 
	    System.out.println("s1 & s4 using equals(): "+s1.equals(s4));//compare s1 & s4 based on values
        System.out.println("s1 & s4 using '==' : "+(s1==s4));//compare s1 & s2 based on address
        String s5=new String("Mumbai");//two objects --->1.in constant pool, 2.in non-constant pool 
	    System.out.println("s4 & s5 using equals(): "+s4.equals(s5));//compare s4 & s5 based on values
        System.out.println("s4 & s5 using '==' : "+(s4==s5));//compare s4 & s5 based on address
	}

}
