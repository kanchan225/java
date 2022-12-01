package day7.loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(" Hello Everyone, Good Morning");
           System.out.println(" Hello Everyone, Good Morning");
           System.out.println(" Hello Everyone, Good Morning");
           System.out.println(" Hello Everyone, Good Morning");
           System.out.println(" Hello Everyone, Good Morning");
           
           System.out.println("********************* Using For Loop*********************");
          
           for(int i=0; i<5; i++) {
        	   System.out.println( " i: "+i+" Hello Everyone, Good Morning");
           }
          // for(int num:i) {
        	  //  }
           System.out.println("********************* printing 0 to 10 number*********************");
           for( int i=0; i<11; i++) {
        	             //or i<=10
        	   System.out.println(i);
           }
           System.out.println("********************* printing reverse 10 to 1 number*********************");
           for( int i=10; i>0; i--) {
        	   System.out.println(i);
           }
           System.out.println("********************* print a to z alphabates*********************");
           for( char c1='a'; c1<='z'; c1++) {
        	   System.out.println(c1);
           }
           System.out.println("********************* printing A to Z alphabates *********************");
           for( char c1='A'; c1<='Z'; c1++) {
        	   System.out.println(c1);
           }
           System.out.println("********************* printing z to a alphabates *********************");
           for( char c1='z'; c1>='a'; c1--) {
        	   System.out.println(c1);
           }
           System.out.println("********************* printing z to a alphabates with asciiValue *********************");
           for( char c1='z'; c1>='a'; c1--) {
        	   int asciiValue= c1;
        	   System.out.println(c1+ " : " + asciiValue);
           }




	}

}
