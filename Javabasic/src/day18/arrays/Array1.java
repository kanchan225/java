package day18.arrays;

public class Array1 {

	public static void main(String[] args) {
//		int a[];//declaration
//		a = new int[5];//size initialization
		//or
		int a[]=new int[5];//declaration and instantiation
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        //System.out.println(a[5]);
        a[0]=10;//initialization
        a[1]=20;
        a[2]=50;
        a[3]=70;
        a[4]=40;
        System.out.println("*********After initialization***********");
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
               //or
        System.out.println("array Elements counts: "+a.length);//5
        System.out.println("*************Normal for-loop*************");
        for(int i=0;i<a.length;i++) {
        	 System.out.println(a[i]);
        }
        System.out.println("************* for-each loop*************");
        for (int num:a) {
        	 System.out.println(num);
        }
        
        char[] getArray=new char[] {'A','B','C','D'};
                  //or
        char[] getArray1=new char[4];
        getArray1[0]='A';
        getArray1[1]='B';
        getArray1[2]='C';
        getArray1[3]='D';
                //or
        char[] getArray2= {'A','B','C','D'};
        System.out.println("************* for-each loop for getAray*************");
	    for(char num: getArray) {
	    	System.out.println(num);
	    }
	    getArray1[0]='e';
        getArray1[1]='f';
        getArray1[2]='g';
        getArray1[3]='h';
        for(char alphabate:getArray1) {
        	System.out.println(alphabate);
        }
	}
}
