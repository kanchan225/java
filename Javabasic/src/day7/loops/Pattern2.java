package day7.loops;

public class Pattern2 {
    // Inverted half pyramid
	public static void main(String[] args) {
		int i, j, n=5;
		/*for(i=0; i<5; i++) {
			for(j=2*(n-1); j>=0; j--) {
				System.out.print("");
			}
			for(j=0; j<=i; j++) {
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		*/
		
		for(i=5; i>0; i--) { //number of lines
			for(j=0; j<i; j++) { //define patterns
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(i=5; i>0; i--) { //number of lines
			for(j=1; j<=i; j++) { //define patterns
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		drawPyramid(6, 'A');
		drawPyramid('A', 'G');
		drawPyramid(1, 10);
	}
     public static void drawPyramid(int numberoflines, char c1) {
    	 for(int i=numberoflines; i>0; i--) {
    		 for(int j=0; j<i;j++) {
    			 System.out.print(c1+" ");
    		 }
    		 System.out.println();
    	 }
     }
     
     public static void drawPyramid(char c1, char c2) {
    	 for(char i=c2; i>c1; i--) {
    		 for(char j=c1; j<i;j++) {
    			 System.out.print(j+" ");
    		 }
    		 System.out.println();
    	 }
     }
     public static void drawPyramid(int num1, int num2) {
    	 for(int i=num2; i>num1; i=i-2) {
    		 for(int j=num1; j<i; j=j+2) {
    			 System.out.print(j+" ");
    		 }
    		 System.out.println();
    	 }
     }
}

