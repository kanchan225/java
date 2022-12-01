package day7.loops;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for ( char c1='a'; c1<='z'; c1++) {
    	  System.out.print(c1 + " ");
      }
      System.out.println("\n ***** print in Cap*******");
      for ( char c1='A'; c1<='Z'; c1++) {
    	  System.out.print(c1 + " ");
      }
      
      System.out.println("\n ***** print table of 2*******");
      //int n=2;
      for(int i=1; i<11; i++) {
    	  System.out.println(3*i);
      }
	}

}
