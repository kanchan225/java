package day8.assignment;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=123, rev=0, rem;
		System.out.println("Given number is :"+num);
		for(;num>0; num=num/10) {
			rem=num%10; //123%10=3--> 12%10=2---> 1%10=1
			rev=rev*10+rem;//o+3=3--> 3*10+2=32---> 32*10+1=321
			//num=num/10;
			//System.out.println("Reverse number :"+rev);
		}
		System.out.println("Reverse number :"+rev);
		 
		num=350; rev=0;
		System.out.println("Given number is :"+num);
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number :"+rev);
		
		
		System.out.println("***********************************");
		System.out.println("Reverse number is:"+reverse(5264));
		
	}
     static int reverse(int num) {
    	 int rev=0, rem;
    	 System.out.println("Given number is :"+num);
 		for(;num>0;) {
 			rem=num%10;
 			rev=rev*10+rem;
 			num=num/10;
 		}
 		return rev;
     }
}
