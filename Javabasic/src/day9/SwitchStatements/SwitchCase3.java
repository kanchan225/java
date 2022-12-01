package day9.SwitchStatements;

public class SwitchCase3 {

	public static void main(String[] args) {
		System.out.println(" Is given character vowel :"+CheckVowels('o'));
		System.out.println(" Is given character vowel :"+CheckVowels('z'));
		//CheckVowels('m');
	}
	
	static boolean CheckVowels(char ch) {
		System.out.println("Given character is :"+ch);
		switch (ch) {
		case 'e' :
			System.out.println("Value matched -a, e, i, o, u");
			return true;
		case 'a' :
			System.out.println("Value matched -a, e, i, o, u");
			return true;
		case 'u' :
			System.out.println("Value matched -a, e, i, o, u");
			return true;
		case 'o' :
			System.out.println("Value matched -a, e, i, o, u");
			return true;
		case 'i' :
			System.out.println("Value matched -a, e, i, o, u");
			return true;
		default :
			//System.out.println("Given character is not a vowel");
			return false;
		}
	}

}
