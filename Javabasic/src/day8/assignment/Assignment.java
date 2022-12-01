package day8.assignment;

public class Assignment {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("Hello, Everyone Good Morning");
		}
		System.out.println("Display number from 1 to 10");
		for(int i=11; i<=20;) {
			System.out.println(i);
			i++;
		}
		System.out.println("Display Uppercase Alphabates A to Z");
		char c1='A';
		for(;c1<='Z';c1++) {
			System.out.println(c1);
		}
		System.out.println("Display Lowercase Alphabates z to a");
		char c2='z';
		for(;c2>='a';c2--) {
			System.out.println(c2);
		}
		System.out.println("Display Uppercase Alphabates A to lowercase z ");
		 c1='A';
		for(;c1<='z';c1++) {
			System.out.println(c1);
	}
	}
}
 