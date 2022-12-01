package day7.loops;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("Right Triangle star Pattern");//or half pyramid
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print( i +" ");
			}
			System.out.println();
		}
    
	for(int i=0; i<5; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print( j  +" ");
		}
		System.out.println();
	 }
	for(char i='A'; i<='E'; i++) {
		for(int j='A'; j<=i; j++) {
			System.out.print( i +" ");
		}
		System.out.println();
	}
	for(char i='A'; i<='E'; i++) {
		for(char j='A'; j<=i; j++) {
			System.out.print( j +" ");
		}
		System.out.println();
	}

	for(int i=5; i>0; i--) {
		for(int j=5; j>=i; j--) {
			System.out.print(  j+" ");
		}
		System.out.println();
	}
	for(int i=5; i>0; i--) {
		for(int j=5; j>=i; j--) {
			System.out.print( i +" ");
		}
		System.out.println();
	}
	for(int i=1; i<=11; i=i+2) {
		for(int j=1; j<=i; j=j+2) {
			//if(j%2==1) {
			System.out.print(  j+" ");
			//}
			}
		System.out.println();
	 }
	for(int i=2; i<=11; i=i+2) {
		for(int j=2; j<=i; j=j+2) {
			//if(j%2==1) {
			System.out.print(  j+" ");
			//}
			}
		System.out.println();
	 }
	for(int i=1; i<=11; i=i+2) {
		for(int j=1; j<=i; j++) {
			if(j%2!=0) {
			System.out.print(  j+" ");
			}
		}
		System.out.println();
	 }
	}
	
}



