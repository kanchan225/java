package day8.assignment;

public class ArmstrongNumber {
	
     public boolean checkArmstrong(int num ) {
    	 System.out.println("Given number is :"+num);
    	 int copy , rem, sum=0;
    	 copy=num;
    	 while(num>0) {
    		 rem=num%10;//153%10=3, 15%10=5, 1%10=1
    		 sum=sum+rem*rem*rem;//0+3*3*3=27, 27+5*5*5
    		 num=num/10;
    	 }
    	 if (copy==sum) {
    		 return true;
    	 }else {
    		 return false;
    	 }
     }
	public static void main(String[] args) {
		ArmstrongNumber m1=new ArmstrongNumber();
		 System.out.println("Given number is Armstrong :"+m1.checkArmstrong(153));
		 System.out.println("Given number is Armstrong :"+m1.checkArmstrong(133));
		
	}

}
