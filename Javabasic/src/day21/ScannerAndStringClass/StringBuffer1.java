package day21.ScannerAndStringClass;

public class StringBuffer1 {

	public static void main(String[] args) {
		String str=new String("abc");
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Original StringBuffer value: "+sb);
		sb.append("Java");
		System.out.println(sb);//HelloJava
		sb.insert(5, "Pune");
		System.out.println(sb);//HelloPuneJava
		sb.replace(1, 3, "xxx");
		System.out.println(sb);//HxxxloPuneJava
		sb.delete(1, 4);
		System.out.println(sb);
		
		StringBuffer s1=new StringBuffer("Bangalore is known for IT");
		s1.reverse();
		System.out.println(s1);
		//str.reverse();
		
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());//default16
		s2.append("Hello");
		System.out.println("First Word: "+s2);
		System.out.println(s2.capacity());//now 16
		s2.append("Java is my favourite language");
		System.out.println("Second Word: "+s2);
		System.out.println(s2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		s2.append("I am from automation area");
		System.out.println("third Word: "+s2);
		System.out.println(s2.capacity());//now (34*2)+2=70 
	
	
	}

}
 