package day8.assignment;

public class LargestAmongThreeNumber {
	
	static void LargestNumber(int n1, int n2, int n3) {
		if (n1>=n2 && n1>=n3) {
			System.out.println(n1 + " is the largest number among " +n1+","+n2+","+n3);
		} else if (n2>=n1 && n2>=n3) {
			System.out.println(n2 + " is the largest number among " +n1+","+n2+","+n3);
		} else {
			System.out.println(n3 + " is the largest number among " +n1+","+n2+","+n3);
		}
	}

	public static void main(String[] args) {
		LargestNumber(36, 38, 58);
		LargestNumber(122, 133,-143);
	}

}
