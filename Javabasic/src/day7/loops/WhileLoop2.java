package day7.loops;

public class WhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		char c1='A';
		while(c1<='Z') {
			System.out.println(c1);
			++c1;
		}
		char c2='z';
		while(c2>='a') {
			int ansiivalue=c2;
			System.out.println(c2 + " " +ansiivalue);
			--c2;
		}
	}

}
