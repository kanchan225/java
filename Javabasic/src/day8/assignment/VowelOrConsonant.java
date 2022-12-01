package day8.assignment;

public class VowelOrConsonant {
	static void VovelConsonant(char c1) {
		if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u') {
			System.out.println(c1 + " is vowel");
		} else {
			System.out.println(c1 + " is consonant");
		}
	}
	public static void main(String[] args) {
		VovelConsonant('u');
		VovelConsonant('b');
		
		

	}

}
