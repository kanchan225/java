package day7.loops;

public class Pattern3 {

	public static void main(String[] args) {
		// Full Pyramid
		for (int i = 7; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= 7; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		// Inverted Full Pyramid
		for (int i = 7; i > 0; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
			for (int j = i; j <= 7; j++) {
				System.out.print(" ");
			}
		}

		for (int i = 10; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= 10; k++) {
				if (k % 2 == 0) {
					System.out.print(k + "  ");
				}
			}
			System.out.println();
		}
	}

}
