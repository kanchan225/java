package day4.operators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a= -1, b;
		b= a++ + ++a + ++a + a;//-1+1+2+2=4
 //initial -1     1     2    2 
//final	   0      1      2    2
		System.out.println("a:" +a);//2
		System.out.println("b:" +b);//4
		System.out.println("********************************");//
		
		a=7;
		b= a-- + --a + --a + a;//7+5+4+4=20
//initial   7      5    4     4
// final	6	   5     4    4
		System.out.println(a);//4
		System.out.println(b);//20
		
		a=-21;
		b= --a + --a + --a + a + ++a + a++;//-22 -23-24-24-23-23
//initial	-22  -23   -24  -24  -23   -23
//final		-22   -23  -24  -24  -23    -22
		System.out.println(a);//-22   
		System.out.println(b);//-139
		
		
		a= -5; 
		b= a-- + a + ++a + a++ + ++a + a++ + a;//-5-6-5-5-3-3-2=-29
//initial	-5	 -6  -5    -5    -3    -3   -2
//final		-6   -6   -5    -4   -3    -2    -2
		System.out.println(a);//-2
		System.out.println(b);//-29
	}

}
