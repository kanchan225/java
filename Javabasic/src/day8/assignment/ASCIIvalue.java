package day8.assignment;

public class ASCIIvalue {
	static int AsciiValue(char alphabate) {
		int ascii=alphabate;
		System.out.println(" given alphabate:"+alphabate);
		return ascii;
	}

	public static void main(String[] args) {
		System.out.println("ASCII value of given alphabate :"+AsciiValue('A'));
		System.out.println("ASCII value of given alphabate :"+AsciiValue('a'));
		System.out.println("ASCII value of given alphabate :"+AsciiValue('K'));
		System.out.println("ASCII value of given alphabate :"+AsciiValue('k'));
	}

}
