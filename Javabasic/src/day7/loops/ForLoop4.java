package day7.loops;

public class ForLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; ++i) {
			System.out.println("******Hello i :" +i );
			for(int j=0; j<2; ++j) {
				System.out.println("******Hello j :" +j);
				for(int k=0; k<2; ++k) {
					System.out.println("******bye k:" +k );
					}	
			}
		}
        for (int i=0; i<50; ++i) {
        	System.out.println(i);
        	i=i+4;
        }
        int i;
        for (i=0; i>=0; i--) {
        	if (i%2==0) {
        		System.out.println(i);
        	}
        }
        /*
        System.out.println("************* infinite loop******************");
       
        for (int i =0; i>=0; i++) {
        	if (i%2==0) {
        		System.out.println(i);
        	}
	}
	*/
	}
}
