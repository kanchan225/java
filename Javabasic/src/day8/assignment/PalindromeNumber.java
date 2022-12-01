package day8.assignment;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num= 121, rev=0, rem;
		int copy=num;
		System.out.println("Given number is :"+num);
		for(;num!=0;) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		   }
		System.out.println("Reverse number is : "+rev);
		    if(rev==copy) {
		    	System.out.println("Given number is Palindrome");
		    } else
		    { System.out.println("Given number is not Palindrome");
		}
		    
		    System.out.println("*******************************************");
		    System.out.println("Given number is palindrome :" +checkPalindrome(34543));
		    System.out.println("Given number is palindrome :" +checkPalindrome(2343));
	}
          static boolean checkPalindrome(int num) {
        	  System.out.println("Given number is :"+num); 
        	  int rev=0, rem;
        	  int copy=num;
        	 while(num>0) {
        		 rem=num%10;
        		 rev=rev*10+rem;
        		 num=num/10;
        	 }
        	      if(rev==copy) {
        	    	  return true;
        	      }else {
        	    	  return false;
        	 }
          }
}
