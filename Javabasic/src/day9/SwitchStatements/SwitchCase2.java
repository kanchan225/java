package day9.SwitchStatements;

public class SwitchCase2 {

	public static void main(String[] args) {
		int month=5;
		switch (month) {
		case 1:
			System.out.println("Month is January");
			break;
		case 2:
			System.out.println("Month is February");
			break;
		case 3:
			System.out.println("Month is March");
			break;
		case 4:
			System.out.println("Month is April");
			break;
		default :
			System.out.println("Sorry either the value you have given is invalid or not match with any of the case");
			//break;
		}

	}

}
