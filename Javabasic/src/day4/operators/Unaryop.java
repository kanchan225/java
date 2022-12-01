package day4.operators;

public class Unaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=50, b=a;
     System.out.println("a:"+a);//50
     System.out.println("b:"+b);//50
     
     int k=++a;
     System.out.println("k:"+k);//51
     System.out.println("a:"+a);//51
     
     int j= k++;
     System.out.println("k:"+k);//52
     System.out.println("j:"+j);//51
     
     int r=-9;
     System.out.println("r:"+ r++);//-9
     System.out.println("r:"+r);//-8
     
     System.out.println("r:"+ ++r);//-7
     System.out.println("r:"+ r);//-7
     
      int x=-9;
      System.out.println("x:"+ --x);//-10
      System.out.println("x:"+ x);//-10
      System.out.println("x:"+ x--);//-10
      System.out.println("x:"+x);//-11
     
	}

}
