package day18.arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] age= {12, 4, 25, 10, 2};
		System.out.println("****Accessing elements of Array***");
		System.out.println("First element: "+age[0]);
		System.out.println("Second element: "+age[1]);
		System.out.println("Third element: "+age[2]);
		System.out.println("Forth element: "+age[3]);
		System.out.println("Fifth element: "+age[4]);
		System.out.println("Array size: "+age.length);
		System.out.println("*********Using for loop***********");
		for(int i=0;i<age.length;i++) {
			//System.out.println(age[i]);
			if(age[i]==25) {
				System.out.println(age[i]);
				break;
			}else {
				System.out.println("age is not 25");
			}
		}
		System.out.println("*********Using for-each loop***********");
		for(int a:age) {
			//System.out.println(a);
			if(a==10) {
				System.out.println(a);
				break;
			}else {
				System.out.println("age is not 10");
			}
		}
	}

}
