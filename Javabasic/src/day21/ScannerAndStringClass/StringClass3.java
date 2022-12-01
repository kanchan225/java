package day21.ScannerAndStringClass;

public class StringClass3 {

	public static void main(String[] args) {
		String s1="I am kanchan, I am from Gadchiroli";
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		System.out.println("String after split: ");
		for(String s:strAry) {
			System.out.println(s);
		}
		System.out.println("***************************************");
		String s2="I am QA Engineer";
		System.out.println("Actual String: "+s2);
		String str[]=s2.split(" ",2);
		System.out.println("String after split: ");
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println("***************************************");
		String s3="I am from Maharashtra";
		System.out.println("Actual String: "+s3);
		String strAry2[]=s3.split(" ");
		String temp="";
		System.out.println("String after split: ");
		for(String s:strAry2) {
			System.out.println(s);
		}
		for(int i=strAry2.length-1;i>=0;i--) {
			temp=temp+" "+strAry2[i];
		}
		System.out.println("reverse statement: "+temp);
		System.out.println("***************************************");
		
		String s4="     I am Kanchan    ";
		System.out.println("Actual String with spaces: "+s4);
		System.out.println("Actual String length: "+s4.length());
		System.out.println("Actual String without spaces: "+s4.trim());
		System.out.println("Actual String lengtn without spaces: "+s4.trim().length());
        System.out.println("***************************************");
		
		String s5="I            am            Kanchan    ";
		System.out.println("Actual String with spaces: "+s5.trim());
		System.out.println("Actual String lengtn with spaces: "+s5.trim().length());
	}

}
