package day8.assignment;

public class NaturalNumberSum {
	 static void SumOfNaturalNumber(int start, int end) {
		 int i, sum =0;
		 for(i=start; i<=end; i++) {
			 sum=sum + i;
			// System.out.println(sum);
		 }
		 System.out.println(sum);
	 }

	public static void main(String[] args) {
		System.out.println("  sum of natural number from range 1 to 25");
		SumOfNaturalNumber(1, 25);
        
		int sum=0;
        
        System.out.println("  sum of natural number from range 1 to 10");
		for (int i=1; i<=10; i++) {
			sum=sum+i;//0+1=1,1+2=3,3+3=6,6+4=10,10+5=15 
			//System.out.println(sum);
		}
		System.out.println(sum);
	}

}
