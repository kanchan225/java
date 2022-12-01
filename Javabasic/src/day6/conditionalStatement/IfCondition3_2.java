package day6.conditionalStatement;

public class IfCondition3_2 {

	public static void main(String[] args) {
		int age=18, weight=52;
		 char group ='A';
		if (age>=18) {
			if (weight>=50) {
				if ( group == 'A') {
				System.out.println("eligible to donate blood");
			} else {
				System.out.println(" not eligible to donate blood, as blood group does not match");
			}
			 } else {
				System.out.println(" not eligible to donate blood, as weight is less");
			}
		     } else {
		    	 System.out.println(" not eligible to donate blood, as age is not 18 ");
		}
		     System.out.println("***********************************************************************");
              
		     DonateBlood(17, 55, 'A');
		     
		     DonateBlood(18, 50, 'B');
		     
		     DonateBlood(19, 45, 'A');
		     
	}      
	       
            static void DonateBlood(int age, int weight, char group) {
            	
       		if (age>=18) {
       			if (weight>=50) {
       				if ( group == 'A') {
       				System.out.println("eligible to donate blood");
       			} else {
       				System.out.println(" not eligible to donate blood, as blood group does not match");
       			}
       			 } else {
       				System.out.println(" not eligible to donate blood, as weight is less");
       			}
       		     } else {
       		    	 System.out.println(" not eligible to donate blood, as age is not 18 ");
       		}

            }
}
