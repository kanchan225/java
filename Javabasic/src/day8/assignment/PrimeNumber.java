package day8.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int i, num=11, counter=0;
		for (i=1; i<=num; i++) {
			if(num%i==0) {
				++counter;
			}
		}
		if (counter==2) {
			System.out.println(num+ " is prime number");
		} else
		{ System.out.println(num+ " is not a prime number");
		}
		
		 int a ,b, counter1=0;
    	 for(a=1; a<=21;a++ ) {
    		 for( b=1; b<=a;b++) {
    			 if (a%b==0) {
    				 counter1++;
    			 }
    		 }
    	 if(counter1==2) {
    			 System.out.println(" Prime number:"+a);
    	 }
    		 
    		 
    	 }
		System.out.println("Given number is Prime :"+prime(13));
		System.out.println("Given number is Prime :"+prime(45));
		 a=1; b=21;
		printPrime(a, b);
}
	     static boolean prime(int num) {
	    	 System.out.println( "Given number is :"+num);
	    	 int i=2, counter=1;
	    	 while (i<=num) {
	    		 if(num%i==0) {
	    			 ++counter;
	    		 } 
	    		 i++;
	    	 }
	    	 if (counter==2) {
	 			return true;
	 		} else
	 		{ return false;
	 		}
	    	  
	     }
	     static void printPrime(int num1, int num2) {
	    	 int i ,j, counter=0;
	    	 for(i=num1; i<=num2;i++ ) {
	    		 for( j=1; j<=num2;j++) {
	    			 if (i%j==0) {
	    				 counter++;
	    			 }
	    	
	    	 if(counter==2) {
	    			 System.out.println(" Prime number:"+i);
	    	 }
	    		 
	    		 }
	    	 }
	     }
	    
	        
}
