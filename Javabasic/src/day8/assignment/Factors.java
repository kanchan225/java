package day8.assignment;

public class Factors {

	public static void main(String[] args) {
	FactorOfPositiveNumber(30);	
	FactorOfNegativeNumber(-30);
	factor(-121);
	factor(250);

	}
     static void FactorOfPositiveNumber(int num) {
    	 System.out.println("Factors of  number :"+num);
    	 for (int i=1; i<=num; ++i) {
    		if (i==0) {
    			 continue;
    		 } else { 
    			 if (num % i==0) {
    				 System.out.print(i +" , ");
    			 } 
    		 }
    	 }
     }
    
     static void FactorOfNegativeNumber(int num) {
    	 System.out.println("\nFactors of  number :"+num); 
    	 for (int i=num; i<= Math.abs(num); ++i ){
    		 if (i==0) {
    			 continue;
    		 } else {  
    			 if (num%i==0) {
    				 System.out.print(i +" , ");
    			 }
    		 }
    	 }
     }
     
     static void factor(int num) {
    	 System.out.println("\nFactors of  number :"+num); 
    	 if (num>0) {
    		 for(int i=0; i<=num; i++) {
    			 if(i==0) {
    				 continue;
    			 }else {
    				 if(num%i==0) {
    					 System.out.print(i +" , ");	 
    				 }
    			 }
    		 }
    	 }
    	 else {
    		 for(int i=num; i<=Math.abs(num); i++) {
    			 if(i==0) {
    				 continue;
    			 }else {
    				 if(num%i==0) {
    					 System.out.print(i +" , ");	 
    				 }
    			 }
    		 }
    	 }
    	 	 
     }
}
