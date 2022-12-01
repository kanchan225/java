package day7.loops;

public class Pattern3_1 {

	public static void main(String[] args) {
		int numforeven =15;
		int rowct=(numforeven/2)+1;
		for (int i=rowct; i>0; i--) { //number of lines 
			numforeven=15;
			for(int j=1; j<=i; j++) { //define design
				System.out.print(" ");
			}
			for(int j=i; j<=rowct; j++) { // define pattern
				if(numforeven%2==0) {
					System.out.print(numforeven+" ");
					numforeven--;
				}
				numforeven--;
			}
			System.out.println();
		}

	}

}
