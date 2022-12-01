package day21.ScannerAndStringClass;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println("Original StringBuilder value: "+sb);
		sb.append("Java");
		System.out.println(sb);//Hello Java
        sb.reverse();
        System.out.println(sb);
        
        StringBuilder sb1=new StringBuilder("Hello Java");
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("Hello Java");
        System.out.println(sb2);
        System.out.println(sb1.equals(sb2));//address basis comparison
        System.out.println(sb1==sb2);//address basis comparison
      //We don't have any method in StringBuffer and StringBuilder to compare object values, so to overcome that
     //first convert StringBuffer/StringBuilder to String class using toString()
     // dn use equals() of string class
        System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
