package day21.ScannerAndStringClass;

public class StringSampleProgram1 {

	public static void main(String[] args) {
		String s1="CorejavaBasics";
		System.out.println("String length = "+s1.length());
		System.out.println("Characters at 3rd position = "+s1.charAt(7));
		System.out.println("Substring from index 3 = "+s1.substring(2));
		System.out.println("Substring from index 2 to 5 = "+s1.substring(2, 5));
		System.out.println("Substring from index 4 to 8 = "+s1.substring(4, 8));
		String s2="Core";
		String s3="JavaBasic";
		System.out.println("First value of s2: "+s2);
		System.out.println("First value of s3: "+s3);
		System.out.println("Concatenated String: "+s2.concat(s3));
		System.out.println("after Concatenated value of s2: "+s2);
		System.out.println("after Concatenated value of s3: "+s3);
		String p1="Pune";
		String p2="Mumbai";
		String x1=s2.concat(s3);//CorejavaBasics
		String x2=p2.concat(p1);//MumbaiPune
		String x3=p2 + p1;//MumbaiPune
		String x4=x1.concat(x2);
		System.out.println("x4 : "+x4);
		String x5=x1.concat(x3);
		System.out.println("x5 : "+x5);
		
		String s5="Learn Share Learn Share";
		System.out.println("s5 size: "+s5.length());
		System.out.println("Index of 'Share' starts from: "+s5.indexOf("Share"));
		System.out.println("Index of 'a' after 3rd index: "+s5.indexOf('a',3));
		System.out.println("Index of 'e' after index 11: "+s5.indexOf('e',11));
		System.out.println("Last Index of 'Learn' before index 17: "+s5.lastIndexOf("Learn",17));
		System.out.println("Last Index of 'e'before index 17: "+s5.lastIndexOf('e',17));
		
		String s6="Selenium";
		String s7="selenium";
		String s8="Selenium";
		System.out.println("Checking Equality of s6 & s7: "+s6.equals(s7));
		System.out.println("Checking Equality of s6 & s8: "+s6.equals(s8));
		System.out.println("Checking Equality of s6 & s7 with Ignore case: "+s6.equalsIgnoreCase(s7));
	    
		String word1="CoreJava";
		System.out.println("Changing to lower case: "+word1.toLowerCase());
		System.out.println("Changing to UPPER case: "+word1.toUpperCase());
		
		String str1="CoreJavaBasic";
		System.out.println("Original String: "+str1);
		String str2=str1.replace('a', 'x');
		System.out.println("Replacing a with x: "+str2);
		String str3=str1.replace("Java","Net");
		System.out.println("Replacing 'Java' with 'Net': "+str3);
		String str4=str1.replaceFirst("a","W");
		System.out.println("Replacing first a with x: "+str4);
		String str5=" ";
		System.out.println("str5 is empty "+str5.isEmpty());
		String str6=new String();
		System.out.println("str6 is empty "+str6.isEmpty());
		
	}

}
