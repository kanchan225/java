package day9.SwitchStatements;

public class SwitchCase4 {

	public static void main(String[] args) {
		int num1 =10, num2=5, res;
		char op='+';
		switch (op) {
		case '-' :
			      res= num1-num2;
			      System.out.println("num1-num2 ="+res);
			      break;
		case '+' :
		      res= num1+num2;
		      System.out.println("num1+num2 ="+res);
		      break;
		case '/' :
		      res= num1/num2;
		      System.out.println("num1/num2 ="+res);
		      break; 
		default :
		     System.out.println("Unknown Operation");
		      break;          
		}
		System.out.println("*********************************");
         cal(25, 5, '/');
	}
	public static void cal(int num1, int num2, char op) {
		int res;
		switch (op) {
		case '-' :
			      res= num1-num2;
			      System.out.println("num1-num2 ="+res);
			      break;
		case '+' :
		      res= num1+num2;
		      System.out.println("num1+num2 ="+res);
		      break;
		case '/' :
		      res= num1/num2;
		      System.out.println("num1/num2 ="+res);
		      break; 
		default :
		     System.out.println("Unknown Operation");
		      break;          
		}
	}

}
